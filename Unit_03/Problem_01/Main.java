package Unit_03.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 01

/*
 * Description: Create a class that describes one room in a house. The room will
 * have walls that are painted a color. The floor will either be hard wood,
 * carpeting, or tiled. The room may or may not have windows, but it is possible
 * to have multiple windows in the room. This class must include a constructor
 * that takes no input arguments and also an overloaded constructor that takes
 * an input argument for each attribute. The class must include a set and get
 * method for each attribute. The class must also include a method that will
 * print out the current values of all attributes to the console. Create a main
 * method that is in a separate class. The main method will create one room that
 * is painted yellow with hard wood flooring, and 1 window. The main method must
 * create a second room that is painted purple, has tiled floors, and has no
 * windows. The main method must also create a room that is carpeted and painted
 * white with 3 windows. Each of these rooms must be created and printed out in
 * the main method.
 *
 * Assumptions: - Windows do not have positions, they simply exist in number -
 * Rooms do not have doors or any other way to connect to another room -
 * Therefore rooms cannot be connected - Colours will be denoted using a String
 * obj not a java.awt.Color obj - Thou shalt spell colour with a 'u' - And the
 * Lord spake, saying, "First shalt thou type out the 'colo'. Then shalt thou
 * finish with 'ur'. Not 'r'. Not 'u'. Colour shalt be the word thou shalt
 * write, and the word of the writting shall be colour. color shalt thou not
 * write, neither write thou colo, excepting that thou then proceed to colour.
 * Coloror is right out. Once at the letter 'r', being the sixth letter to be
 * reached, then, lobbest thou thy Holy Hand Grenade of Antioch towards thy foe,
 * who, being naughty in My sight, shall snuff it." - The floor type will also
 * be a string, although I could make it a byte then set constants to define
 * which type of floor coresponds with which number, I think this is the easier
 * solution
 *
 * Pseudocode: Room(class): create attribute and get/set methods for them: - int
 * nWindows - String strColour - String strFloorType main(method): 1. create
 * room1 - yellow hard wood flooring 1 window 2. create room2 - purple tiled
 * floors 0 windows 3. create room3 - white carpeted 3 windows 4. print room
 * info
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // step 1 - demonstrating methods
    Room room1 = new Room();
    room1.setColour("yellow");
    room1.setFloorType("hard wood");
    room1.setWindows(1);

    // step 2 - demonstrating overloaded constructor
    Room room2 = new Room("pruple", "tiled", 0);

    // step 3 - optimized mutator mthods
    Room room3 = new Room();
    room3.setFloorType("carpeted");
    room3.setWindows(3);

    // step 4
    System.out.printf("Room 1: %s\n", room1);
    System.out.printf("Room 2: %s\n", room2);
    System.out.printf("Room 3: %s\n", room3);

    // close stream
    input.close();

    System.exit(0);
  }
}
