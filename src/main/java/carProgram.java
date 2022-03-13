import java.util.Scanner;

public class carProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        Car car = new Car();
        Car car2 = new Car();
        
        car.initialize("Ford","Red", 2018, 43);
        car.display();
        car2.initialize("Mazda","Grey",2012, 42);
        car2.display();
        
        car.setModel("Not Ford");
        car.setColor("Not Red");
        car.setYear(1999);
        car.setSpeed(10);
        
        car.display();
        
        car2.setModel("Not Mazda");
        car2.setColor("Not Gray");
        car2.setYear(1820);
        car2.setSpeed(9001);
        car2.display();

    }
    
}
