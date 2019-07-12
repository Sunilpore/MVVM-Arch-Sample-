package com.mydesign.network;

import com.mydesign.network.response.profilelist.UserProfileListsModel;
import io.reactivex.Observable;
import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.*;

import java.util.ArrayList;

public interface ApiInterface {

    @GET("?results=10")
    Single<UserProfileListsModel> updateRequest();

    @GET("?results=10")
    Observable<Response<ResponseBody>> updateRequestList();

}
