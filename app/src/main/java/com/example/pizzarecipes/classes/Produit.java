package pizza.lachgar.ma.pizzarecipes.classes;

public class Produit {

    private static int AUTO_ID = 1;

    private int    id;
    private String nom;
    private int    nbrIngredients; // utilisé comme prix dans l'app
    private int    photo;
    private String duree;
    private String detailsIngred;
    private String description;
    private String preparation;
    private int    comp;

    // Constructeur sans paramètres
    public Produit() {
        this.id = AUTO_ID++;
    }

    // Constructeur complet (correspond au seed de l'Annexe)
    public Produit(String nom, int nbrIngredients, int photo, String duree,
                   String detailsIngred, String description, String preparation) {
        this.id             = AUTO_ID++;
        this.nom            = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo          = photo;
        this.duree          = duree;
        this.detailsIngred  = detailsIngred;
        this.description    = description;
        this.preparation    = preparation;
    }

    public int    getId()              { return id; }
    public String getNom()             { return nom; }
    public void   setNom(String n)     { this.nom = n; }
    public int    getNbrIngredients()  { return nbrIngredients; }
    public void   setNbrIngredients(int n) { this.nbrIngredients = n; }
    public int    getPhoto()           { return photo; }
    public void   setPhoto(int p)      { this.photo = p; }
    public String getDuree()           { return duree; }
    public void   setDuree(String d)   { this.duree = d; }
    public String getDetailsIngred()   { return detailsIngred; }
    public void   setDetailsIngred(String d) { this.detailsIngred = d; }
    public String getDescription()     { return description; }
    public void   setDescription(String d) { this.description = d; }
    public String getPreparation()     { return preparation; }
    public void   setPreparation(String p) { this.preparation = p; }
    public int    getComp()            { return comp; }
    public void   setComp(int c)       { this.comp = c; }

    @Override
    public String toString() {
        return nom + " - " + nbrIngredients + " €";
    }
}