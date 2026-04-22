package pizza.lachgar.ma.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import pizza.lachgar.ma.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Animation sur le logo
        ImageView imgLogo = findViewById(R.id.imgLogo);
        Animation scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        Animation fadeIn  = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imgLogo.startAnimation(scaleUp);
        imgLogo.startAnimation(fadeIn);

        // Lancement de ListPizzaActivity après 2 secondes
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, pizza.lachgar.ma.pizzarecipes.ui.ListPizzaActivity.class));
            finish();
        }, 2500);
    }
}