//package codingblocks.com.layouts2;
//
//import android.os.Bundle;
//import android.support.v4.content.res.ResourcesCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//
//public class MainActivity extends AppCompatActivity {
//    LinearLayout ll;
//    ImageView imageView[]=new ImageView[3];
//    @Override
//    protected void onCreate( Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ll=new LinearLayout(this);
//        ll.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
//        ll.setOrientation(LinearLayout.VERTICAL);
//        for(int i=0;i<3;i++){
//            imageView[i]=new ImageView(this);
//            imageView[i].setImageResource(R.drawable.androidimage);
//            imageView[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,1.0f));
//            ll.addView(imageView[i]);
//        }
////        imageView=new ImageView(this);
////        setContentView(R.layout.activity_main);
////        imageView=findViewById(R.id.ima)
////        imageView.setImageResource(R.drawable.img);
//        setContentView(ll);
////        imageView.setImageDrawable(ResourcesCompat.getDrawable(this.getResources(),R.drawable.Android_PNG_Background_Image,null));
//    }
//}
//
//
//
//
//
