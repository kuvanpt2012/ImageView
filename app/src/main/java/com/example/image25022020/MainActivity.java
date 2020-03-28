package com.example.image25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView mImg;
    Button mBtnNext,mBtnPrevious,mBtnRandom,mBtnAutoNext,mBtnAutoPrevious;
    ArrayList<Integer> mArryImageIntegers;
    int count = 0;
    Random mRandom;
    int mIndexRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImg = findViewById(R.id.ImageView);
        mBtnNext = findViewById(R.id.next);
        mBtnPrevious = findViewById(R.id.buttonPrevious);
        mBtnRandom = findViewById(R.id.buttonrandom);
        mBtnAutoNext = findViewById(R.id.buttonAutonext);
        mBtnAutoPrevious = findViewById(R.id.buttonAutoPrevious);
        // Tạo mảng  hình
        mArryImageIntegers = new ArrayList<>();
        mArryImageIntegers.add(R.drawable.a4);
        mArryImageIntegers.add(R.drawable.a6);
        mArryImageIntegers.add(R.drawable.a44);
        mArryImageIntegers.add(R.drawable.a55);

        mBtnNext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
               count  = count >= mArryImageIntegers.size() -1  ? 0 : ++count;
               // if (count>= mArryImageIntegers.size() -1 ){
               //     count = 0 ;
                //    mImg.setImageResource(mArryImageIntegers.get(count));
                //    return;
               // }
                mImg.setImageResource(mArryImageIntegers.get(count));
            }
        });
        mBtnPrevious.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view) {
             count = count <= 0 ? mArryImageIntegers.size() -1 : --count;
                mImg.setImageResource(mArryImageIntegers.get(count));
            }
        });
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mArryImageIntegers.size() != 0) {
                    mRandom = new Random();
                    count = mIndexRandom;
                    mIndexRandom = mRandom.nextInt(mArryImageIntegers.size());
                    mImg.setImageResource(mArryImageIntegers.get(mIndexRandom));

                }

            }
        });



;

    }
}
