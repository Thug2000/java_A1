
/*
* - l'utilisateur peut rentrer un entier et un int dans la console
*   le programme va renvoyer les valeurs rentrées par l'utilisateur
* - Scanner.nextInt et Scanner.nextFloat vont recuperer les prochains entiers et floats rentrées par l'user dans la console
*
*/

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");*/
        //Scanner scanner = new Scanner(System.in);

        /*int unEntier = scanner.nextInt();
        while (unEntier != 2){
            unEntier = scanner.nextInt();
        }
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);*/

        /*System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour, " + prenom);*/

        //somme();
        //division();
        //volume();
        dessin();

    }

    public static void somme(){
        System.out.println("---- Exercice 1 ----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier :");
        int premierEntier, deuxiemeEntier;
        try {
            premierEntier = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Merci de rentrer un entier :");
            scanner.nextLine();
            premierEntier = scanner.nextInt();
        }
        System.out.println("Veuillez saisir le deuxieme entier :");
        try {
            deuxiemeEntier = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Merci de rentrer un entier :");
            scanner.nextLine();
            deuxiemeEntier = scanner.nextInt();
        }
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("la somme de " + premierEntier + " avec " + deuxiemeEntier + " est egal à " + somme);
    }

    public static void division(){
        System.out.println("---- Exercice 2 ----");
        Scanner scanner = new Scanner(System.in);

        int premierEntier, deuxiemeEntier;

        try{
            System.out.println("Veuillez saisir le premier entier :");
            premierEntier = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Veuillez saisir le deuxieme entier :");
            deuxiemeEntier = scanner.nextInt();
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("Merci de rentrer des entiers : ");
            System.out.println("Veuillez saisir le premier entier :");
            premierEntier = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Veuillez saisir le deuxieme entier :");
            deuxiemeEntier = scanner.nextInt();
        }

        float division = (float) premierEntier / (float) deuxiemeEntier;
        System.out.println("la division de " + premierEntier + " avec " + deuxiemeEntier + " est egal à " + division);
    }

    public static void volume(){
        System.out.println("---- Exercice 3 ----");
        // nous avons besoin de 3 variables
        float longueur, largeur, hauteur;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrer la longueur (cm) :");
        longueur = scanner.nextFloat();
        System.out.println("Rentrer la largeur (cm) :");
        largeur = scanner.nextFloat();
        System.out.println("Rentrer la hauteur (cm) :");
        hauteur = scanner.nextFloat();
        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume du pave est : " + volume + " cm3");
    }

    public static void dessin(){
        Scanner scanner = new Scanner(System.in);
        int longueur, largeur;
        System.out.println("Merci de rentrer la longueur :");
        longueur = scanner.nextInt();
        System.out.println("Merci de rentrer la largeur :");
        largeur = scanner.nextInt();
        for (int j = 0; j < largeur - 1; j++) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int i = 0; i < longueur - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < largeur - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j = 0; j < largeur - 1; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
