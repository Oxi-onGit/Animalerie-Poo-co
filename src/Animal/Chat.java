package Animal;

public class Chat extends Animal
{
    public Chat ( String nom,
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

    public Chat(String nom)
    {
        this.nom = nom;
    }

    public void parle()
    {
        System.out.println("Miaou");
    }

    public void action()
    {
        System.out.println("ronronnent");
    }
}
