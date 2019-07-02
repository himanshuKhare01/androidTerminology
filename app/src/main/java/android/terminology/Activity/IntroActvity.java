package android.terminology.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.terminology.R;

public class IntroActvity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(new Intent(IntroActvity.this,MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
