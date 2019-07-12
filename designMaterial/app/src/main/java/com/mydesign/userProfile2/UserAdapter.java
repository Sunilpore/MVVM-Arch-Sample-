package com.mydesign.userProfile2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mydesign.R;
import com.mydesign.network.response.profilelist.Result;
import com.mydesign.user_profile.adapter.UserProfileAdapter;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ProfileViewHolder > {

    Context mContext;
    ArrayList<Result> results;

    public UserAdapter(Context context, ArrayList<Result> res) {
         mContext = context;
         results = res;
    }

    @NonNull
    @Override
    public UserAdapter.ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.prof_view2,parent,false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ProfileViewHolder holder, int position) {

        Result result = results.get(position);


    }

    @Override
    public int getItemCount() {
        return results.size();
    }


    static class ProfileViewHolder extends RecyclerView.ViewHolder {

        TextView usrName;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);

            usrName = itemView.findViewById(R.id.profile_name);
        }

    }


}
