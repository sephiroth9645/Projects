/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputname;

//call the Scanner library
import java.util.Scanner;
/**
 *
 * @author michael
 */
public class InputName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Call the Scanner object
        Scanner input = new Scanner(System.in);
        
        //Ask user to input their name.
        System.out.println("What is your name?");
        //String to hold input value
        String name = input.next();
        
        //print out information to the screen
        System.out.println("Welcome " + name + " to CS 100.");
    }
    
}
