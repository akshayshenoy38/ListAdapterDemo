package com.example.akshay.listadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMyList;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        lvMyList = (ListView) findViewById(R.id.lvMyList);

        Person person1 = new Person("name1","date1","sex1");
        Person person2 = new Person("name2","date2","sex2");
        Person person3 = new Person("name3","date3","sex3");
        Person person4 = new Person("name4","date4","sex4");
        Person person5 = new Person("name5","date5","sex5");
        Person person6 = new Person("name6","date6","sex6");
        Person person7 = new Person("name7","date7","sex7");
        Person person8 = new Person("name8","date8","sex8");
        Person person9 = new Person("name9","date9","sex9");
        Person person10 = new Person("name9","date9","sex9");
        Person person11 = new Person("name9","date9","sex9");
        Person person12 = new Person("name9","date9","sex9");

        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);
        peopleList.add(person5);
        peopleList.add(person6);
        peopleList.add(person7);
        peopleList.add(person8);
        peopleList.add(person9);
        peopleList.add(person10);
        peopleList.add(person11);
        peopleList.add(person12);

        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adapter_view_layout,peopleList);
        lvMyList.setAdapter(adapter);


    }
}
