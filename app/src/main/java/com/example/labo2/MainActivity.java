package com.example.labo2;

import static com.example.labo2.utils.TextUtils.getCharsCount;
import static com.example.labo2.utils.TextUtils.getNumbersCount;
import static com.example.labo2.utils.TextUtils.getWordsCount;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labo2.utils.TextUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;
    EditText edUserInput;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvOutput = findViewById(R.id.tvOutput);

        ArrayList<String> selectionOptionsList = new ArrayList<>();
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {

        String userInputText = edUserInput.getText().toString();
        String selection = this.ddSelection.getSelectedItem().toString();

        if (userInputText.isEmpty()) {
            String resValue = getResources().getString(R.string.dff_format);
            Toast.makeText(this, String.valueOf(resValue), Toast.LENGTH_SHORT).show();
        }
        else if (selection.equalsIgnoreCase(getResources().getString(R.string.words_selection))) {
            int count = TextUtils.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(TextUtils.getWordsCount(userInputText)));
        }
        else if (selection.equalsIgnoreCase(getResources().getString(R.string.char_selection))) {
            int count = TextUtils.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        else if (selection.equalsIgnoreCase(getResources().getString(R.string.numbers_selection))) {
            tvOutput.setText(String.valueOf(TextUtils.getNumbersCount(userInputText)));
        }
        else {
            this.tvOutput.setText(R.string.dff_format);
        }
    }
}