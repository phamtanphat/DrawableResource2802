package khoapham.ptp.phamtanphat.drawableresource;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgClipDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClipDrawable = findViewById(R.id.imageviewClipDrawable);



        imgClipDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
                    @Override
                    public void onTick(long time) {

                        imgClipDrawable.setImageLevel(imgClipDrawable.getDrawable().getLevel() + 1000);
                        Log.d("BBB",time + "" );
                    }

                    @Override
                    public void onFinish() {
                        imgClipDrawable.setImageLevel(imgClipDrawable.getDrawable().getLevel() + 1000);
                        if(imgClipDrawable.getDrawable().getLevel() == 10000){
                            imgClipDrawable.setImageLevel(0);
                            this.start();
                        }

                    }
                };
                countDownTimer.start();
            }
        });
    }
}
