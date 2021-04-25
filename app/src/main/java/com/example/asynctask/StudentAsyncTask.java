package com.example.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StudentAsyncTask extends AsyncTask<Void,Void,ArrayList> {
    private ListView listView;
    private Context context;

    public StudentAsyncTask(ListView listView, Context context) {
        this.listView = listView;
        this.context = context;
    }


    @Override
    protected ArrayList doInBackground(Void... voids) {
        StudentDao dao = new StudentDao();
        ArrayList<Student> students = dao.getAllStudents();
        return students;
    }

    @Override
    protected void onPostExecute(ArrayList arrayList) {
        super.onPostExecute(arrayList);
        StudentAdapter studentAdapter = new StudentAdapter(context, arrayList);
        listView.setAdapter(studentAdapter);
    }
}
