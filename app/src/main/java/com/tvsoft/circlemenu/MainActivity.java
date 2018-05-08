package com.tvsoft.circlemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tvsoft.circlemenuanimation.FilterMenu;
import com.tvsoft.circlemenuanimation.FilterMenuLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_timeline);
//        FilterMenuLayout layout1 = (FilterMenuLayout) findViewById(R.id.filter_menu1);
//        attachMenu1(layout1);

        FilterMenuLayout layout2 = (FilterMenuLayout) findViewById(R.id.filter_menu2);
        attachMenu2(layout2);

//        FilterMenuLayout layout3 = (FilterMenuLayout) findViewById(R.id.filter_menu3);
//        attachMenu3(layout3);

        /*FilterMenuLayout layout4 = (FilterMenuLayout) findViewById(R.id.filter_menu4);
        attachMenu4(layout4);*/
    }
    private FilterMenu attachMenu1(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .addItem(R.drawable.ic_info)
                .addItem(R.drawable.question)
                .addItem(R.drawable.back)
                .addItem(R.drawable.warning)
                .addItem(R.drawable.ic_action_location_2)
                .attach(layout)
                .withListener(listener)
                .build();
    }
    private FilterMenu attachMenu2(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .addItem(R.drawable.ic_info)
                .addItem(R.drawable.ic_clock)
                .addItem(R.drawable.ic_question)
                .addItem(R.drawable.ic_question_1)
                .attach(layout)
                .withListener(listener)
                .build();
    }
    private FilterMenu attachMenu3(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .addItem(R.drawable.ic_action_add)
                .addItem(R.drawable.ic_action_clock)
                .addItem(R.drawable.ic_action_location_2)
                .attach(layout)
                .withListener(listener)
                .build();
    }
    /*private FilterMenu attachMenu4(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .inflate(R.menu.menu_filter)
                .attach(layout)
                .withListener(listener)
                .build();
    }*/



    FilterMenu.OnMenuChangeListener listener = new FilterMenu.OnMenuChangeListener() {

        @Override
        public void onMenuItemClick(View view, int position) {
            Toast.makeText(MainActivity.this, "Touched position " + position, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onMenuCollapse() {

        }


        @Override
        public void onMenuExpand() {

        }
    };
}
