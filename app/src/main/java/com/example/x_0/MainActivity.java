package com.example.x_0;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    String krest[][] = {{"","",""}, {"","",""},{"","",""}};
    String znak, znak1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        znak = "X";
        znak1="0";

    }
    public int player = 1;
    public  String num;
    public void onNumberClick(View view){
        if(player ==1 ){
            num ="X";
            player = 0;
        }
        else{
            num = "0";
            player =1;
        }
        TextView textView1 = findViewById(R.id.textView1);

        Button button = (Button) view;
        button.setText(num);
        button.setClickable(false);

        switch (view.getId()) {
            case R.id.button1:
                krest[0][0] = num;
                break;
            case R.id.button2:
                krest[0][1] = num;
                break;
            case R.id.button3:
                krest[0][2] = num;
                break;
            case R.id.button4:
                krest[1][0] = num;
                break;
            case R.id.button5:
                krest[1][1] = num;
                break;
            case R.id.button6:
                krest[1][2] = num;
                break;
            case R.id.button7:
                krest[2][0] = num;
                break;
            case R.id.button8:
                krest[2][1] = num;
                break;
            case R.id.button9:
                krest[2][2] = num;
                break;



        }
        proverka();
    }

    public void proverka(){


                if(krest[0][0] !="" && krest[0][1]!="" && krest[0][2] !="" && krest[1][0] !="" && krest[1][1]!="" && krest[1][2] !="" && krest[2][0] !="" && krest[2][1]!="" && krest[2][2] !="")
                {
                    TextView textView1 = findViewById(R.id.textView1);
                    textView1.setText(" ничья!!!!!");
                    Clickabl();
                }


            for(int i=0; i<3; i++){
            if (krest[i][0] ==num && krest[i][1]==num && krest[i][2] ==num) {
                TextView textView1 = findViewById(R.id.textView1);
                textView1.setText(num + " победил!!!!!");
                Clickabl();
            }else
            if (krest[0][i] ==num && krest[1][i]==num && krest[2][i]==num) {
                TextView textView1 = findViewById(R.id.textView1);
                textView1.setText(num + " победил!!!!!");
                Clickabl();
            }


        }
        if (krest[0][0] ==num && krest[1][1]==num && krest[2][2]==num) {
            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText(num + " победил!!!!!");
            Clickabl();
        }
        if (krest[1][1]==num && krest[0][2]==num &&  krest[2][0]==num ) {
            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText(num + " победил!!!!!");
            Clickabl();
        }
    }

    private void Clickabl() {
        findViewById(R.id.button1).setClickable(false);
        findViewById(R.id.button2).setClickable(false);
        findViewById(R.id.button3).setClickable(false);
        findViewById(R.id.button4).setClickable(false);
        findViewById(R.id.button5).setClickable(false);
        findViewById(R.id.button6).setClickable(false);
        findViewById(R.id.button7).setClickable(false);
        findViewById(R.id.button8).setClickable(false);
        findViewById(R.id.button9).setClickable(false);

    }

    public void Restart(View view) {
        TextView textView1 = findViewById(R.id.textView1);

        Button button = (Button)view;
        textView1.setText("");
        for (int i=0 ; i<3; i++){
            for (int j=0 ; j<3; j++){
                krest[i][j]="";
            }
        }
        button1 = findViewById(R.id.button1);
        button1.setText("");
        button2 = findViewById(R.id.button2);
        button2.setText("");
        button3 = findViewById(R.id.button3);
        button3.setText("");
        button4 = findViewById(R.id.button4);
        button4.setText("");
        button5 = findViewById(R.id.button5);
        button5.setText("");
        button6 = findViewById(R.id.button6);
        button6.setText("");
        button7 = findViewById(R.id.button7);
        button7.setText("");
        button8 = findViewById(R.id.button8);
        button8.setText("");
        button9 = findViewById(R.id.button9);
        button9.setText("");
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);
        player = 1;
    }


}