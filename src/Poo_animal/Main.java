package Poo_animal;

import Animal.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Chien chien1 = new Chien("rex",4,25, 45,"jambon","berger");
        Chien chien2 = new Chien("tobi","bichon");
        Chat  chat = new Chat("minou",4,28, 12,"poisson");
        Poisson poisson = new Poisson("plastifiche");
        Canari canari = new Canari("jaune",2,0,8,"graine");
        Animal[] tab = new Animal[5];
        tab[0] = chien1;
        tab[1]=chien2;
        tab[2]=chat;
        tab[3]=canari;
        tab[4]=poisson;

        String input = "";

        while (!input.equals("Exit"))
        {

            switch (input) {
                case "1":
                    toutAfficher(tab);
                    break;
                case "2":
                    actionSurLesData(tab, "ajouter");
                    break;
                case "3":
                    actionSurLesData(tab, "supprimer");
                    break;
                case "4":
                    actionSurLesData(tab, "modifier");
                    break;
                case "5":
                    lesAnimauxParle(tab);
                    break;
                case "6":
                    lesAnimauxFontUneAction(tab);
                    break;
                case "7":
                    input = "Exit";
                    return;
            }
            System.out.println("press 1 : Afficher la liste des caractéristiques par animal\n" +
                    "press 2 : Ajouter une caractéristique à un animal \n" +
                    "press 3 : Supprimer une caractéristique à un animal \n" +
                    "press 4 : Modifier une caractéristique  à un animal \n" +
                    "press 5 : Pour que tous les animaux parlent\n" +
                    "press 6 : Pour que tous les animaux fassent leur action\n" +
                    "press 7 : Quitter l'app");
            input = (new Scanner(System.in)).nextLine();
        }
    }

    public static void actionSurLesData(Animal[] tab, String action)
    {
        String animal;
        String cara;
        String valeur;
        listeAnimal(tab);
        animal = (new Scanner(System.in)).nextLine();
        listeCara();
        cara = (new Scanner(System.in)).nextLine();
        if (action.equals("ajouter")|| action.equals("modifier"))
        {
            System.out.println("taper la valeur");
            valeur = (new Scanner(System.in)).nextLine();
        }else
        {
            valeur="";
        }

        switch (cara) {
            case "0":
                tab[Integer.parseInt(animal)].setNom(valeur);
                break;
            case "1":
                tab[Integer.parseInt(animal)].setPattes(stringToInt(valeur));
                break;
            case "2":
                tab[Integer.parseInt(animal)].setDents(stringToInt(valeur));
                break;
            case "3":
                tab[Integer.parseInt(animal)].setPelages(stringToInt(valeur));
                break;
            case "4":
                tab[Integer.parseInt(animal)].setNourriture(valeur);
                break;
        }
        System.out.println("Action terminer");
    }

    public static int stringToInt(String valeur)
    {
        if (valeur.equals(""))
        {
            valeur="0";
        }
        return Integer.parseInt(valeur);
    }

    public static void listeCara()
    {
        System.out.println("""
                0/nom
                1/pattes
                2/dents
                3/pelages
                4/nourriture
                """);
        System.out.println("Taper le numéro correspondant à la caractéristique souhaiter\n");
    }

    public static void listeAnimal(Animal[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            System.out.println(i+":"+tab[i].getNom());
        }
        System.out.println("Taper le numéro correspondant à l'animal souhaiter");
    }

    public static void toutAfficher(Animal[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            System.out.println("nom :"+tab[i].getNom());
            System.out.println("pattes :"+tab[i].getPattes());
            System.out.println("dents :"+tab[i].getDents());
            System.out.println("pelages :"+tab[i].getPelages());
            System.out.println("nourriture :"+tab[i].getNourriture()+"\n");
        }
    }

    public static void lesAnimauxParle(Animal[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            tab[i].parle();
        }
        System.out.println("----");
    }

    public static void lesAnimauxFontUneAction(Animal[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            tab[i].action();
        }
        System.out.println("----");
    }
}