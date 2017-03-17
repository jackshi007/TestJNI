package zsf.com.android.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("myTestjni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);
        TestJNI mJni = new TestJNI();
        boolean bInit = mJni.Init();
        if (bInit){
            int sum =mJni.Add(100,150);
            textView.setText("Sum="+sum+"\n");
        }else {
            textView.setText("Init JNI failed.");
        }
        mJni.Destroy();
    }
}
