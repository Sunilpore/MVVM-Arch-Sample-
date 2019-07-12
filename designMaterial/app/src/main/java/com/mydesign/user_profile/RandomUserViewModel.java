package com.mydesign.user_profile;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.mydesign.base.BaseViewModel;
import com.mydesign.network.DataProvider;
import com.mydesign.network.response.profilelist.Result;
import com.mydesign.network.response.profilelist.UserProfileListsModel;

import java.util.ArrayList;

public class RandomUserViewModel extends BaseViewModel<RandomUserNavigator> {

    private static final String TAG = "RandmTAG";
    private MutableLiveData<ArrayList<Result>> userLists = new MutableLiveData<>();
    private UserProfileListsModel userProfileListsModel;


    public MutableLiveData<ArrayList<Result>> getUserList() {
        return userLists;
    }


    public void getUserListCall(){

        mDisposable.add(DataProvider.getInstance().fetchUserProfileList(response -> {
            dialogVisibility.setValue(false);
            Log.d(TAG,"gson: "+new Gson().toJson(response));

            getUserList().setValue(response);

        }, this::checkError));

    }

    @Override
    protected void checkError(Throwable throwable) {
        super.checkError(throwable);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }


}
