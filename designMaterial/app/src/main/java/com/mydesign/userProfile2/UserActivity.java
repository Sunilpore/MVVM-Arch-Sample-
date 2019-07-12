package com.mydesign.userProfile2;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mydesign.R;
import com.mydesign.network.ApiClient;
import com.mydesign.network.ApiInterface;
import com.mydesign.network.response.profilelist.Result;
import com.mydesign.utils.Constants;
import com.mydesign.utils.abstract_method.AbstractCreator;
import com.mydesign.utils.abstract_method.AbstractPackages;
import com.mydesign.utils.abstract_method.interfaces.Rxapi;
import com.mydesign.utils.abstract_method.notify_listener.OnComplete;
import com.mydesign.utils.abstract_method.notify_listener.OnError;
import com.mydesign.utils.abstract_method.notify_listener.OnSuccess;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity implements OnSuccess, OnError, OnComplete {

    Context mContext;

    Rxapi photoReq;
    Observable<Response<ResponseBody>> statusOfDevice;
    AbstractPackages loginAbstract;

    RecyclerView userProfileRecyView;
    UserAdapter userAdapter;

    ArrayList<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mContext = this;
        results = new ArrayList<>();

        userProfileRecyView.setLayoutManager(new LinearLayoutManager(mContext));
        userAdapter = new UserAdapter(this,results);
        userProfileRecyView.setAdapter(userAdapter);
        callApi();

    }



    private void callApi() {

        statusOfDevice = getObservablenew();
        loginAbstract = AbstractCreator.initializeAbstract(Constants.AbstractVarTag.SUB_CLASS_INITIALIZE);

        if (loginAbstract != null) {
            photoReq = loginAbstract.acessApiCall(Constants.AbstractVarTag.API_CALL);
            photoReq.observableObj(statusOfDevice, mContext);
        }

    }

    private Observable<Response<ResponseBody>> getObservablenew() {
        ApiInterface mApiInterface = ApiClient.getClient();
        return mApiInterface.updateRequestList();
    }



    @Override
    public void onError(String errorMsg) {

    }

    @Override
    public void onSuccessObj(String successResponse) {

    }

    @Override
    public void onSuccessErrorObj(int errorCode, Object obj) {

    }
}
