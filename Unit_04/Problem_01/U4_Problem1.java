package Unit_04.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-03-09
// Unit: 04
// Problem: 01

/*
 * Description: Design and implement a set of classes that keeps track of
 * various sports statistics. Have each low-level class represent a specific
 * sport. Tailor the services of the classes to the sport in question, and move
 * common attributes to the higher-level classes as appropriate. Create a main
 * driver class to instantiate and exercise several of the classes.
 *
 * Assumptions: - Classes keep track of statistics per team, not the entire
 * sport - I only need to make two clases - Classes need to know what sport they
 * belong to - Ties count as half a win when calculating win percentages - Input
 * will be hard-coded
 *
 * Pseudocode: 1. mostly get/set methods, nothing intersting 2. win ratio
 * calculation method: - return (nWins + 0.5*nTies)/(nWins + nTies + nLosses);
 * 3. declare bogus sport statistics and print them out
 */

public class U4_Problem1 {
  public static void main(String[] args) {
    Soccer s1 = new Soccer("soccer team 1");
    s1.setWins(4);
    s1.setLosses(2);
    s1.setShotsMade(10);
    s1.setShotsMissed(40);

    Soccer s2 = new Soccer("soccer team 2");
    s2.setWins(2);
    s2.setLosses(5);
    s2.setShotsMade(5);
    s2.setShotsMissed(3);

    Hockey h1 = new Hockey("hockey team 1");
    h1.setWins(2);
    h1.setLosses(1);
    h1.setShotsMade(4);
    h1.setShotsMissed(20);
    h1.setPenaltyShotsMade(0);
    h1.setPenaltyShotsMissed(2);

    Hockey h2 = new Hockey("hockey team 2");
    h2.setWins(4);
    h2.setLosses(2);
    h2.setShotsMade(6);
    h2.setShotsMissed(40);
    h2.setPenaltyShotsMade(2);
    h2.setPenaltyShotsMissed(1);

    System.out.printf(
        "%s team \"%s\", with win ratio of %.4f " + "and goal ratio of %4f\n",
        s1.getSportName(), s1.getName(), s1.getWinRatio(), s1.getShotRatio());

    System.out.printf(
        "%s team \"%s\", with win ratio of %.4f " + "and goal ratio of %4f\n",
        s2.getSportName(), s2.getName(), s2.getWinRatio(), s2.getShotRatio());

    System.out.printf(
        "%s team \"%s\", with win ratio of %.4f " + "and goal ratio of %4f\n",
        h1.getSportName(), h1.getName(), h1.getWinRatio(), h1.getShotRatio());

    System.out.printf(
        "%s team \"%s\", with win ratio of %.4f " + "and goal ratio of %4f\n",
        h2.getSportName(), h2.getName(), h2.getWinRatio(), h2.getShotRatio());

    System.exit(0);
  }
}
