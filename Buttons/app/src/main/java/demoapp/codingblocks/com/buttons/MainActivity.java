package demoapp.codingblocks.com.buttons;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt1,bt2,bt3,bt4;
    int a=10,b=10;
    TextView tv;
    EditText t1,t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.addbutton); //Defining button1 otherwise it will get garbage value
        bt2=findViewById(R.id.subbutton);
        bt3=findViewById(R.id.mulbutton);
        bt4=findViewById(R.id.divbutton);
        tv=findViewById(R.id.tex);
        t1=findViewById(R.id.edit1);
        t2=findViewById(R.id.edit2);
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Button 1 click!!",Toast.LENGTH_LONG).show();
//                //We have to mention MainActivity otherwise it will take reference from View class instead of MainActivity class
//            }
//        });
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(!t1.getText().toString().equals("")&&!t2.getText().toString().equals("")){
            a=Integer.parseInt(t1.getText().toString());
            b=Integer.parseInt(t2.getText().toString());
        }
        else{
            Toast.makeText(this,"Number must not be empty",Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.addbutton) {
            tv.setText(a + b + "");
            Toast.makeText(this, "Button1click", Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.subbutton) {
            tv.setText(a - b + "");
            Toast.makeText(this, "Button2click", Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.mulbutton) {
            tv.setText(a * b + "");
            Toast.makeText(this, "Button3click", Toast.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.divbutton) {
            tv.setText(a / b + "");
            Toast.makeText(this, "Button4click", Toast.LENGTH_SHORT).show();
        }
    }

//    public void button2Click(View view) {
//        Toast.makeText(this,"Button2click!!",Toast.LENGTH_SHORT).show();
//
//    }
//
//    public void button3Click(View view) {
//        Toast.makeText(this,"Button3click!!",Toast.LENGTH_SHORT).show();
//        view.setBackgroundResource(R.color.green);
//    }
//
//    public void button4click(View view) {
//        Toast.makeText(this,"Button4click!!",Toast.LENGTH_SHORT).show();
//        view.setBackgroundResource(R.color.cyan);
//    }

}
