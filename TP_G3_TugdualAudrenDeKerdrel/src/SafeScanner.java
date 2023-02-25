import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {

    Scanner sc;

    public SafeScanner(){
        this.sc = new Scanner(System.in);
    }

    /**
     * closeScanner
     * method to close the connection to the Scanner
     */
    public void closeScanner(){
        this.sc.close();
    }

    /**
     * getInt
     * check if user entered an input
     * @return int
     */
    public int getInt(){
        boolean inputValid = false;
        int value = 0;
        while(!inputValid){
            try{
                System.out.println("Rentrer une valeur :");
                value = this.sc.nextInt();
                inputValid = true;
            } catch(InputMismatchException e){
                System.out.println("Merci de rentrer un entier !");
                this.sc.next();
            }
        }
        return value;
    }

    /**
     * getIntOther
     * method to check if user entered an int using another while
     * @return int
     */
    public int getIntOther(){
        while(!this.sc.hasNextInt()){
            System.out.println("Rentrer un entier :");
            this.sc.next();
        }

        return this.sc.nextInt();
    }

    /**
     * getString
     * check if user entered a String
     * @return String
     */
    public String getString(){
        boolean inputValid = false;
        String value = "";
        while(!inputValid){
            try{
                System.out.println("Rentrer une chaine de caractere :");
                value = this.sc.nextLine();
                inputValid = true;
            } catch(InputMismatchException e){
                System.out.println("Merci de rentrer une chaine de caractere !");
                this.sc.next();
            }
        }
        return value;
    }

    /**
     * getBool
     * check if user entered a boolean
     * @return boolean
     */
    public boolean getBool(){
        boolean inputValid = false;
        boolean value = false;
        while(!inputValid){
            try{
                System.out.println("Rentrer un booleen :");
                value = this.sc.nextBoolean();
                inputValid = true;
            } catch(InputMismatchException e){
                System.out.println("Merci de rentrer un booleen !");
                this.sc.next();
            }
        }

        return value;
    }

    /**
     * getFloat
     * check if user entered a float
     * @return float
     */
    public float getFloat(){
        boolean inputValid = false;
        float value = 0;
        while(!inputValid){
            try{
                System.out.println("Rentrer un float :");
                value = this.sc.nextFloat();
                inputValid = true;
            } catch(InputMismatchException e){
                System.out.println("Merci de rentrer un float !");
                this.sc.next();
            }
        }

        return value;
    }

    public double getDouble(){
        boolean inputValid = false;
        double value = 0;
        while(!inputValid){
            try{
                System.out.println("Rentrer un double :");
                value = this.sc.nextDouble();
                inputValid = true;
            } catch(InputMismatchException e){
                System.out.println("Merci de rentrer un double !");
                this.sc.next();
            }
        }

        return value;
    }
}
