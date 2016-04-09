// Name: Andriy Zasypkin
// Date: 2016-01-12
// Unit: 01
// Problem: 01

/*
 * Description: Write a program that displays the defining characteristics of
 * the computer in a format that would attract potential users. Continue your
 * exercise by simulating an upgrade for the computer chosen earlier. Choose a
 * better processor, more RAM, a different hard disk drive, an audio card, a
 * video card, and speakers. Find prices for all the components mentioned above.
 * Continue your program, defining appropriate variables for the new components,
 * and the price of the new, upgraded computer. Read all prices from the user,
 * and calculate the price of the new computer. Display the new configuration,
 * with all the characteristics defined earlier, as well as the price.
 * Assumptions: - Original computer is a list of part names and prices,
 * hardcoded - Original computer price is the sum of all the components - User
 * will enter new part names and prices, inputted - Both the total price of the
 * original computer and user created computer will be displayed - User MUST
 * enter a new name and price for each of the components - however, the new
 * name/price, can be an exact match of the old one - All prices are in USD
 * Pseudocode: 1. declare prices as doubles 2. declare names as string 3. print
 * the components, match strings to doubles 4. print total price, add all
 * doubles together 5. input new names/prices from user 6. print the components,
 * match strings to doubles 7. print total price, add all doubles together
 */

package unit_01.problem_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    // set component prices
    double dProcessor = 199.99; // Intel Core i5-4590
    double dRam = 39.99; // CORSAIR Vengeance 8GB
    double dHDD = 60.99; // WD Purple 1TB Surveillance Hard Disk Drive
    double dAudioCard = 29.99; // ASUS Xonar DG 5.1 Channels 24-bit 96KHz
    double dVideoCard = 51.99; // XFX Radeon R5 230 R5-230A-CLH2
    double dSpeakers = 14.99; // Logitech S120 2.3 Watts (RMS) 2.0 Speakers

    // set component names
    String strProcessor = "Intel Core i5-4590";
    String strRam = "CORSAIR Vengeance 8GB";
    String strHDD = "WD Purple 1TB Surveillance Hard Disk Drive";
    String strAudioCard = "ASUS Xonar strG 5.1 Channels 24-bit 96KHz";
    String strVideoCard = "XFX Radeon R5 230 R5-230A-CLH2";
    String strSpeakers = "Logitech S120 2.3 Watts (RMS) 2.0 Speakers";

    // print hardcoded computer components
    System.out.println("The default computer is:");
    System.out.printf("Processor:  %-55s $%6.2f\n", strProcessor, dProcessor);
    System.out.printf("RAM:        %-55s $%6.2f\n", strRam, dRam);
    System.out.printf("HDD:        %-55s $%6.2f\n", strHDD, dHDD);
    System.out.printf("Audio Card: %-55s $%6.2f\n", strAudioCard, dAudioCard);
    System.out.printf("Video Card: %-55s $%6.2f\n", strVideoCard, dVideoCard);
    System.out.printf("Speakers:   %-55s $%6.2f\n", strSpeakers, dSpeakers);
    System.out.printf("\nTotal cost:  $%.2f\n",
        dSpeakers + dVideoCard + dAudioCard + dHDD + dRam + dProcessor);

    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // name seems like the wrong word to use when asking,
    // but I cannot come up with a better one

    // new processor input from user
    System.out.print("Enter a new name for the processor: ");
    strProcessor = input.readLine();
    System.out.print("Enter a new price for the processor: ");
    dProcessor = Double.valueOf(input.readLine());

    // new ram input from user
    System.out.print("Enter a new name for the RAM: ");
    strRam = input.readLine();
    System.out.print("Enter a new price for the RAM: ");
    dRam = Double.valueOf(input.readLine());

    // new hard disk drive input from user
    System.out.print("Enter a new name for the Hard Disk Drive: ");
    strHDD = input.readLine();
    System.out.print("Enter a new price for the Hard Disk Drive: ");
    dHDD = Double.valueOf(input.readLine());

    // new audio card input from user
    System.out.print("Enter a new name for the Audio Card: ");
    strAudioCard = input.readLine();
    System.out.print("Enter a new price for the Audio Card: ");
    dAudioCard = Double.valueOf(input.readLine());

    // new video card input from user
    System.out.print("Enter a new name for the Video Card: ");
    strVideoCard = input.readLine();
    System.out.print("Enter a new price for the Video Card: ");
    dVideoCard = Double.valueOf(input.readLine());

    // new speakers input from user
    System.out.print("Enter a new name for the speakers: ");
    strSpeakers = input.readLine();
    System.out.print("Enter a new price for the speakers: ");
    dSpeakers = Double.valueOf(input.readLine());

    // close stream
    input.close();

    // print new computer components
    System.out.println("\n\nThe new computer is:");
    System.out.printf("Processor:  %-55s $%6.2f\n", strProcessor, dProcessor);
    System.out.printf("RAM:        %-55s $%6.2f\n", strRam, dRam);
    System.out.printf("HDD:        %-55s $%6.2f\n", strHDD, dHDD);
    System.out.printf("Audio Card: %-55s $%6.2f\n", strAudioCard, dAudioCard);
    System.out.printf("Video Card: %-55s $%6.2f\n", strVideoCard, dVideoCard);
    System.out.printf("Speakers:   %-55s $%6.2f\n", strSpeakers, dSpeakers);
    System.out.printf("\nTotal cost:  $%.2f\n",
        dSpeakers + dVideoCard + dAudioCard + dHDD + dRam + dProcessor);

    System.exit(0);
  }
}
