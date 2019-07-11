package com.mydesign.base;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.mydesign.R;

import java.util.ArrayList;

public class TestActivity {

}

/*public class TestActivity extends BaseActivity<ActivityTestBinding, TestViewModel> implements TestNavigator {


    @Override
    public void onError(String message) {

    }

    @Override
    public void onNoInternet() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    public Class getViewModel() {
        return TestViewModel.class;
    }

    @Override
    public BaseNavigator getNavigatorReference() {
        return TestActivity.this;
    }

    @Override
    public void onBinding() {
        ArrayList<DashDetailsResModel> list = new ArrayList<>();
        DashDetailsResModel model = new DashDetailsResModel();
        model.setAreaName("Vikhroli");
        list.add(model);
        DashDetailsResModel model1 = new DashDetailsResModel();
        model1.setAreaName("Bhandup");
        list.add(model1);
        GenericAdapter adapter = new GenericAdapter<DashDetailsResModel, ItemRequestDetailsBinding>(mContext) {
            @Override
            public int getLayoutId() {
                return R.layout.item_request_details;
            }

            @Override
            public void onBindView(ItemRequestDetailsBinding binding, DashDetailsResModel item, int position) {
//                binding.txtCustomerName.setText(item.getAreaName());
            }
        };
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mBinding.recyclerView.setAdapter(adapter);
        adapter.updateData(list);
    }
}*/
