package com.example.myactivitygojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myactivitygojek.R;

public class GofoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);
        final EditText etData1 = (EditText) findViewById(R.id.et_data1);
        final EditText etData2 = (EditText) findViewById(R.id.et_data2);
        final EditText etData3 = (EditText) findViewById(R.id.et_data3);
        Button btOrder = (Button) findViewById(R.id.bt_order);

        btOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(GofoodActivity.this,HasilActivity.class);
              intent.putExtra("data1",etData1.getText().toString());
                intent.putExtra("data2",etData2.getText().toString());
                intent.putExtra("data3",etData3.getText().toString());
                startActivity(intent);
            }
        });
    }
}

