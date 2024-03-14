import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Scanner input = new Scanner(System.in);

    private int førsteVærdi;
    private int andenVærdi;

    private boolean isRunning = true;
    private int userChoice;

    public void startProgram(){

        System.out.println("Velkommen til min Hobby lommeregner");


        do {

            velkomst();

            try {
                userChoice = Integer.parseInt(input.nextLine());
            } catch (InputMismatchException | NumberFormatException ime) {
                System.out.println("Skal være et tal!");
            }

            switch (userChoice){
                case 1 -> addition();
                case 2 -> subtraktion();
                case 3 -> multiplikation();
                case 4 -> division();
                case 10 -> stopProgrammet();
            }

        }while (isRunning);

    }

    private void velkomst() {

        System.out.println("""
                1. Addition   \s
                2. Subtraktion           \s
                3. Multiplikation     \s
                4. Division         
                10. Gå ud af programmet
                """);
    }

    private void addition(){
        System.out.print("Indtast første værdi: ");
        førsteVærdi = Integer.parseInt(input.nextLine());

        System.out.print("Indtast anden værdi: ");
        andenVærdi = Integer.parseInt(input.nextLine());

        int samlet = førsteVærdi + andenVærdi;

        System.out.println(samlet);

    }

    private void multiplikation(){
        System.out.print("Indtast første værdi: ");
        førsteVærdi = Integer.parseInt(input.nextLine());

        System.out.print("Indtast anden værdi: ");
        andenVærdi = Integer.parseInt(input.nextLine());

        int samlet = førsteVærdi * andenVærdi;

        System.out.println(samlet);
    }

    private void division(){
        System.out.print("Indtast første værdi: ");
        førsteVærdi = Integer.parseInt(input.nextLine());

        System.out.print("Indtast anden værdi: ");
        andenVærdi = Integer.parseInt(input.nextLine());

        int samlet = førsteVærdi / andenVærdi;

        System.out.println(samlet);
    }

    private void subtraktion(){
        System.out.print("Indtast første værdi: ");
        førsteVærdi = Integer.parseInt(input.nextLine());

        System.out.print("Indtast anden værdi: ");
        andenVærdi = Integer.parseInt(input.nextLine());

        int samlet = førsteVærdi - andenVærdi;

        System.out.println(samlet);
    }


    private void stopProgrammet() {
        System.out.println("Programmet er hermed stoppet");

        isRunning = false;
    }
}
