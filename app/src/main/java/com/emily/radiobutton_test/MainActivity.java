package com.emily.radiobutton_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected RadioGroup group;
    protected RadioButton radio1,radio2,radio3,radio4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        group=(RadioGroup) findViewById(R.id.radiogroup);
        setContentView(R.layout.activity_main);
        radio1=(RadioButton)findViewById(R.id.button1);
        radio2=(RadioButton)findViewById(R.id.button2);
        radio3=(RadioButton)findViewById(R.id.button3);
        radio4=(RadioButton)findViewById(R.id.button4);
        group.setOnCheckedChangeListener(new AnswerListener());
    }
    class AnswerListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==radio2.getId()){
                showMessage(radio2.getText()+"恭喜你，答对了");
            }
            else if(i==radio1.getId()){
                    showMessage(radio1.getText()+"对不起你答错了");
                }
            else if (i==radio3.getId()){
                    showMessage(radio3.getText()+"对不起你答错了");
                }
                else {
                    showMessage(radio4.getText()+"对不起你答错了");
                }
        }
    }
    public void showMessage(String str){
        Toast toast=Toast.makeText(this,str,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,0,420);
        toast.show();
    }
}
