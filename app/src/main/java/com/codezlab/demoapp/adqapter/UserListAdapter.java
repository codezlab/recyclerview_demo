package com.codezlab.demoapp.adqapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codezlab.demoapp.R;
import com.codezlab.demoapp.Student;
import com.codezlab.demoapp.model.User;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {

    private List<User> list;

    public UserListAdapter(List<User> list){
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout_single_card_v2,parent,false);
        UserViewHolder sv=new UserViewHolder(v);
        return sv;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

       User user = list.get(position);
       holder.nameTV.setText(user.getFirstName());
       //holder.ageTV.setText(String.valueOf(student.getAge()));
       //holder.streamTV.setText(student.getStream());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{

        private TextView nameTV;
        private TextView ageTV;
        private TextView streamTV;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameTV = itemView.findViewById(R.id.nameTV);
            this.ageTV = itemView.findViewById(R.id.ageTV);
            this.streamTV = itemView.findViewById(R.id.streamTV);
        }
    }

}
