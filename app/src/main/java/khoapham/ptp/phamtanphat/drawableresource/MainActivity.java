package khoapham.ptp.phamtanphat.drawableresource;

import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgClipDrawable , imgLevellist;
    Button btnCong,btnTru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imgClipDrawable = findViewById(R.id.imageviewClipDrawable);
//
//
//
//        imgClipDrawable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
//                    @Override
//                    public void onTick(long time) {
//
//                        imgClipDrawable.setImageLevel(imgClipDrawable.getDrawable().getLevel() + 1000);
//                        Log.d("BBB",time + "" );
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        imgClipDrawable.setImageLevel(imgClipDrawable.getDrawable().getLevel() + 1000);
//                        if(imgClipDrawable.getDrawable().getLevel() == 10000){
//                            imgClipDrawable.setImageLevel(0);
//                            this.start();
//                        }
//
//                    }
//                };
//                countDownTimer.start();
//            }
//        });
        imgLevellist = findViewById(R.id.imageviewEnergy);
        btnCong = findViewById(R.id.buttonCong);
        btnTru = findViewById(R.id.buttonTru);


        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLevellist.getDrawable().getLevel() == 100){
                    imgLevellist.setImageLevel(0);
                }else{
                    imgLevellist.setImageLevel(imgLevellist.getDrawable().getLevel() + 10);
                }
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgLevellist.getDrawable().getLevel() == 0){
                    imgLevellist.setImageLevel(100);
                }else{
                    imgLevellist.setImageLevel(imgLevellist.getDrawable().getLevel() - 10);
                }
            }
        });
    }
}
