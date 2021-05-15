package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  ImageButton dropdown_arrow;
  ConstraintLayout strutureItemHolder;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    dropdown_arrow= findViewById(R.id.img_structure_dropdown_arrow);
    strutureItemHolder= findViewById(R.id.structure_container);
    dropdown_arrow.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        strutureItemHolder.setVisibility(View.VISIBLE);
      }
    });
  }

}
