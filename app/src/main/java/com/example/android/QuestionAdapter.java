package com.example.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder> {

    private List<QuestionModelClass> myModelList;
    private Context context;

    public QuestionAdapter(List<QuestionModelClass> myModelList, Context context) {
        this.myModelList = myModelList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.questions_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.MyViewHolder holder, int position) {


        QuestionModelClass modelClass = myModelList.get(position);
        holder.username.setText(modelClass.getUsername().toString());
        holder.email.setText(modelClass.getEmail().toString());
        holder.heading.setText(modelClass.getHeading().toString());
        holder.answer.setText(modelClass.getAnswer().toString());

    }



    @Override
    public int getItemCount() {
        return myModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // Define your views here
        TextView username;
        TextView email;
        TextView heading;
        TextView answer;

        public MyViewHolder(View itemView) {
            super(itemView);

            // Initialize your views here
            username = itemView.findViewById(R.id.username_queTab);
            email = itemView.findViewById(R.id.id_queTab);
            heading = itemView.findViewById(R.id.heading_queTab);
            answer = itemView.findViewById(R.id.answer_queTab);
        }
    }


}
