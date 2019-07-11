package com.mydesign.user_profile;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mydesign.R;
import com.mydesign.base.BaseActivity;
import com.mydesign.base.BaseNavigator;
import com.mydesign.base.GenericAdapter;
import com.mydesign.databinding.ActivityFetchRandomUserBinding;
import com.mydesign.databinding.ProfileViewBinding;
import com.mydesign.network.response.profilelist.Result;
import com.mydesign.network.response.profilelist.UserProfileListsModel;
import com.mydesign.utils.Utils;

public class FetchRandomUserActivity extends BaseActivity<ActivityFetchRandomUserBinding, RandomUserViewModel> implements RandomUserNavigator{

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_random_user);

    }

    @Override
    public void onError(String message) {
        Utils.getInstance().showMessage(mContext, message);
    }

    @Override
    public void onNoInternet() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_fetch_random_user;
    }

    @Override
    public Class getViewModel() {
        return RandomUserViewModel.class;
    }

    @Override
    public BaseNavigator getNavigatorReference() {
        return FetchRandomUserActivity.this;
    }

    @Override
    public void onBinding() {
        mContext = this;
        mBinding.setViewModel(mViewModel);
        mViewModel.getUserListCall();
        setUpListRecyclerView();

    }

    @Override
    public void onDecline() {

    }

    @Override
    public void onConnect() {

    }

    private void setUpListRecyclerView(){
        mBinding.userProfileRecycler.setLayoutManager(new LinearLayoutManager(mContext));
        GenericAdapter <Result, ProfileViewBinding> adapter =
                new GenericAdapter<Result, ProfileViewBinding>(mContext) {
                    @Override
                    public int getLayoutId() {
                        return R.layout.profile_view;
                    }

                    @Override
                    public void onBindView(ProfileViewBinding binding, Result item, int position) {

                        binding.setModel(item);
                    }
                };
        mBinding.userProfileRecycler.setAdapter(adapter);
        mViewModel.getUserList().observe(this,adapter::updateData);
    }


}
