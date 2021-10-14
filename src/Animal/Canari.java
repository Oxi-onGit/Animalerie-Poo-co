package Animal;

public class Canari extends Animal
{
    public Canari( String nom,
                   int pattes,
                   int dents,
                   int pelages,
                   String nourriture)
    {
        this.nom = nom;
        this.pattes = pattes;
        this.dents = dents;
        this.pelages = pelages;
        this.nourriture = nourriture;

    }

    public Canari(String nom)
    {
        this.nom = nom;
    }

    public void parle()
    {
        System.out.println("piou piou");
    }

    public void action()
    {
        System.out.println("chante et vol");
    }
}
