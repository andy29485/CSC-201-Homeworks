package Unit_02.Problem_01;

// Name: Andriy Zasypkin
// Date: 2016-01-25
// Unit: 02
// Problem: 01

/*
 * Description: A troop of Girl Scouts is selling boxes of cookies. The leader
 * of the Girl Scout troop wants to know how many girl scouts sold boxes of
 * cookies in the following ranges: - 00-10 - 11-20 - 21-30 - 31-40 - 41+ The
 * program should use an array of counters to keep track of the number of Girl
 * Scouts selling boxes of cookies in each of these ranges. The number of boxes
 * sold for each Girl Scout will be entered at the keyboard.  The total number
 * of girls in the troop selling cookies will also be entered at the keyboard.
 * After the total boxes for each girl in the troop has been entered, the
 * resulting statistics for the number of boxes should be printed out to the
 * console in the following format: <table border="0" cellspacing="0"
 * cellpadding="0" class="Table1"><colgr oup><col width="164"/><col
 * width="299"/></colgroup><tr class="Table11 "><td style="
 * text-align:left;width:3.747cm; " class="Table1_A1"><p clas s="Standard"><span
 * class="T10">TOTAL BOXES</span></p></td><td style="te
 * xt-align:left;width:6.835cm; " class="Table1_B1"><p class="Standard"><s pan
 * class="T10">NUMBER OF GIRL SCOUTS</span></p></td></tr><tr class="Ta ble11
 * "><td style="text-align:left;width:3.747cm; " class="Table1_A2"><p
 * class="Standard"><span class="T6">0 to 10 </span></p></td><td style="t
 * ext-align:left;width:6.835cm; " class="Table1_B2"><p class="Standard">< span
 * class="T6">13</span></p></td></tr><tr class="Table11"><td style="t
 * ext-align:left;width:3.747cm; " class="Table1_A3"><p class="Standard">< span
 * class="T6">11 to 20</span></p></td><td style="text-align:left;widt h:6.835cm;
 * " class="Table1_B3"><p class="Standard"><span class="T6">8</
 * span></p></td></tr><tr class="Table11"><td style="text-align:left;width
 * :3.747cm; " class="Table1_A4"><p class="Standard"><span class="T6">21 t o
 * 30</span></p></td><td style="text-align:left;width:6.835cm; " class="
 * Table1_B4"><p class="Standard"><span class="T6">5</span></p></td></tr>< tr
 * class="Table11"><td style="text-align:left;width:3.747cm; " class="T able1_A3
 * "><p class="Standard"><span class="T6">31 to 40</span></p></td> <td style=
 * "text-align:left;width:6.835cm; " class="Table1_B3"><p class=
 * "Standard"><span class="T6">1</span></p></td></tr><tr class="Table11">< td
 * style="text-align:left;width:3.747cm; " class="Table1_A6"><p class=" Standard
 * "><span class="T6">41 or more</span></p></td><td style="text-al
 * ign:left;width:6.835cm; " class="Table1_B6"><p class="Standard"><span c
 * lass="T6">1</span></p></td></tr></table>
 *
 * Assumptions: - Girl scouts do not buy cookies(no negitive amounts of boxes
 * sold) - Our table need not be printed in html as was requested(sorry) -
 * number of coockies entered will not exceded MAX_INT
 *
 * Pseudocode: 1. Ask for total number of girls, and save 2. create int array of
 * size 5, filled with zeros(0) 3. loop number of times specified in step 1 3.1:
 * input number of cookies sold 3.2: divide cookies-1 by 10, store as index
 * 3.2.1: if index == -1, index = 0 3.2.2: if index > 4, index = 4; 3.3:
 * increase array at index by 4. print table
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    // create an input reader object
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    // step 1
    System.out.print("Number of girls in troop: ");
    int nGirls = Integer.valueOf(input.readLine());

    // step 2
    int[] anRangesSold = new int[5];

    // step 3
    for(int i = 0; i < nGirls; i++) {
      // step 3.1
      System.out.printf("Number of boxes girl %d sold: ", i + 1);
      int nCookiesSold = Integer.valueOf(input.readLine());

      // step 3.2
      int index = (nCookiesSold - 1) / 10;
      if(index == -1)// step 3.2.1
        index = 0;
      if(index > 4)// step 3.2.2
        index = 4;

      // step 3.3
      anRangesSold[index]++;
    }

    // step 4
    System.out.printf("| Total Boxes | Number of Girl Scouts |\n");
    System.out.printf("|-------------|-----------------------|\n");
    System.out.printf("|   0 to 10   | %-21d |\n", anRangesSold[0]);
    System.out.printf("|  11 to 20   | %-21d |\n", anRangesSold[1]);
    System.out.printf("|  21 to 30   | %-21d |\n", anRangesSold[2]);
    System.out.printf("|  31 to 40   | %-21d |\n", anRangesSold[3]);
    System.out.printf("| 41 or more  | %-21d |\n", anRangesSold[4]);

    // close stream
    input.close();

    System.exit(0);
  }
}
