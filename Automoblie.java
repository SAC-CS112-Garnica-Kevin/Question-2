
package question.pkg2;

public class Automoblie 
{
    private static String brand;
    private static String model;
    private static String color;
    private static String name;
    private static int year;
    private static double gear;
    private static double distance;
    
    public static void carAttributes(String Brand, String Model, String Color,
                                        String Name, int Year, double Gears)
    {
        name = Name;
        brand = Brand;
        model = Model;
        color = Color; 
        year = Year;
        gear = Gears;
        
        
        
    }
    
    
    
    
    public static double DistanceTraveled(double cycles)
    { 
        
        if (cycles <= gear)
        {
            
            distance = (cycles * 10)/60.00;
        }
        else if (cycles > gear)
        {
            distance = (gear * 10)/60.00;
        }
        return distance; 
    }
    
    

}
