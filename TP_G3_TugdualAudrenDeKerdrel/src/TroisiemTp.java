public class TroisiemTp {

    public void testScanner(){
        SafeScanner scanner = new SafeScanner();

        System.out.println("Comment vous appelez vous ?");
        String nom = scanner.getString();
        System.out.println("Bienvenue " + nom);

        System.out.println("Quel est votre age ?");
        int age = scanner.getIntOther();
        System.out.println("Votre age est " + age);

        scanner.closeScanner();
    }
}
