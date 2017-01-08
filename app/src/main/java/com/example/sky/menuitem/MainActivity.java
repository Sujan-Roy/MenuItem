package com.example.sky.menuitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(getApplicationContext(),"setting is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home:
                Toast.makeText(getApplicationContext(),"home is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.contact:
                Toast.makeText(getApplicationContext(),"Contact is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.About:
                Toast.makeText(getApplicationContext(),"About_Us is selected",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"wrong selected",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
