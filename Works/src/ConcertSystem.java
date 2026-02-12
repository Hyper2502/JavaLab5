public class ConcertSystem
{
    public static void main(String[] args) {
        int age = 24;
        boolean VIPPass = false;

        if (age >= 16) {
            System.out.println("You are eligible to attend the concert.");

            if (VIPPass) {
                System.out.println("You have a VIP pass. Enjoy premium seating and backstage access!");
            } else {
                System.out.println("You need to purchase a regular ticket.");
            }
        } else {
            System.out.println("Sorry, you are not eligible to attend the concert.");
        }
    }
}
//The Output is:
// You are eligible to attend the concert.
//You need to purchase a regular ticket.
/*
What are the advantages of using an if…else statement concerning a single-alternative decision?
The advantages of using if else statement is that we can use it to different situation, regardless about the concert system if
someone is underage the program will output that the underage person is not eligible.
And for the situation, the user is greater than 16 but doesn't have the vip tickets so wouldn't have the vip experience.
If someone accomplish all requirements, they would have the full experience.
 */