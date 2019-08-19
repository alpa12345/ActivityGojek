package com.example.myactivitygojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myactivitygojek.R;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);
        TextView tvData3 = (TextView) findViewById(R.id.tv_data3);
        Button btCancel = (Button) findViewById(R.id.bt_cancel);

        if (getIntent()!=null){
            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
            tvData3.setText(getIntent().getStringExtra("data3"));
        }else {
            System.out.println("Gagal bray");
        }
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HasilActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}