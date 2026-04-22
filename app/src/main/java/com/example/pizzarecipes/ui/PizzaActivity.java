package pizza.lachgar.ma.pizzarecipes.ui;

import static android.os.Build.VERSION_CODES_FULL.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.ui.PizzaDetailActivity;

import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.adapter.PizzaAdapter;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;
import pizza.lachgar.ma.pizzarecipes.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        ListView      lv     = findViewById(R.id.liste);
        List<Produit> pizzas = ProduitService.getInstance().findAll();

        lv.setAdapter(new PizzaAdapter(this, pizzas));

        lv.setOnItemClickListener((parent, view, pos, id) -> {
            Intent it = new Intent(this, PizzaDetailActivity.class);
            it.putExtra("pizza_id", (int) id);
            startActivity(it);
        });
    }
}