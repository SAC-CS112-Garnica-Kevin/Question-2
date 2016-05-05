
package question.pkg2;

import java.util.Scanner;


public class Question2 {

    
    public static void main(String[] args) 
    {
        String model;
        String brand; 
        String color;
        String name;
        String userAnswer; 
        int year;
        int gears;
        int cycles = 0; 
        double totalDistance = 0; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input the year of the car");
        year = scan.nextInt();
        
        System.out.println("Please input the number of gears in your car");
        gears = scan.nextInt();
        
        System.out.println("Please input the name of the car");
        name = scan.nextLine();
        
        System.out.println("Please input the model of your car");
        model = scan.nextLine();
        
        System.out.println("Please input the brand of your car");
        brand = scan.nextLine();
        
        System.out.println("Please input the color of your car");
        color = scan.nextLine();
        
        Automoblie.carAttributes( brand, model, color,
                                         name, year, gears);
        
        do 
        {
            
            cycles++;
            Automoblie.DistanceTraveled(cycles);
            totalDistance += Automoblie.DistanceTraveled(cycles);
            System.out.print("Your " + color + " " + " " + year + " " + brand + " " + model + " has traveled "); 
            System.out.println(totalDistance + " Miles");
            System.out.println("Current Cycle is " + cycles + ". Do You Wish to Increase It?");
            userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase("yes"))
            {
                
            }
            else if (userAnswer.equalsIgnoreCase("no"))
            {
                break; 
            }
            
        }while (true);
        
        
        
        
        
        
       
    }
    
}
