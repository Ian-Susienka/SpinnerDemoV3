package com.example.spinnerdemov3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //Airport Strings
    String aTemp1 = "FUK";
    String aTemp2 = "SEX";
    String aTemp3 = "ABC";
    String aTemp4 = "DAB";
    String aTemp5 = "ATL";
    String aTemp6 = "PHX";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.Airports);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.DepartureAirports, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.ArivalAirports, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        //Spinner 1 item 1 combos
        if (spinner.getSelectedItem().toString() == aTemp1 && spinner2.getSelectedItem().toString() == aTemp4)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp1 && spinner2.getSelectedItem().toString() == aTemp5)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp1 && spinner2.getSelectedItem().toString() == aTemp6)
        {

        }

        //Spinner 1 item 2 combos
        if (spinner.getSelectedItem().toString() == aTemp2 && spinner2.getSelectedItem().toString() == aTemp4)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp2 && spinner2.getSelectedItem().toString() == aTemp5)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp2 && spinner2.getSelectedItem().toString() == aTemp6)
        {

        }

        //Spinner 1 item 3 combos
        if (spinner.getSelectedItem().toString() == aTemp3 && spinner2.getSelectedItem().toString() == aTemp4)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp3 && spinner2.getSelectedItem().toString() == aTemp5)
        {

        }
        if (spinner.getSelectedItem().toString() == aTemp3 && spinner2.getSelectedItem().toString() == aTemp6)
        {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String Text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),Text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
