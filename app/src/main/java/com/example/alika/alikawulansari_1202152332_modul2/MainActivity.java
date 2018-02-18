package com.example.alika.alikawulansari_1202152332_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(this,"Alika Wulansari_1202152332", Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
}
