public class  UnitCastingConverter {
    public static void main(String[] args) {
        
        double cm = 254.75;

        int meters = (int) (cm / 100); 
        double leftOverCm = cm % 100;

        System.out.println(cm + " cm is equal to:");
        System.out.println(meters + " meters and " + leftOverCm + " centimeters");

        int meInt= 50;
        double meDouble = meInt; 
        
        System.out.println("int: " + meInt);
        System.out.println("widened double: " + meDouble);
        // This doesn't need a cast because a double is bigger than an int, 
        // so Java just automatically changes it without losing data.

        double originalDouble = 75.85;
        int standardInt = (int) originalDouble; 
        
        System.out.println("double: " + originalDouble);
        System.out.println("narrowed int: " + standardInt);
        // When forcing a double into an int using (int), the entire 
        // decimal part (.85) gets cut off. So we lose all the decimal accuracy.
    }
}
