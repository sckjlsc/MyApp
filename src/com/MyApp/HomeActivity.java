package com.MyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by atm on 7/6/14.
 */
public class HomeActivity extends Activity
{
    private TextView m_textView = null;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Intent intent = getIntent();
        String value = intent.getStringExtra("testExtra");

        m_textView = (TextView)findViewById(R.id.home_textView);
        m_textView.setText(value);

    }
//    private Button m_homeButton = null;
//    private Button m_meButton = null;
//    private Button m_nearByButton = null;
//    private Button m_checkMenuButton = null;
//    private Button m_wannaEatButton = null;
//    private Button m_healthTipButton = null;
//    private Button m_foodMagazineButton = null;
//    private Button m_moreButton = null;
}
