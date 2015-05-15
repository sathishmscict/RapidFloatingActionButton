package com.wangjie.rapidfloatingactionbutton.example.cardtest;

import android.os.Bundle;
import com.wangjie.androidinject.annotation.annotations.base.AILayout;
import com.wangjie.androidinject.annotation.annotations.base.AIView;
import com.wangjie.androidinject.annotation.present.AIActionBarActivity;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;
import com.wangjie.rapidfloatingactionbutton.example.R;

/**
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 5/6/15.
 */
@AILayout(R.layout.card_list_sample)
public class CardListSampleActivity extends AIActionBarActivity {

    @AIView(R.id.card_list_sample_rfal)
    private RapidFloatingActionLayout rfaLayout;
    @AIView(R.id.card_list_sample_rfab)
    private RapidFloatingActionButton rfaButton;
    private RapidFloatingActionHelper rfabHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RapidFloatingActionContentCardView rfaContent = new RapidFloatingActionContentCardView(context);
        rfaLayout.setIsContentAboveLayout(false);
        rfaLayout.setDisableContentDefaultAnimation(true);

        rfabHelper = new RapidFloatingActionHelper(
                context,
                rfaLayout,
                rfaButton,
                rfaContent
        ).build();


    }


}
