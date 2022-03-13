public class Car {
    private String model;
    private String color;
    private int year;
    private double currentSpeed;
    
    public void initialize(String model, String color, int year, double currentSpeed){
        this.model = model;
        this.color = color;
        this.year = year;
        this.currentSpeed = currentSpeed;
    }
    
    public void display(){
        System.out.println("Initialize and display:");
        System.out.println(this.model + ", " + this.color + ", " + this.year + ", " + "(" + this.currentSpeed + ")"); 
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }
    public double getSpeed(){
        return this.currentSpeed;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setSpeed(double speed){
        this.currentSpeed = speed;
    }
}


