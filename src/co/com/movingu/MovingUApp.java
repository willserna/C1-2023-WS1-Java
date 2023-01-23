package co.com.movingu;

import co.com.movingu.ticket.Ticket;
import co.com.movingu.user.User;
import co.com.movingu.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MovingUApp {

    public static void main(String[] args) {
        //Lists that contains data related to the WS
        List<User> users = new ArrayList<>(){{
            //add(new Student("Carolina Montoya", 24, "0976152443", "201547896"));
            //add(new Trainer("Washington Velásquez", 36, "0976159993", "Lecturer"));
            //add(new Student("Ariana Vélez", 18, "0911152443", "202047800"));

        }};

        List<Vehicle> vehicles= new ArrayList<>(){{
            //add(new Bicycle("B-001","red",true, true, "M"));
            //add(new Bicycle("B-002","blue",false, false, "M"));
            //add(new Bicycle("B-003","red",true, true, "R"));
            //add(new Bicycle("B-004","green",false, true, "R"));
            //add(new Bicycle("B-005","grey",true, true, "M"));
            //add(new Scooter("S-001","black",false, true, 20));
            //add(new Scooter("S-002","blue",true, true, 50));
            //add(new Scooter("S-003","grey",true, true, 80));
            //add(new Scooter("S-004","grey",true, false, 50));
            //add(new Scooter("S-005","black",false, false, 50));

        }};

        List<Ticket> tickets = new ArrayList<>(){{
            //add(new Ticket());
            //add(new Ticket());
            //add(new Ticket());

        }};

        //TO DO: Implement the necessary logic to make the menu work
        menu();


    }

    public static void menu(){
        System.out.println("Moving - U");
        System.out.println("1. Register user");
        System.out.println("2. Borrow/Return");
        System.out.println("3. Pay a ticket");
        System.out.println("4. Check availability");
        System.out.println("5. Exit");
    }

}