package com.example.android;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Question extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_question, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView_forum);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<QuestionModelClass> myModelList = createMyModelList();

        // Create and set the adapter
        QuestionAdapter myAdapter = new QuestionAdapter(myModelList, getContext());
        recyclerView.setAdapter(myAdapter);
        return rootView;
    }
    public static List<QuestionModelClass> createMyModelList() {
        List<QuestionModelClass> myModelList = new ArrayList<>();


        // Add four entries to the list
        myModelList.add(new QuestionModelClass("Simran Shaikh", "simranshaikh@gmail.com", "Which language is better Java Or Kotlin?", "Java and Kotlin are both awesome programming language that have some significant differences.I hope this article was informative. Happy Learning."));
        myModelList.add(new QuestionModelClass("Rohan Pardule", "rohan@gmail.com", "Which language is better Java Or Kotlin?", "Java and Kotlin are both awesome programming language that have some significant differences. I hope this article was informative. Happy Learning."));
        myModelList.add(new QuestionModelClass("Ayushi Thakur", "ayushi@gmail.com", "Which language is better Java Or Kotlin?", "Java and Kotlin are both awesome programming language that have some significant differences. I hope this article was informative. Happy Learning."));
        myModelList.add(new QuestionModelClass("Sumedh Pawar", "sumedh@gmail.com", "Which language is better Java Or Kotlin?", "Java and Kotlin are both awesome programming language that have some significant differences. I hope this article was informative. Happy Learning."));

        return myModelList;
    }
}