import java.util.Scanner;
public class GuessingNumbers {
    public static void userLotteryNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name");
        String userName = scan.nextLine();

        while(true){
            System.out.println("Hello " + userName + " Would you like to continue to the interactive portion? ");
            String userAnswer = scan.nextLine();
            
            if(userAnswer.equalsIgnoreCase("n")){
                System.out.println("Come back later to complete the survery");
                break;
            }else{
                do {
                    
                    System.out.println("Do you have a red car: yes or no");
                    System.out.println("What is the name of your favorite pet");
                    System.out.println("How old is this pet?");
                    System.out.println("What is you luck number?");
                    System.out.println("Do you have a favorite sport star and what is there jersey number?");
                    System.out.println("What is the two-digit modal year of your car?");
                    System.out.println("Not choose a number between 1 - 50?");
                    System.out.println("What is the first name of the your favorite actor or actress?");
                   
                    String redCar = scan.nextLine();
                    String favoritePet = scan.nextLine();
                    int petAge = scan.nextInt();
                    int luckyNumber = scan.nextInt();
                    int jerseyNumber = scan.nextInt();
                    int carYear = scan.nextInt();
                    int randomUserNumber = scan.nextInt();
                    String favoriteActor = scan.next();
                    int maxRandomNumber = 65;
                    int maxMagicNumber = 75;
                
                    scan.close();
                } while(true);
                
                    

                  
            }

        }
        


    }
}