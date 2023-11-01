package com.example.customiseavengers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.service.autofill.CustomDescription;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    HorizontalScrollView hvNew;
    ArrayList<Avengers> list = new ArrayList<Avengers>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hvNew = findViewById(R.id.hvNew);

        list.add(new Avengers("Antman","Ants",R.drawable.ant));
        list.add(new Avengers("Captain America","Shield",R.drawable.captain));
        list.add(new Avengers("Captain Marvel","POWERS",R.drawable.captainmarvel));
        list.add(new Avengers("Doctor Strange","Magic",R.drawable.doctor));
        list.add(new Avengers("HAWK","ARCHER",R.drawable.hawk));
        list.add(new Avengers("HULK","Super Strength",R.drawable.hulk));
        list.add(new Avengers("IRON MAN","TECHNOLOGY",R.drawable.ironman));
        list.add(new Avengers("BLACK PANTHER","VIBRANIUM",R.drawable.panther));
        list.add(new Avengers("SPIDER MAN","WEBSHOOTING",R.drawable.spideybaby));
        list.add(new Avengers("THOR","HAMMER",R.drawable.thor));
        list.add(new Avengers("WANDA VISION","DARKHOLD",R.drawable.wandagandu));
        list.add(new Avengers("BLACK WIDOW","DETECTIVE",R.drawable.widow));
       // ArrayAdapter<Avengers> ad = new ArrayAdapter<Avengers>(getApplicationContext(), android.R.layout.simple_list_item_1,list);

    }
}