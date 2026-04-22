package pizza.lachgar.ma.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private final Context       ctx;
    private final List<Produit> pizzas;

    public PizzaAdapter(Context ctx, List<Produit> pizzas) {
        this.ctx    = ctx;
        this.pizzas = pizzas;
    }

    @Override public int    getCount()        { return pizzas.size(); }
    @Override public Object getItem(int i)    { return pizzas.get(i); }
    @Override public long   getItemId(int i)  { return pizzas.get(i).getId(); }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(ctx)
                    .inflate(R.layout.row_pizza, parent, false);

        ImageView img      = convertView.findViewById(R.id.imgPizza);
        TextView  tvNom    = convertView.findViewById(R.id.tvNom);
        TextView  tvPrix   = convertView.findViewById(R.id.tvPrix);
        TextView  tvDuree  = convertView.findViewById(R.id.tvDuree);

        Produit p = pizzas.get(pos);
        img.setImageResource(p.getPhoto());
        tvNom.setText(p.getNom());
        tvPrix.setText(String.valueOf(p.getNbrIngredients()));
        tvDuree.setText(p.getDuree());

        return convertView;
    }
}