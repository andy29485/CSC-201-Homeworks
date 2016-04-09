package unit_03.problem_04;

// Name: Andriy Zasypkin
// Date: 2016-02-08
// Unit: 03
// Problem: 04

/*
 * Description: A Book has such properties as title, author, and numberOfPages.
 * A Volume will have properties such as volumeName, numberOfBooks, and an array
 * of book objects (Book [ ]). You are required to develop the Book and Volume
 * classes, then write an application (DemoVolume) to test your classes. The
 * directions below will give assistance. Create a class called Book with the
 * following properties using appropriate data types: Title, Author,
 * numberOfPages, Create a second class called Volume with the following
 * properties using appropriate data types: volumeName, numberOfBooks and Book [
 * ]. The Book [ ] contains an array of book objects.
 *
 * Directions - Create a class called Book with the following properties using
 * appropriate data types: Title, Author, numberOfPages, - The only methods
 * necessary in the Book class, for this exercise, are the constructor and a
 * toString(). - Create a second class called Volume with the following
 * properties using appropriate data types: volumeName, numberOfBooks and Book [
 * ]. Book [ ] will contain an array of book objects. - The only methods
 * necessary in the Volume class, for this exercise, are the constructor,
 * toString() and getBookArray(). The getBookArray returns a string of book
 * properties for each book. - Create an application called DemoVolume. - In the
 * main method, - Create an array of book objects to be added to the volume. -
 * Create a volume object called volume1. - Display the properties of volume1.
 *
 * Assumptions: - I will loose points for calling my main class Main insted of
 * DemoVolume - So I should just rename it... - However, consistency is key...
 * Main it shall be - Volume.getBookArray() will return one book.toString() per
 * line - I see no point in numberOfBooks, but oh well. - Not sure what
 * Volume.toString() does... oh... - Assuming typo: toString() returns a string
 * of book properties - getBookArray() returns an array of books - Poor
 * volumeName gets left out... - Assuming Volume.toString() also prints volume
 * name - No input is needed
 *
 * Pseudocode: Main.main 1. create array of books 2. create volume from
 * array(see step 1 - not that you need to look) 3. print volume thing
 *
 * Book.toString 1. return string formated with with all book properties
 *
 * Volume.toString 1. create StringBuilder - with volume name 2. for each book:
 * 2.1 append book.toString to StringBuilder 3. return StringBuilder toString
 */

public class Main {
  public static void main(String[] args) {

    // step 1 - as the assumptions specify, no input is needed
    Book[] books =
        {new Book("Alice in Wonderland", "Lewis Carroll", 92),
         new Book("Through the Looking-Glass", "Lewis Carroll", 228)};

    /*
     * //In the case that you(the reader of this comment) feel that there is a
     * // need for input please feel free to make changes to the code as //
     * specified in this comment
     * 
     * //Change 1 - add an import statement before "public class Main {" import
     * java.io.*;
     * 
     * //Change 2 - change main method header public static void main(String[]
     * args) throws IOException {
     * 
     * //Change 3 - change step 1 of the code to BufferedReader input = new
     * BufferedReader(new InputStreamReader(System.in)); System.out.print(
     * "Enter number of books: "); Book[] books = new
     * Book[Integer.valueOf(input.readLine())]; for(int i=0; i<books.length;
     * i++) { System.out.printf("Enter title of book %d", i+1); String tmp_ttl =
     * input.readLine(); System.out.printf("Enter name of author of book %d",
     * i+1); String tmp_aut = input.readLine(); System.out.printf(
     * "Enter number of pages in book %d", i+1); int tmp_pgs =
     * Integer.valueOf(input.readLine());
     * 
     * books[i] = new Book(tmp_ttl, tmp_aut, tmp_pgs); }
     * 
     */

    // step 2
    Volume volume1 = new Volume("Alice's Adventures in Wonderland", books);

    // step 3
    System.out.println(volume1.toString());

    System.exit(0);
  }
}
