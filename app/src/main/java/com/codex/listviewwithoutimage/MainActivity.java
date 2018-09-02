package com.codex.listviewwithoutimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ModelAdapter modelAdapter;
    List<Model> modelList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.list_view_without_image);
        testData();
        modelAdapter= new ModelAdapter(this,modelList);
        listView.setAdapter(modelAdapter);

    }

    public void testData(){
        modelList.add(new Model("Doctor Strange","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor who","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));
        modelList.add(new Model("Doctor Name","Cardiologist","15/15/12","01521434233","doctor@gmail"));

    }
}
