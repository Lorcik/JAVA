package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void calculateResult(View view) {
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();

        if (!input1.isEmpty() && !input2.isEmpty()) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double result = num1 + num2; // tutaj możesz zmienić operację na dowolną inną (+, -, *, /, etc.)

            resultTextView.setText(String.valueOf(result));
        } else {
            resultTextView.setText("Please enter valid numbers in both fields.");
        }
    }
}
