/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password.creator;

/**
 *
 * @author kevin
 */

import java.util.Scanner;

public class PasswordCreator 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner scnr = new Scanner(System.in);
        boolean repeat = true;
        
        System.out.println("Hello there! This is a password generator that creates passwords in a vareity of ways.");
        System.out.println("You can create totally random passwords at any length you wish.");
        
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c",
            "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "_", "=", ":", ";", "?"};
        
        while(repeat == true)
        {
            System.out.println("Type the length of the password you desire");
            int passwordLength = scnr.nextInt();
            scnr.nextLine();
        
            for(int x = 0; x < passwordLength; x++)
            {
                int chance = (int)(1 + (Math.random() * 3));
            
                switch (chance)
                {
                    case 1 -> System.out.print(alphabet[(int)(Math.random() * (alphabet.length - 1))]);
                    case 2 -> System.out.print(numbers[(int)(Math.random() * numbers.length)]);
                    case 3 -> System.out.print(specialCharacters[(int) (Math.random() * specialCharacters.length)]);
                    default -> {}
                }
            
            }
            
            System.out.println();
            
            System.out.println("Would you like another password?");
            String response = scnr.nextLine();
            
            if(response.equalsIgnoreCase("yes") == true)
            {
                repeat = true;
            }
            else if(response.equalsIgnoreCase("no") == true)
            {
                System.exit(0);
            }
        }
    }  
}
