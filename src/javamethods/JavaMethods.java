/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javamethods;

import java.util.Scanner;

/**
 *
 * @author EvMcQ5970
 */
public class JavaMethods {

    /**
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int select = 0;
        // A menu to draw a house in parts
        // 1. Select 1 to draw a roof.
        // 2. Select 2 to draw a base.
        // 3. Select 3 to draw a walk.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from the following: ");
        System.out.println("Select 1 to draw a roof");
        System.out.println("Select 2 to draw a base");
        System.out.println("Select 3 to draw a walk");
        
        System.out.println("Select 4 to draw a skyscraper roof");
        System.out.println("Select 5 to draw a lighthouse roof");
        
        select = input.nextInt();
        if (select == 1){
            
            addRoof();
            
        } else if (select == 2){
            
            addBase();
            
        } else if (select == 3){
            
            addWalk();
            
        } else if (select == 4){
            
            addSkyRoof();
            
        } else if (select == 5){
            
            addLightRoof();
            
        }
    }
    
    /**
     * 
     * What this method does
     * Preconditions-
     * Postconditions-
     * 
     * addRoof()
    */
    
    public static void addRoof(){
        
        System.out.println("   /\'");
        System.out.println("  /  \'");
        System.out.println(" /    \'");
        System.out.println("/______\'");
        
    }
    /**
     * 
     * What this method does
     * Preconditions-
     * Postconditions-
     * 
     * addBase()
    */
    
    public static void addBase(){
        
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
        
    }
    /**
     * 
     * What this method does
     * Preconditions-
     * Postconditions-
     * 
     * addWalk()
    */
    
    public static void addWalk(){
        
        System.out.println("  **");
        System.out.println("  ******");
        
    }
    // addWalk()
    
    public static void addSkyRoof(){
        
        System.out.println("|------|");
        
    }
    
    public static void addLightRoof(){
        
        System.out.println("   |-|  ");
        System.out.println(" /-___-\'");
        System.out.println("  |   |  ");
        System.out.println("--|___|--");
        System.out.println("\'______/");
        
    }
    
}
