/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumbergame;

//include java librarys.
import java.util.Scanner;
/**
 *
 * @author michael
 */
public class GuessTheNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Call the object that contains the game.
        Game game = new Game();
        
        //Make a call to the method of the class.
        game.StartGame();
    }
    
    //Class that has the easy mode.
    public static class EasyNumber{
        Game game = new Game();
        private int myNumber;
        private double ran;
        Scanner input = new Scanner(System.in);
        
        public void playEasy(){
            do{
                //Make random number generator.
                ran = Math.random() * 10;
                //Convert the randomNumber to a integer.
                int newNumber = (int)ran;
             //Print out what the user must do.
                System.out.println("The number is between 1 and 10 good luck.\nTo exit enter -0.");
                //Make the variable for user input.
                myNumber = input.nextInt();
            
                if(myNumber < newNumber){
                    System.out.println("Your guess was to low.");
                }
                else if(myNumber > newNumber){
                    System.out.println("Your guess was to high.");
                }
                else if(myNumber == -0){
                    System.out.println("Thank you for playing.");
                    game.StartGame();
                }
                else
                    System.out.println("Good job go eat a donut...");
            }while(myNumber != -0);
        }
        
    }
    
    //Class that is hard mode
    public static class HardNumber{
        private int myNumber;
        private int ran;
        private double hardNumber;
        private int numberTried = 0;
        private int counter;
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        
        public void hardGuess(){
            System.out.println("You have 5 tries to get the correct answer.\n");
            for(int i = 5; i > numberTried; i--){
                hardNumber = Math.random() * 20;
                myNumber = input.nextInt();
                
                ran = (int) hardNumber;
                if(myNumber < ran){
                    System.out.println("Your guess was to low.\nYou have " + i + " tries remaining.\nThe correct number was: " + ran);
                }
                else if(myNumber > ran){
                    System.out.println("Your guess was to high.\nYou have " + i + "tries remaining.\nThe correct answer was: " + ran);;
                }
                else if(myNumber == ran){
                    System.out.println("You did it. " + i + " tries remaing.\n" + counter++ + " Correct so far.\nTry to get the rest correct.");
                }
            }
            game.StartGame();
        }
    }
    
    //Class that is impossible
    public static class Impossible{
        private int myNumber;
        private int ran;
        private double cookoo;
        private int numberTried = 0;
        private int numberCorrect = 0;
        private int numberIncorrect = 0;
        
        Scanner input = new Scanner(System.in);
        
        public void justNo(){
            System.out.println("You asked for it.\nNow try to get out of it haha.\nNumber to guess 0 to 500000");
            do{
                cookoo = Math.random() * 5000000;
                ran = (int) cookoo;
                myNumber = input.nextInt();
                if(myNumber < ran){
                    System.out.println("Your number was to low.\nSo far " + numberTried++ + "tried, and " + numberIncorrect++ + " incorrect.");
                    System.out.println("The correct Number was: " + ran);
                }
                else if(myNumber > ran){
                    System.out.println("Your number was to high.\nSo far" + numberTried++ + "tried, and " + numberIncorrect++ + " incorrect.");
                    System.out.println("The correct Number was: " + ran);
                }
                else if(myNumber == ran){
                    System.out.println("Wow your luck after: " + numberTried + " of tries, and " + numberIncorrect + " of incorrect tries.\nOh did you know the number to exit was -1? HAHAHAHA" + numberCorrect++);
                }
            }while(myNumber != -1);
        }
    }
    
    //Class that starts the game
    public static class Game{
        private int userSelect;
        
        public void StartGame(){
            Scanner gameSelect = new Scanner(System.in);
            EasyNumber easyNumber = new EasyNumber();
            HardNumber hardNumber = new HardNumber();
            Impossible haha = new Impossible();
            do{
                System.out.println("Thank you for playing Guess The Number.");
                System.out.println("Enter 1 for Easy Mode.");
                System.out.println("Enter 2 for Hard Mode.");
                System.out.println("Enter 3 for impossible Mode.");
                System.out.println("Enter -1 to quit the game.");
                
                userSelect = gameSelect.nextInt();
                
                switch(userSelect){
                    case 1: easyNumber.playEasy();
                    break;
                    case 2: hardNumber.hardGuess();
                    break;
                    case 3: haha.justNo();
                    break;
                }
            }while(userSelect != -1);
        }
    }
}