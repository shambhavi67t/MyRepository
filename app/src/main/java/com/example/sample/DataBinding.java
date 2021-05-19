package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.sample.databinding.ActivityDataBindingBinding;

import java.util.ArrayList;
import java.util.List;

public class DataBinding extends AppCompatActivity {
ActivityDataBindingBinding activityDataBindingBinding;
Student student;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
   // setContentView(R.layout.activity_data_binding);
    activityDataBindingBinding= DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
    activityDataBindingBinding.setStudent(new Student("shambhavi","tapsale",12,true));

    //handle null pointer-- prints default values
    activityDataBindingBinding.setStudent(null);

    //doesnt display lastname as it is null
    activityDataBindingBinding.setStudent(new Student("shambhavi",null,12,true));

    List<Integer> marksList= new ArrayList<>();
    marksList.add(12);
    marksList.add(33);
    activityDataBindingBinding.setMarksList(marksList);
    activityDataBindingBinding.setIndex(1);
    activityDataBindingBinding.button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Log.d("button","clicked");
       Toast.makeText(DataBinding.this,"button clickedd",Toast.LENGTH_LONG).show();
      }
    });

  }
}
