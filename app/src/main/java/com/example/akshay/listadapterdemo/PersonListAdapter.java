package com.example.akshay.listadapterdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akshay on 26-02-2018.
 */

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    public PersonListAdapter(@NonNull Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, (List<Person>) objects);
        mContext = context;
        mResource = resource;
    }

    static class ViewHolder {
        TextView name;
        TextView birthday;
        TextView sex;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String birthday = getItem(position).getDate();
        String sex = getItem(position).getSex();

        Person person = new Person(name,birthday,sex);
        final View result;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);


        ViewHolder holder = new ViewHolder();
        holder.name = (TextView) convertView.findViewById(R.id.tvName);
        holder.birthday = (TextView) convertView.findViewById(R.id.tvBirthday);
        holder.sex = (TextView) convertView.findViewById(R.id.tvSex);
        convertView.setTag(holder);

        

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvBirthday = convertView.findViewById(R.id.tvBirthday);
        TextView tvSex = convertView.findViewById(R.id.tvSex);


        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;



    }
}
