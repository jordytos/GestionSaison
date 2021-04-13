package com.example.gestionsaison;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import com.example.gestionsaison.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_ete) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for ete", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.ete);
            return true;
        }

        if (id == R.id.action_hiver) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for hiver", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.hiver);
            return true;
        }

        if (id == R.id.action_printemps) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for printemps", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.printemps);
            return true;
        }

        if (id == R.id.action_automne) {
            Snackbar snackbar = Snackbar.make(findViewById(R.id.view_pager),"This is a snakbar for automne", Snackbar.LENGTH_INDEFINITE);
            snackbar.show();
            image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.automne);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}