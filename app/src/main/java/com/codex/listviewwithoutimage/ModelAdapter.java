package com.codex.listviewwithoutimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ModelAdapter extends ArrayAdapter<Model> {
    private Context mContext;
    private List<Model> modelList;
    public ModelAdapter(Context context, List<Model> modelList) {
        super(context, R.layout.list_view_model, modelList);
        mContext=context;
        this.modelList=modelList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(mContext);

        convertView= inflater.inflate(R.layout.list_view_model,parent,false);

        Model model= modelList.get(position);

        TextView doctorName=convertView.findViewById(R.id.doctorNameListView);
        TextView doctorDetails=convertView.findViewById(R.id.doctorDetailsListView);
        TextView doctorDate=convertView.findViewById(R.id.doctorDateListView);
        TextView doctorPhoneNo=convertView.findViewById(R.id.doctorPhoneListView);
        TextView doctorEmail=convertView.findViewById(R.id.doctorEmailListView);


        doctorName.setText(model.getDoctorName());
        doctorDetails.setText(model.getDoctorDetails());
        doctorDate.setText(model.getDoctorDate());
        doctorPhoneNo.setText(model.getDoctorPhoneNo());
        doctorEmail.setText(model.getDoctorEmail());

        return convertView;
    }
}
