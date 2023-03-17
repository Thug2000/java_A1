import java.time.Instant;
import java.time.Duration;
import java.util.Arrays;
import java.util.Random;

public class CinquiemeTp {


        public int size = Integer.MAX_VALUE / 10000;
        public int[] tableau = new int[size];

        public float getTimeTri(String methode, int[] tableau){

            float[] moyenne = new float[5];

            for (int i = 0; i< 5; i++) {
                Instant start = Instant.now();
                System.out.println("Debut du tri numero " + i);
                switch (methode) {
                    case "selection" -> triSelection(tableau);
                    case "insertion" -> triInsertion(tableau);
                    case "bulle" -> triBulles(tableau);
                    case "quick" -> quicksort(tableau, 0, this.size - 1);
                    case "java" -> triJava(tableau);
                    case default -> {
                        System.out.println("Merci de rentrer une methode valide");
                    }
                }
                Instant end = Instant.now();

                moyenne[i] = Duration.between(start, end).toMillis();
                System.out.println("Temps tri numero " + i + " : " + Duration.between(start, end).toMillis() + "ms");
            }

            float sum = 0;
            for (float num : moyenne) {
                sum += num;
            }
            return sum / moyenne.length;

        }


        public void initialiserTableau() {

            Instant start = Instant.now();
            System.out.println("Debut d’initialisation...");
            Random random = new Random();
            for (int i = 0; i < this.tableau.length; i++) {
                this.tableau[i] = random.nextInt(this.size);
            }
            Instant end = Instant.now();
            long duration = Duration.between(start, end).toMillis();
            System.out.println("L’initialisation a pris " + duration + " ms");
        }

        public int[] triSelection(int[] tableau){
            for (int i = 0; i < tableau.length - 1; i++) {
                int indiceMin = i;
                for (int j = i; j < tableau.length; j++) {
                    if (tableau[j] < tableau[indiceMin]) {
                        indiceMin = j;
                        }
                    }
                int swap = tableau[i];
                tableau[i] = tableau[indiceMin];
                tableau[indiceMin] = swap;
                }
            return tableau;
        }


        public int[] triInsertion(int[] tableau){
            for (int i = 1; i < tableau.length; i++) {
                int elementATrier = tableau[i];
                int j = i;
                while (j > 0 && tableau[j - 1] > elementATrier) {
                    tableau[j] = tableau[j - 1];
                    j--;
                    }
                tableau[j] = elementATrier;
                }
            return tableau;
        }

        public int[] triBulles(int[] tableau){
            boolean estTrie = false;
            while (!estTrie) {
                estTrie = true;
                for (int i = 1; i < tableau.length; i++) {
                    if (tableau[i - 1] > tableau[i]) {
                        int swap = tableau[i - 1];
                        tableau[i - 1] = tableau[i];
                        tableau[i] = swap;
                        estTrie = false;
                        }
                    }
                }
            return tableau;
        }


    public int[] quicksort(int[] tableau, int indGauche, int indDroit) {

        if (indGauche < indDroit) {
            int indPivot = partition(tableau, indGauche, indDroit);
            quicksort(tableau, indGauche, indPivot - 1);
            quicksort(tableau, indPivot + 1, indDroit);
        }


        return tableau;
    }

    public  int partition(int[] tableau, int indiceGauche, int indiceDroit) {
        int elementPivot = tableau[indiceGauche + (indiceDroit - indiceGauche) / 2];
        int left = indiceGauche - 1;
        int right = indiceDroit + 1;
        while (true) {
            do {
                left++;
            } while (tableau[left] < elementPivot);
            do {
                right--;
            } while (tableau[right] > elementPivot);
            if (left >= right) {
                return right;
            }
            int tmp = tableau[left];
            tableau[left] = tableau[right];
            tableau[right] = tmp;
        }
    }

    public int[] triJava(int[] tableau){
        Arrays.sort(tableau);
        return tableau;
    }

}
