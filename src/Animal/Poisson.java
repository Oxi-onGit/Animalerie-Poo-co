package Animal;

public class Poisson  extends Animal
{
    public Poisson(String nom,
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

    public Poisson(String nom)
    {
        this.nom = nom;
    }

    public void parle()
    {
        System.out.println("blop");
    }

    public void action()
    {
        System.out.println("nage");
    }
}
