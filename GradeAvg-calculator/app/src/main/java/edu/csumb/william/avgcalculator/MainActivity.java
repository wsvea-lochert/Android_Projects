package edu.csumb.william.avgcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAVG();
    }

    private void initAVG(){
        final EditText grade1 = (EditText)findViewById(R.id.grade1);
        final EditText grade2 = (EditText)findViewById(R.id.grade2);
        final Button btnCalc = (Button)findViewById(R.id.btnCalc);
        final TextView finalGrade = (TextView)findViewById(R.id.finalGrade);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstGrade = Integer.parseInt(grade1.getText().toString());
                int secondGrade = Integer.parseInt(grade2.getText().toString());
                int finalG = (firstGrade + secondGrade)/2;
                String letterGrade;

                if(finalG > 89){
                    letterGrade = "A";
                }
                else if(finalG > 79){
                    letterGrade = "B";
                }
                else if(finalG > 69){
                    letterGrade = "C";
                }
                else{
                    letterGrade = "F";
                }

                finalGrade.setText(String.valueOf(finalG) + "(" + letterGrade + ")");
            }
        });
    }
}
