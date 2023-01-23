package co.com.movingu.vehicle;

//TO DO: Complete/Rewrite the class according to the requirements
public abstract class Vehicle implements Loanable{
    private boolean available;

    private int code;

    private String color;

    public Vehicle(boolean available) {
        this.available = available;
    }

    @Override
    public void updateAvailability(boolean value) {
        this.available = value;
    }
    //TO DO: Attributes

}
