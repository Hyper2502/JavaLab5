import java.util.Scanner;

public class ShadyRestRoom2 {
    public static String ChooseOptionSuite(int option){
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
    public static String ChooseLakeOption(int option, int SuiteChoosen){
       int value = 0;
        switch(SuiteChoosen){
            case 1:
                value = 125;
                break;
            case 2:
                value = 139;
                break;
            case 3:
                value = 165;
                break;
            default:
                value = 1;
                break;
        }
        switch(option){
            case 1:
                value = value + 15;
                return "The total with your suite and with lake view would be: " + value;
            case 2:
                return "The total with your suite and with park view would be:" + value;
            default:
                return "Hola";
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Hello! Welcome to Shady Restroom. Please enter the number of the room and we will give you the price! \n(1-2-3)");
            int Option = sc.nextInt();
            System.out.println(ChooseOptionSuite(Option));
            if(Option <= 3){
                System.out.println("What type of view would you like?\n1-Lake view \n2-Park View ");
                int LakeOption = sc.nextInt();
                System.out.println(ChooseLakeOption(LakeOption, Option));
            }
        }
    }
}

