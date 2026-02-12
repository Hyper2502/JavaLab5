import java.util.Scanner;
public class CellPhoneService {

    public static String bestPlan(int talkMinutes, int textMessages, int dataMobile){
        if(talkMinutes < 500 && textMessages == 0 && dataMobile == 0){
            return "Plan A at $49 per month";
        } else if (talkMinutes < 500 && textMessages > 0 && dataMobile ==0) {
            return "Plan B at $55 per month";
        } else if (talkMinutes >= 500 && dataMobile ==0) {
            if(textMessages < 100){
                return "Plan C for $61 per month";
            }else
                return "Plan D for $70 per month";
        } else if (talkMinutes >= 0 && textMessages >= 0) {
            if (dataMobile <3){
                return "Plan E for $79 per month";
            }else
                return "Plan F for $87 per month";
        }
        return "None";
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Welcome to Horizon Phones \nPlease Provide the following information:\nTalk Minutes:");
            int talkMinutes = sc.nextInt();
            System.out.println("Text Messages:");
            int textMessages = sc.nextInt();
            System.out.println("Data needed:");
            int dataMobile = sc.nextInt();
            System.out.println(bestPlan(talkMinutes, textMessages, dataMobile));
        }
    }
}