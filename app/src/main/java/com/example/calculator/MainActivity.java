package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add,sub,mul,div;
    EditText editText1,editText2;
    TextView textView;
    int num2,num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         add=findViewById(R.id.add1);
         sub=findViewById(R.id.sub);
         mul=findViewById(R.id.mul);
         div=findViewById(R.id.div);
         editText1=findViewById(R.id.number1);
         editText2=findViewById(R.id.number2);
         textView=findViewById(R.id.ans);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);

    }
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals(" ")){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());



    }



    @Override
    public void onClick(View view) {
        num1=getIntFromEditText(editText1);
        num2=getIntFromEditText(editText2);
        switch (view.getId()){
            case R.id.add1:
                textView.setText("Answer="+(num1+num2));
                break;
            case R.id.sub:
                textView.setText("Answer="+(num1-num2));
                break;
            case R.id.mul:
                textView.setText("Answer="+(num1*num2));
                break;
            case R.id.div:
                textView.setText("Answer="+((float)num1/(float) num2));
                break;
        }

    }
}