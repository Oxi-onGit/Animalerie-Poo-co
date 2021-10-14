package Animal;

public class Animal
{
    protected String nom;
    protected int pattes;
    protected int dents;
    protected float pelages;
    protected String nourriture;

    public String getNom()
    {
        return nom;
    }

    public int getPattes()
    {
        return pattes;
    }

    public int getDents()
    {
        return dents;
    }

    public float getPelages()
    {
        return pelages;
    }

    public String getNourriture()
    {
        return nourriture;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setPattes(int pattes)
    {
        this.pattes = pattes;
    }

    public void setDents(int dents)
    {
        this.dents = dents;
    }

    public void setPelages(float pelages)
    {
        this.pelages = pelages;
    }

    public void setNourriture(String nourriture)
    {
        this.nourriture = nourriture;
    }

    public void parle()
    {
        System.out.println("je parle");
    }

    public void action()
    {
        System.out.println("je marche");
    }
}
