import java.util.Arrays;
import java.util.Scanner;

public class DeuxiemeTp {

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int choix;
        System.out.println("""
                1. Discriminant
                2. Parité d’un nombre
                3. Calcul d’extremum
                4. Égalité entre chaînes de caractères
                5. Factorielle
                6. Compte à rebous
                7. Valeurs de carrés
                8. Table de multiplication
                9. Division d’entiers
                10. Règle graduée
                11. Nombres premiers
                12. Manipulations sur un tableau""");
        choix = sc.nextInt();

        switch (choix){
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
            case 4:
                egaliteStr();
                break;
            case 5:
                factorrielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8 :
                tableMultiplications();
                break;
            case 9 :
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
            default:
                System.out.println("Merci de choisir un nombre valide !");

        }
    }

    public void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de A :");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de B :");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de C :");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if(delta < 0) {
            System.out.println("Ce polynome n'est pas de racine réelle !");
            return;
        }
        System.out.println(delta);
    }

    public void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de rentrer un entier :");
        int entier = scanner.nextInt();

        if (entier % 2 == 0){
            System.out.println("Ce chiffre est pair !");
        } else {
            System.out.println("Ce chiffre est impair !");
        }
    }

    public void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de saisir le premier entier :");
        int premier = scanner.nextInt();
        System.out.println("Merci de saisir le deuxieme entier :");
        int deuxieme = scanner.nextInt();

        if (premier > deuxieme){
            System.out.println("Le maximum est " + premier);
            System.out.println("Le minimum est " + deuxieme);
        } else {
            System.out.println("Le maximum est " + deuxieme);
            System.out.println("Le minimum est " + premier);
        }
    }

    public void egaliteStr(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une premiere chaine de caracteres :");
        String premiere = scanner.nextLine();
        System.out.println("Saisir une deuxieme chaine de caracteres :");
        String deuxieme = scanner.nextLine();

        if(premiere.equals(deuxieme)){
            System.out.println("Les deux chaines de caracteres sont egales !");
        } else {
            System.out.println("Les deux chaines de caracteres sont différentes !");
        }
    }

    public void factorrielle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier positif ou nul :");

        int n;
        do {
            n = scanner.nextInt();
        } while (n < 0);
        int factorielle = 1;

        for(int i = 1 ; i <= n; i++){
            factorielle = factorielle * i;
        }

        System.out.println(n + "! = " + factorielle);
    }

    public void countdown(){
        for(int i = 0; i<11; i++){
            System.out.println(10 - i);
        }
        System.out.println("BOUM !");
    }

    public void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de rentrer x :");
        int x = scanner.nextInt();
        System.out.println(x + "\t" + x*x);
    }

    public void tableMultiplications(){
        for(int i = 1; i<11; i++){
            for (int j = 1; j<10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println(i*10);
        }
    }

    public void division(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merci de saisir un premier entier :");
        int premier = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Merci de saisir un deuxieme entier :");
        int deuxieme;
        do {
            deuxieme = scanner.nextInt();
        } while (deuxieme < 0);

        float division = (float) premier / (float) deuxieme;
        System.out.println(division);

    }

    public void regle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de saisir une valeur entiere : ");
        int n;
        do {
            n = scanner.nextInt();
        } while (n < 0);

        System.out.print("|");
        for (int i = 1; i<n+1; i++){
            if(i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    public void nombrePremier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuillez rentrer une valeur entière");
        int value;
        boolean flag = false;
        do {
            value = sc.nextInt();
        } while (value < 0);

        for(int i=2;i<=value/2;i++)
        {
            if((value%i)==0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }

        if(flag){
            System.out.println("Le nombre " + value + " est premier");
        } else {
            System.out.println("Le nombre " + value + " n'est pas premier");
        }
    }

    public void initialisationTableau() {
        int[] tableau = new int[20];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        Arrays.sort(tableau);

        System.out.println("Le minimum est " + tableau[0]);
        System.out.println("Le maximum est " + tableau[tableau.length - 1]);

        for (int j : tableau) {
            sum += j;
        }

        System.out.println("La somme est " + sum);

        System.out.println("Les elements pairs sont : ");
        for(int i = 0; i< tableau.length - 1; i++){
            if (tableau[i] % 2 == 0){
                System.out.print(tableau[i]);
                System.out.print(" ");
            }
        }

        System.out.println("Les elements d'indices pairs sont :");
        for(int i = 0; i< tableau.length - 1; i++){
            if (i % 2 == 0){
                System.out.print(tableau[i]);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }

    public void inverseTableau(int[] tableau){
        int[] newTableau = new int[tableau.length];

        for(int i=tableau.length - 1;i>0;i--){
            newTableau[tableau.length - i - 1] = tableau[i];
        }

        System.out.println(Arrays.toString(newTableau));
    }

}
