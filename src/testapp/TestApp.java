/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;
import java.util.Scanner;
/**
 *
 * @author Dima
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Scanner in = new Scanner(System.in);
System.out.print("1st num: ");
double a = Double.valueOf(in.nextLine());
System.out.print("2nd num: ");
double b = Double.valueOf(in.nextLine());
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("GIT test application");
System.out.println("GIT test application");
System.out.println("GIT test application");

}
}