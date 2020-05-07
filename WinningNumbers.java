import java.util.Scanner;
public class WinningNumbers {

   public static void lotteryWinner(){
       
       String playAgain = " ";
       Scanner scanner = new Scanner(System.in);
       
       do{
        //    WinningNumbers.lotteryWinner();
           System.out.println("Would you like to play again? Enter Y to play again or any other key to quit: ");
           playAgain = scanner.nextLine();

       }
          while(playAgain.equalsIgnoreCase("Y"));
           System.out.println("Thanks for playing!");

           scanner.close();
    }
}
       
    // }
    //    public static void lotteryGuess(){

    //    }
       
    //    System.out.println("Welcome, May I have your Name: ");
       
    //    while(true){
    //        String userName = scanner.next();
        
    //        System.out.printf("Hello %s would you like to continue to the interactive portion: yes or no? ", userName);
        
    //        String userAnswer = scanner.next();

    // if("n".equals(userAnswer) || ("no".equals(userAnswer))){
    //     System.out.println("Please come back later to finished survey");
    //     break;
    // } else {
        
    // }
    
    // scanner.close();   
// }
//    }
    
