import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        //System.out.println("--- Premier TP ---");
        //PremierTp tp1 = new PremierTp();
        //tp1.somme();
        //tp1.division();
        //tp1.volume();
        //tp1.dessin();

        //System.out.println("--- Deuxieme TP ---");
        //DeuxiemeTp tp2 = new DeuxiemeTp();
        //tp2.menu();

        /*System.out.println("--- Troisieme TP ---");
        TroisiemTp tp3 = new TroisiemTp();
        tp3.testScanner();
        tp3.drawCat(5, 7);*/

        System.out.println("--- Cinquieme TP ---");

        CinquiemeTp tp5 = new CinquiemeTp();
        tp5.initialiserTableau();

        int[] tableauSelection = new int[tp5.size];
        int[] tableauInsertion = new int[tp5.size];
        int[] tableauBulle = new int[tp5.size];
        int[] tableauQuick = new int[tp5.size];
        int[] tableauJava = new int[tp5.size];
        // arraycopy(src, startIndex, dest, startIndex, size)
        System.arraycopy(tp5.tableau, 0, tableauSelection, 0, tp5.size);
        System.arraycopy(tp5.tableau, 0, tableauInsertion, 0, tp5.size);
        System.arraycopy(tp5.tableau, 0, tableauBulle, 0, tp5.size);
        System.arraycopy(tp5.tableau, 0, tableauQuick, 0, tp5.size);
        System.arraycopy(tp5.tableau, 0, tableauJava, 0, tp5.size);
        float time = tp5.getTimeTri("java", tableauJava);
        // methode peut être : selection, insertion, bulle, quick, java
        System.out.println("le temps de tri moyen est de " + time + "ms");

    }
}