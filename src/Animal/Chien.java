package Animal;

public class Chien extends Animal
{
    private String race;

    public Chien( String nom,
                  int pattes,
                  int dents,
                  int pelages,
                  String nourriture,
                  String race)
    {
        this.nom = nom;
        this.pattes = pattes;
        this.dents = dents;
        this.pelages = pelages;
        this.nourriture = nourriture;
        this.race = race;
    }

    public Chien(String nom,String race)
    {
        this.nom = nom;
        this.race = race;
    }

    public void parle()
    {
        System.out.println("waf");
    }

    public void action()
    {
        if (race.equals("berger"))
        {
            System.out.println("garde la maison");
        }else if(race.equals("bichon"))
        {
            System.out.println("Fais un câlin avec son maitre");
        }
    }
}
