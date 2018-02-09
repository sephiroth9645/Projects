/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

//Call the Scanner library.
import java.util.Scanner;

/**
 *
 * @author michael
 */
public class GradeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade book.\nHow many students are in your class?\nPlease no spaces between the names thank you.");
        int teacher = input.nextInt();
        String[] stName = new String [teacher];
        
        int grade[] = new int[teacher];
        
        for(int i = 0; i < teacher; i++){
            Scanner stInput = new Scanner(System.in);
            System.out.println("What is your students name?");
            stName[i] = stInput.next();
            System.out.println("What did " + stName[i] + " score?");
            grade[i] = stInput.nextInt();
            
            for(int j = 0; j <= i; j++)
            {
                System.out.println(stName[j] + " earned " + grade[j]);
            }    
        }
    }
}
