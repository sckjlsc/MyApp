package com.MyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        m_homeButton = (Button)findViewById(R.id.homeButton);
        m_homeButton.setOnClickListener(new MyButtonListener());
        m_meButton = (Button)findViewById(R.id.meButton);
        m_nearByButton = (Button)findViewById(R.id.nearByButton);
        m_checkMenuButton = (Button)findViewById(R.id.checkMenuButton);
        m_wannaEatButton = (Button)findViewById(R.id.wannaEatButton);
        m_healthTipButton = (Button)findViewById(R.id.healthTipsButton);
        m_foodMagazineButton = (Button)findViewById(R.id.foodMagazineButton);
        m_moreButton = (Button)findViewById(R.id.moreButton);

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0,1,1,R.string.exit);
        menu.add(0,2,2,R.string.about);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == 1)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    class MyButtonListener implements View.OnClickListener
    {
        public void onClick(View v)
        {
            Intent intent = new Intent();
            intent.setClass(MyActivity.this, HomeActivity.class);
            intent.putExtra("testExtra","123");
            MyActivity.this.startActivity(intent);
        }
    }

    private Button m_homeButton = null;
    private Button m_meButton = null;
    private Button m_nearByButton = null;
    private Button m_checkMenuButton = null;
    private Button m_wannaEatButton = null;
    private Button m_healthTipButton = null;
    private Button m_foodMagazineButton = null;
    private Button m_moreButton = null;
}
