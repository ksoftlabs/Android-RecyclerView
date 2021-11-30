package com.ksoftlabs.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter(List<ModelClass>userList){
        this.userList=userList;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String rname=userList.get(position).getUsername();
        String rtime=userList.get(position).getTime();
        String rmsg=userList.get(position).getMessage();
        holder.setData(rname,rtime,rmsg);
;
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView name;
        private TextView time;
        private TextView message;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.username);
            time=itemView.findViewById(R.id.time);
            message=itemView.findViewById(R.id.message);
        }

        public void setData(String rname, String rtime, String rmsg) {
            name.setText(rname);
            time.setText(rtime);
            message.setText(rmsg);
        }
    }
}
