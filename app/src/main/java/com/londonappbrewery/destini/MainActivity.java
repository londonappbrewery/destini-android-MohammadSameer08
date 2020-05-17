package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button ButtonTop,ButtonBottom;
TextView StoryText;
int StoryIndex=1;
    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonTop=(Button)findViewById(R.id.buttonTop);
        ButtonBottom=(Button)findViewById(R.id.buttonBottom);
        StoryText=(TextView)findViewById(R.id.storyTextView);
        ButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(StoryIndex==1) {
                    StoryText.setText(R.string.T3_Story);
                    ButtonTop.setText(R.string.T3_Ans1);
                    ButtonBottom.setText(R.string.T3_Ans2);
                    StoryIndex=3;
                }
                else if(StoryIndex==3)
                {
                    StoryText.setText(R.string.T5_End);
                    ButtonTop.setVisibility(View.GONE);
                    ButtonBottom.setVisibility(View.GONE);

                }
               else if(StoryIndex==2)
                {
                    StoryText.setText(R.string.T3_Story);
                    ButtonTop.setText(R.string.T3_Ans1);
                    ButtonBottom.setText(R.string.T3_Ans2);
                    StoryIndex=3;


                }

            }
        });
       ButtonBottom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view)
           {
               if(StoryIndex==1) {
                   StoryText.setText(R.string.T2_Story);
                   ButtonTop.setText(R.string.T2_Ans1);
                   ButtonBottom.setText(R.string.T2_Ans2);
                    StoryIndex=2;
               }
               else if(StoryIndex==2)
               {
                   StoryText.setText(R.string.T4_End);
                   ButtonTop.setVisibility(View.GONE);
                   ButtonBottom.setVisibility(View.GONE);

               }
               else if(StoryIndex==3)
               {
                   StoryText.setText(R.string.T5_End);
                   ButtonTop.setVisibility(View.GONE);
                   ButtonBottom.setVisibility(View.GONE);

               }
           }
       });
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
