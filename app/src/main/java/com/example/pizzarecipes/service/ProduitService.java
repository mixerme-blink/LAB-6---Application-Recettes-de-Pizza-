package pizza.lachgar.ma.pizzarecipes.service;

import pizza.lachgar.ma.pizzarecipes.R;
import pizza.lachgar.ma.pizzarecipes.classes.Produit;
import pizza.lachgar.ma.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() { seed(); }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        // Données exactes de l'Annexe 1 du PDF
        data.add(new Produit("BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion, halved and thinly sliced\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. —Alicia Trevithick, Temecula, California",
                "STEP 1:\n\nSprinkle chicken with pepper; grill until 165°, basting with 1/2 cup BBQ sauce.\n\nSTEP 2:\n\nPress dough into rectangle, brush with oil, grill until browned.\n\nSTEP 3:\n\nSpread BBQ sauce, top with cheese, chicken, onion. Grill until melted."));

        data.add(new Produit("BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes. —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\n\nCook sausage; top crust with pepperoni, sausage and cheese. Bake at 450° for 10-12 min.\n\nSTEP 2:\n\nCombine tomatoes, basil, oil, garlic. Spoon over pizza."));

        data.add(new Produit("SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family loves it! —Dawn Bartholomew, Raleigh, North Carolina",
                "STEP 1:\n\nPrepare pizza dough; press onto greased 12-in. pan.\n\nSTEP 2:\n\nSpread Alfredo sauce; top with spinach, tomatoes and cheese.\n\nSTEP 3:\n\nBake at 450° for 10-15 minutes."));

        data.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.mipmap.pizza4, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt",
                "My Grandma made the tastiest snacks at her farm. Her wonderful pizza had fragrant herbs in the crust. —Michele Madden, Ohio",
                "STEP 1:\n\nDissolve yeast; mix flour and seasonings. Knead 6-8 min. Rise 1 hour.\n\nSTEP 2:\n\nLayer mozzarella, sausage, onion, peppers, tomatoes.\n\nSTEP 3:\n\nBake at 400° for 20 min; add pepperoni, bake 10-15 min more."));

        data.add(new Produit("HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 can tomato sauce\n- 1 medium green pepper\n- 2 cups shredded mozzarella",
                "A hearty, zesty main dish with a crisp, golden crust. —Marianne Edwards, Lake Stevens, Washington",
                "STEP 1:\n\nDissolve yeast; knead dough. Rise 45 min.\n\nSTEP 2:\n\nCook beef and onion.\n\nSTEP 3:\n\nSpread sauce; top with beef, pepper, cheese.\n\nSTEP 4:\n\nBake at 400° for 25-30 minutes."));

        data.add(new Produit("PESTO CHICKEN PIZZA", 3, R.mipmap.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1/2 pound boneless skinless chicken breasts\n- 1 small onion\n- Mixed peppers\n- 1/2 cup mushrooms\n- 3 tablespoons pesto\n- 1-1/2 cups mozzarella",
                "This is the only pizza I make now! Keeping the spices simple lets the chicken and vegetables shine. —Heather Thompson, California",
                "STEP 1:\n\nDissolve yeast; knead dough. Rise 1 hour.\n\nSTEP 2:\n\nCook chicken and vegetables.\n\nSTEP 3:\n\nSpread pesto; top with chicken and cheese.\n\nSTEP 4:\n\nBake at 400° for 18-20 minutes."));

        data.add(new Produit("LOADED MEXICAN PIZZA", 3, R.mipmap.pizza7, "30 min",
                "- 1 can black beans\n- 1 medium red onion\n- 1 small yellow pepper\n- 3 teaspoons chili powder\n- 3 medium tomatoes\n- 1 jalapeno pepper\n- 1 prebaked 12-inch crust\n- 2 cups fresh spinach\n- 1/2 cup cheddar\n- 1/2 cup pepper jack",
                "My husband loves this healthy pizza. Leftovers taste even better! —Mary Barker, Tennessee",
                "STEP 1:\n\nMash beans; add onion, pepper, chili powder.\n\nSTEP 2:\n\nSpread on crust; top with tomatoes, spinach, cheeses.\n\nSTEP 3:\n\nBake at 400° for 12-15 minutes."));

        data.add(new Produit("BACON CHEESEBURGER PIZZA", 2, R.mipmap.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion\n- 1 prebaked Italian bread shell\n- 1 can pizza sauce\n- 6 bacon strips, crumbled\n- 20 dill pickle slices\n- 2 cups mozzarella\n- 2 cups cheddar",
                "Kids of all ages love this combo of pizza and cheeseburger! —Cherie Ackerman, Minnesota",
                "STEP 1:\n\nCook beef and onion.\n\nSTEP 2:\n\nSpread sauce; top with beef, bacon, pickles, cheeses.\n\nSTEP 3:\n\nBake at 450° for 8-10 minutes."));

        data.add(new Produit("PIZZA MARGHERITA", 1, R.mipmap.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour\n- Fresh tomatoes, mozzarella, basil",
                "A classic Pizza Margherita showing the colors of the Italian flag. —Loretta Lawrence, South Carolina",
                "STEP 1:\n\nDissolve yeast; knead dough. Rise 1 hour.\n\nSTEP 2:\n\nRoll into circles; rest 10 min.\n\nSTEP 3:\n\nTop with tomatoes, basil, cheese. Drizzle oil.\n\nSTEP 4:\n\nBake at 450° for 15-20 minutes."));

        data.add(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.mipmap.pizza10, "45 min",
                "- 1 package active dry yeast\n- 1-1/4 cups warm water\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 cups all-purpose flour\n- Mozzarella, cheddar, sausage, mushrooms, pepperoni",
                "For 30 years, friends have told me to open a pizzeria with this recipe! —Elizabeth Wolff, Indiana",
                "STEP 1:\n\nKnead dough; rise 1 hour.\n\nSTEP 2:\n\nLayer cheeses, sausage, pepperoni.\n\nSTEP 3:\n\nCover with remaining dough. Bake at 425° for 10 min.\n\nSTEP 4:\n\nReduce to 375°; bake 30-35 min more."));
    }

    @Override
    public boolean create(Produit o) {
        return data.add(o);
    }

    @Override
    public boolean update(Produit o) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == o.getId()) {
                data.set(i, o);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return data.removeIf(x -> x.getId() == o.getId());
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : data)
            if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return new ArrayList<>(data);
    }
}