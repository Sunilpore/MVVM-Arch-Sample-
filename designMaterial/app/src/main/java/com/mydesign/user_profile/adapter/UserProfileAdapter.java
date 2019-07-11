package com.mydesign.user_profile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mydesign.base.IItemListener;
import com.mydesign.databinding.ProfileViewBinding;
import com.mydesign.network.response.profilelist.Result;

import java.util.ArrayList;

public class UserProfileAdapter extends RecyclerView.Adapter<UserProfileAdapter.ProfileViewHolder > {

    private LayoutInflater mInflater;
    private ArrayList<? extends IItemListener> itemList;

    public UserProfileAdapter(Context context, ArrayList<? extends IItemListener> list) {
        itemList = list;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProfileViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProfileViewBinding binding = ProfileViewBinding.inflate(mInflater, parent, false);
        return new ProfileViewHolder (binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {

        Result result = (Result) holder.binding.getModel();

        holder.binding.setModel(result);
        }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        private ProfileViewBinding binding;

        public ProfileViewHolder (@NonNull ProfileViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
