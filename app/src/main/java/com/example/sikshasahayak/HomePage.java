package com.example.sikshasahayak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class HomePage extends AppCompatActivity {

    public static  final String FILTER = "ccom.example.foode_commerceapp.extra.FILTER";

    SliderView sliderView;
    int[] images = {R.drawable.eduone,
            R.drawable.edutwo,
            R.drawable.eduthree,
            R.drawable.edufour,
            R.drawable.edufive,
            R.drawable.edusix};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

//    public void toFilterPageBiriyani(View view) {
//        String item = "biriyani";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPagePizza(View view) {
//        String item = "pizza";
//        boolean id = true;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageChicken(View view) {
//        String item = "chicken";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageChiliChicken(View view) {
//        String item = "chiliChicken";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageEggRoll(View view) {
//        String item = "eggRoll";
//        boolean id = true;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageCake(View view) {
//        String item = "cake";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPagePaneer(View view) {
//        String item = "paneer";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageBurger(View view) {
//        String item = "burger";
//        boolean id = true;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageSandwich(View view) {
//        String item = "sandwich";
//        boolean id = true;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageChinese(View view) {
//        String item = "chinese";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageManchurian(View view) {
//        String item = "manchurian";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageColdDrinks(View view) {
//        String item = "coldDrinks";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageWeeklyTop(View view) {
//        String item = "weeklyTop";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }
//    public void toFilterPageRating(View view) {
//        String item = "rating";
//        boolean id = false;
//        Intent intent = new Intent(this, FilterItemsPage.class);
//        intent.putExtra(FILTER,item);
////        intent.putExtra(DISH_NAME,id);
//        startActivity(intent);
//    }


}