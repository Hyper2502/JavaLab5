import java.util.Scanner;

public class ShadyRestRoom2 {
    public static String ChooseOption(int option){
        switch(option){
            case 1:
                return "$125 for a suit wih a queen bed.";
            case 2:
                return "$139 for a suit with a king bed.";
            case 3:
                return "$165 for a suite with a king bed and a pullout couch.";
            default:
                return "Invalid option. Please try again.";
        }

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Hello! Welcome to Shady Restroom. Please enter the number of the room and we will give you the price! (1-2-3)");
            int Option = sc.nextInt();
            System.out.println(ChooseOption(Option));
        }
    }
}

