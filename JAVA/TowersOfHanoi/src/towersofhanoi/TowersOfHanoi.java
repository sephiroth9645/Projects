/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;
//Import java libraries as needed.
import java.util.*;

/**
 *
 * @author michael
 */
public class TowersOfHanoi {

    //creat static variable
    public static int N ;
    //Create a stack array
    public static Stack<Integer>[] tower = new Stack[4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();
        
        System.out.println("Enter the number of disks:");
        int num = input.nextInt();
        N = num;
        toh(num);
    }
    //function that pushes disks into stack.
    public static void toh(int n)
    {
        for(int d = n; d > 0; d--)
            tower[1].push(d);
        display();
        move(n, 1, 2, 3);
    }
    
    //recursive function to move disks
    public static void move(int n, int a, int b, int c){
        if(n > 0){
            move(n-1, a, c, b);
            int d = tower[a].pop();
            tower[c].push(d);
            display();
            move(n-1, b, a, c);
        }
    }
    
    //display the results
    public static void display(){
        System.out.println(" A | B | C");
        System.out.println("----------");
        
        for(int i = N - 1; i >= 0; i--){
            String d1 = " ", d2 = " ", d3 = " ";
            try{
                d1 = String.valueOf(tower[1].get(i));
            }catch(Exception e){}
            try{
                d2 = String.valueOf(tower[2].get(i));
            }catch(Exception e){}
            try{
                d3 = String.valueOf(tower[3].get(i));
            }catch(Exception e){}
            System.out.println("| " + d1 + "| " + d2 + " |" + d3);
        }
        System.out.println("\n");
    }
}