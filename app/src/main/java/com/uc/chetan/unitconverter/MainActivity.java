package com.uc.chetan.unitconverter;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.about){
            Toast.makeText(this, "Chetan, Anushree, Monali", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tempo=findViewById(R.id.tempbox);
        final RadioButton cel2far=findViewById(R.id.c2f);
        final RadioButton far2cel=findViewById(R.id.f2c);
        final Button con=findViewById(R.id.conbtn);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tempo.getText().toString().trim())){
                    Toast.makeText(MainActivity.this, "Enter proper value!", Toast.LENGTH_SHORT).show();
                    return;
                }
                double  kika=Double.valueOf(tempo.getText().toString().trim());
                if(far2cel.isChecked())
                    kika=UnitConverter.farenheit2celsius(kika);
                else if(cel2far.isChecked()) kika=UnitConverter.celsius2farenheit(kika);
                tempo.setText(Double.toString(kika));
            }
        });
    }
}
