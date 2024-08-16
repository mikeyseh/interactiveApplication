import java.util.Scanner;

public class InteractiveApplication {
   
    public static void main(String[] args) {
     //variable initialization and declaration
        String name;
        int age;
        String surname;
        String maritualStatus;
        String institution;
        int bankBalance;
        String favouriteColour;
        String initials;
        int valueOne = 0;
        int valueTwo = 0;
        int sum = valueOne + valueTwo ;
        int valueOneAddedWithOne = valueOne + 1;
        int valueTwoDivide = valueTwo/2;
        //User input with variables and methods
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.println("Please enter your surname: ");
        surname = inputDevice.nextLine();
        System.out.println("Please enter your maritual: ");
        maritualStatus = inputDevice.nextLine();
        System.out.println("Please enter your institution: ");
        institution = inputDevice.nextLine();
        System.out.println("Please enter your bank balance: ");
        bankBalance = inputDevice.nextInt();
        System.out.println("Please enter your favourite colour: ");
        favouriteColour = inputDevice.nextLine();
        System.out.println("Please enter your initials: ");
        initials = inputDevice.nextLine();
        System.out.println("Please enter your frst number: ");
        valueOne = inputDevice.nextInt();
       System.out.println("Please enter your second number: ");
        valueTwo = inputDevice.nextInt();
        System.out.println("Your sum is: "+ sum);
        System.out.println(" Your value is: "+ valueOneAddedWithOne );
        System.out.println(" Your quotient is: "+ valueTwoDivide);
      
        }
    
}
