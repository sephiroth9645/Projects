/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathchart;

//import librarys to use
import java.util.Scanner;
/**
 *
 * @author michael
 */
public class MathChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is multiplication number that you want to see?");
        int N = input.nextInt();
        System.out.println("How far would you like to count up to?");
        int newN = input.nextInt();
        System.out.print("      |");
        for(int i = 1; i <= newN; i++)
            System.out.print(pad(i) + " ");
            System.out.println();
            System.out.print("------+");
            for(int i = 1; i <= newN; i++)
                System.out.print("-------");
                System.out.println();
                for(int i = 1; i <= N; i++)
                {
                    System.out.print(pad(i) +"|");
                    for(int j = 1; j <= newN; j++)
                    {
                        System.out.print(pad(i*j) + " ");
                    }
                    System.out.println();
                }
    }
    public static String pad(int x)
    {
        String s = new String();
        if(x < 10) s = "     " + x;
        else if(x < 100) s = "    " + x;
        else if(x < 1000) s = "   " + x;
        else if(x < 10000) s = "  " + x;
        else if(x < 100000) s = " " + x;
        else s = "" + x;
        return s;
    }
}
