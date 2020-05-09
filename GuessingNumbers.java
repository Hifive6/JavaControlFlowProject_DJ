import java.util.Scanner;
import java.util.Random;
public class GuessingNumbers {
    public static void userLotteryNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("May I have your name");
        String userName = scan.nextLine();
        
        System.out.println("Hello " + userName + " Would you like to continue to the interactive portion yes or no? ");
        String userAnswer = scan.nextLine();

        if(userAnswer.equalsIgnoreCase("y") || (userAnswer.equalsIgnoreCase(("yes")))){
            System.out.println("Great to hear. Please add the following Questions: ");
        } else {
            System.out.println("Please return later to complete the survery");
            System.exit(0);
        }
        
        String continueLottery;
        String getNumbers;
        
        do{
            String redCar;
            String favoritePet;
            int petAge;
            int luckyNumber;
            int jerseyNumber;
            int carYear;
            int randomUserNumber;
            String favoriteActor;

            do{
                System.out.print("Do you have a red car: yes or no ");
                redCar = scan.nextLine();

                System.out.print("What is the name of your favorite pet: ");
                favoritePet = scan.nextLine();

                System.out.print("How old is this pet: ");
                petAge = scan.nextInt();

                System.out.print("What is your lucky number: ");
                luckyNumber = scan.nextInt();

                // System.out.print("Do you have a favorite sport star: y or no?");
                // String userSportsStar = scan.nextLine();
                
                // if((userSportsStar.equalsIgnoreCase("y")) || (userSportsStar.equalsIgnoreCase("yes"))) {
                //     System.out.println("If so what is their jersey number?");
                //     jerseyNumber = scan.nextInt();
                // } 

                System.out.print("What is the two-digit model year of your car? ");
                carYear = scan.nextInt();

                System.out.print("Now choose a number between 1 - 50? ");
                randomUserNumber = scan.nextInt();

                System.out.println("What is the first name of the your favorite actor or actress? ");
                favoriteActor = scan.next();

                

                System.out.println("Would you like different answers to your questions: yes or no? ");
                getNumbers = scan.next();


             } while ((getNumbers.equals("yes")) || (getNumbers.equals("y")));

            Random random = new Random();
            int rand1 = random.nextInt(20);
            int rand2 = random.nextInt(20);

            int magicNumber = luckyNumber * rand2;

            while(magicNumber > 75){
                magicNumber = magicNumber - 75;
            }

            int lotteryNumber1 = 42;

            int lotteryNumber2 = rand1 + luckyNumber;
            while(lotteryNumber2 > 65){
                lotteryNumber2 = lotteryNumber2 - 65;
            }

            int lotteryNumber3 = petAge + carYear;
            // System.out.println("Value of lottery Number 3 is:" + lotteryNumber3);

            int lotteryNumber4 = favoritePet.charAt(2);
            while(lotteryNumber4 > 65){
                lotteryNumber4 = lotteryNumber4 - 65;
            }
           
            int lotteryNumber5 = favoriteActor.charAt(0);
            while(lotteryNumber5 > 65){
                lotteryNumber5= lotteryNumber5 - 65;
            }
            

            System.out.println();
            System.out.println("Your Winning Lottery Numbers are!!!");

            System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d Magic Number: %d%n", lotteryNumber1, lotteryNumber2, lotteryNumber3, lotteryNumber4, lotteryNumber5, magicNumber);


            System.out.println("Would you like to play again: yes or no?");
            continueLottery = scan.next();
        }while((continueLottery.equalsIgnoreCase("y")) || (continueLottery.equalsIgnoreCase("yes")));
            System.out.println("Thank you goodbye");
            System.exit(0);


        scan.close();

    //     while(true){
            
    //         {
    //           
    //             do {
                    
    //                 System.out.println("Do you have a red car: yes or no");
    //                 
    //                 
    //                 
    //                 System.out.println("Do you have a favorite sport star and what is there jersey number?");
    //                 
                   
    //                 String redCar = scan.nextLine();
    //                 String favoritePet = scan.nextLine();
    //                 int petAge = scan.nextInt();
    //                 int luckyNumber = scan.nextInt();
    //                 int jerseyNumber = scan.nextInt();
    //                 int carYear = scan.nextInt();
    //                 int randomUserNumber = scan.nextInt();
    //                 String favoriteActor = scan.next();
    //                 int maxRandomNumber = 65;
    //                 int maxMagicNumber = 75;

    //                 Random random = new Random();
    //                 int rand1 = random.nextInt(75);
    //                 int rand2 = random.nextInt(10);
    //                 int rand3 = random.nextInt(10);
                    

    //                 
    //                 int magicNumber1 = jerseyNumber * rand3;

    //                 int lotteryNumber1 = rand1 + luckyNumber;
    //                 
    //                 //find 3rd letter of favorite pet, convert letter to value
    //                 
    //                 System.out.println("Value of this is: " + thirdLetterInPetName);
    //                 int lotteryNumber4 = Character.getNumericValue(thirdLetterInPetName);
    //                 System.out.println("This is the value: " + lotteryNumber4);
    //                 char firstLetterOfFavoriteActor = favoritePet.charAt(0);
    //                 int lotteryNumber5 = Character.getNumericValue(firstLetterOfFavoriteActor);
                    
    //                 System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d Magic: %d", lotteryNumber1, lotteryNumber2, lotteryNumber3, lotteryNumber4, lotteryNumber5, magicNumber);

    //                 System.out.println();
    //                 System.out.println("Would you like to have another set of Numbers be Shown: y or n");
    //                 continueLottery = scan.nextLine();



                
    //             } while((continueLottery.equalsIgnoreCase("no")) || (continueLottery.equalsIgnoreCase("n")));
    //             System.out.print("Thank you and have a good day!");
    //             System.exit(0);
                
                
                
    //             scan.close();
    //         }

    //     }
        


     }
}