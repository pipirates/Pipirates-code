package com.example.mylogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class screen_2 extends AppCompatActivity
{
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
        spinner = (Spinner)findViewById(R,id.spinner);

        List<String> list=new ArrayList<String>();
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");
        list.add("kfmldms");

        ArrayAdapter<String> arrayAdapter = new arrayAdapter<String>(this.android.R.layout.simple_list_item_1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener())
        {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                spinner.setSelection(i);
        }

            }
        };





    }
}
