package demoapp.codingblocks.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btplus,btminus,btdiv,btmul,btdot,btc;
    EditText et1,et2;
    TextView t;
    float a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0=findViewById(R.id.button0);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
        bt5=findViewById(R.id.button5);
        bt6=findViewById(R.id.button6);
        bt7=findViewById(R.id.button7);
        bt8=findViewById(R.id.button8);
        bt9=findViewById(R.id.button9);
        btdiv=findViewById(R.id.buttondivide);
        btmul=findViewById(R.id.buttonmultiply);
        btminus=findViewById(R.id.buttonminus);
        btplus=findViewById(R.id.buttonplus);
        btdot=findViewById(R.id.buttondot);
        btc=findViewById(R.id.buttonclear);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        t=findViewById(R.id.t);
//        et1.setText(et1.getText().toString().substring(0,et1.length()-1));



        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btdot.setOnClickListener(this);
        btplus.setOnClickListener(this);
        btminus.setOnClickListener(this);
        btdiv.setOnClickListener(this);
        btmul.setOnClickListener(this);
        btc.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(!et1.getText().toString().equals("")&&!et2.getText().toString().equals("")){
            a=Float.parseFloat(et1.getText().toString());
            b=Float.parseFloat(et2.getText().toString());
        }
        if(v.getId()==R.id.button1){
            if(et1.hasFocus())
        et1.setText(et1.getText()+ bt1.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt1.getText().toString());

        }

        if(v.getId()==R.id.button2){
            if(et1.hasFocus())
                et1.setText(et1.getText()+"2");
            if(et2.hasFocus())
                et2.setText(et2.getText()+"2");
        }

        if(v.getId()==R.id.button3){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt3.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt3.getText().toString());
        }

        if(v.getId()==R.id.button4){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt4.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt4.getText().toString());
        }

        if(v.getId()==R.id.button5){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt5.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt5.getText().toString());
        }

        if(v.getId()==R.id.button6){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt6.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt6.getText().toString());
        }

        if(v.getId()==R.id.button7){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt7.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt7.getText().toString());
        }

        if(v.getId()==R.id.button8){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt8.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt8.getText().toString());
        }

        if(v.getId()==R.id.button9){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt9.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt9.getText().toString());
        }

        if(v.getId()==R.id.button0){
            if(et1.hasFocus())
                et1.setText(et1.getText()+bt0.getText().toString());
            if(et2.hasFocus())
                et2.setText(et2.getText()+bt0.getText().toString());
        }

        if(v.getId()==R.id.buttonplus)
            t.setText(a + b + "");

        if(v.getId()==R.id.buttonminus)
            t.setText(a - b+ "");
        if(v.getId()==R.id.buttondivide)
            t.setText(a / b + "");
        if(v.getId()==R.id.buttonclear){
            t.setText("");
            et1.setText("");
            et2.setText("");
        }
        if(v.getId()==R.id.buttonmultiply)
            t.setText(a * b + "");
        if(v.getId()==R.id.buttondot){
            if(et1.hasFocus()) {

                et1.setText(et1.getText() + btdot.getText().toString());
            }
            if(et2.hasFocus())
                et2.setText(et2.getText()+btdot.getText().toString());
        }


    }
}
