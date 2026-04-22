package pizza.lachgar.ma.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;
import pizza.lachgar.ma.pizzarecipes.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        int     id = getIntent().getIntExtra("pizza_id", -1);
        Produit p  = ProduitService.getInstance().findById(id);

        ImageView img         = findViewById(R.id.img);
        TextView  title       = findViewById(R.id.title);
        TextView  desc        = findViewById(R.id.desc);
        TextView  ingredients = findViewById(R.id.ingredients);
        TextView  steps       = findViewById(R.id.steps);

        if (p != null) {
            img.setImageResource(p.getPhoto());
            title.setText(p.getNom());
            desc.setText(p.getDescription());
            ingredients.setText(p.getDetailsIngred());
            steps.setText(p.getPreparation());
        } else {
            title.setText("Pizza introuvable !");
        }
    }
}