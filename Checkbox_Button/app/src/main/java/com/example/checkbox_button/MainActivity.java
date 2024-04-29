package com.example.checkbox_button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxReading, checkboxDrawing, checkboxGaming, checkboxTraveling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxReading = findViewById(R.id.checkboxReading);
        checkboxDrawing = findViewById(R.id.checkboxDrawing);
        checkboxGaming = findViewById(R.id.checkboxGaming);
        checkboxTraveling = findViewById(R.id.checkboxTraveling);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearCheckboxes();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitCheckboxes();
            }
        });
    }

    private void clearCheckboxes() {
        checkboxReading.setChecked(false);
        checkboxDrawing.setChecked(false);
        checkboxGaming.setChecked(false);
        checkboxTraveling.setChecked(false);
    }

    private void submitCheckboxes() {
        StringBuilder selectedHobbies = new StringBuilder("Selected Hobbies: ");

        if (checkboxReading.isChecked()) {
            selectedHobbies.append("Reading, ");
        }
        if (checkboxDrawing.isChecked()) {
            selectedHobbies.append("Drawing, ");
        }
        if (checkboxGaming.isChecked()) {
            selectedHobbies.append("Gaming, ");
        }
        if (checkboxTraveling.isChecked()) {
            selectedHobbies.append("Traveling, ");
        }

        if (selectedHobbies.length() > 0) {
            selectedHobbies.delete(selectedHobbies.length() - 2, selectedHobbies.length());
        }

        Toast.makeText(this, selectedHobbies.toString(), Toast.LENGTH_LONG).show();
    }
}