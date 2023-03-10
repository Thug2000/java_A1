public class TroisiemTp {

    public void testScanner() {
        SafeScanner scanner = new SafeScanner();

        System.out.println("Comment vous appelez vous ?");
        String nom = scanner.getString();
        System.out.println("Bienvenue " + nom);

        System.out.println("Quel est votre age ?");
        int age = scanner.getIntOther();
        System.out.println("Votre age est " + age);

        scanner.closeScanner();
    }

    public void drawCat(int height, int width) {

        // ears and top of the head
        System.out.print("|\\");
        printCharLoop(width - 4, '-');
        System.out.println("/|");

        // middle of the head and eye
        for (int i = 1; i < height - 1; i++) {
            System.out.print("|");
            if (i == height / 2) {
                System.out.print(" ");
                System.out.print("0");
                printCharLoop(width - 6, '_');
                System.out.print("0");
                System.out.print(" ");
            } else {
                printCharLoop(width - 2, ' ');
            }
            System.out.println("|");
        }

        // bottom of the head
        System.out.print(" \\_");
        printCharLoop(width - 6, '^');
        System.out.println("_/ ");
    }

    private void printCharLoop(int n, char c) {

        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
