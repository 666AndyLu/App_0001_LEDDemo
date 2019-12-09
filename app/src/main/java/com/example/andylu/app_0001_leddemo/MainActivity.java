package com.example.andylu.app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.example.andylu.hardlibrary.*;

public class MainActivity extends AppCompatActivity {
    private  boolean ledon = false;
    private Button button = null;
    private CheckBox checkboxled1 = null;
    private CheckBox checkboxled2 = null;
    private CheckBox checkboxled3 = null;
    private CheckBox checkboxled4 = null;

    class MyButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            ledon = !ledon;
            if (ledon) {
                button.setText("ALL OFF");
                checkboxled1.setChecked(true);
                checkboxled2.setChecked(true);
                checkboxled3.setChecked(true);
                checkboxled4.setChecked(true);
            }
            else {
                button.setText("ALL ON");
                checkboxled1.setChecked(false);
                checkboxled2.setChecked(false);
                checkboxled3.setChecked(false);
                checkboxled4.setChecked(false);
            }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED1 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED2:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED2 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED2 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED3:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED3 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED3 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED4:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED4 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    // Remove the meat
                    Toast.makeText(getApplicationContext(), "LED4 off",Toast.LENGTH_SHORT).show();
                }
                break;
            // TODO: Veggie sandwich
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkboxled1 = (CheckBox) findViewById(R.id.LED1);        checkboxled1 = (CheckBox) findViewById(R.id.LED1);
        checkboxled2 = (CheckBox) findViewById(R.id.LED2);
        checkboxled3 = (CheckBox) findViewById(R.id.LED3);
        checkboxled4 = (CheckBox) findViewById(R.id.LED4);

        button.setOnClickListener(new MyButtonListener());
/*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ledon = !ledon;
                if (ledon)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
        });*/
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
}
