package Unit_02.Problem_03;

// Name: Andriy Zasypkin
// Date: 2016-01-26
// Unit: 02
// Problem: 03

/*
 * Description: Write a program that uses a two dimensional array to store the
 * highest and lowest temperatures for each month of the calendar year. The
 * temperatures will be entered at the keyboard. This program must output the
 * average high, average low, and highest and lowest temperatures of the year.
 * The results will be printed on the console. The program must include the
 * following methods: - A method named inputTempForMonth whose purpose is to
 * input a high and a low temperature for a specific month. The month and the
 * array of temperatures will both be passed as input arguments to the method.
 * The method will not have a return value. - A method named inputTempForYear
 * whose purpose is to input a high and a low temperature for every month of the
 * year. There are no input arguments for this method, but the method does
 * return a completed multidimensional array of temperatures for the year. - A
 * method named calculateAverageHigh whose purpose is to calculate the average
 * high temperature for the year. This method will take the array of
 * temperatures as input and will return the average high temperature for the
 * year. - A method named calculateAverageLow whose purpose is to calculate the
 * average low temperature for the year. This method will take the array of
 * temperatures as input and will return the average low temperature for the
 * year. - A method named findHighestTemp whose purpose is to return the index
 * value of the highest temperature for the year. If the highest temperature of
 * the year occurs more than once in the year, then the method should return the
 * index of the first month that had the temperature. The method will take the
 * array of temperatures as an input argument and return the index of the
 * highest temperature. - A method named findLowestTemp whose purpose is to
 * return the index value of the lowest temperature for the year. If the lowest
 * temperature of the year occurs more than once in the year, then the method
 * should return the index of the first month that had the temperature. The
 * method will take the array of temperatures as an input argument and return
 * the index of the lowest temperature. - A main method that uses the previous
 * methods to determine the average high temperature, average low temperature,
 * and highest and lowest temperatures for the year. The main method must print
 * out these average temperatures as well as the month and temperature for the
 * highest and lowest temperatures for the year.
 *
 * Assumptions: - the user of this program is an imperialist - if two months
 * have lowest/highest temp, only one needs to be displayed
 *
 * Pseudocode: inputTempForMonth: 1. ask user for high/low temps 2. set the temp
 * in the array
 *
 * inputTempForYear 1. create array[12][2] 2. for i in {0..11} 2.1
 * inputTempForMonth(i, array) 3. return array
 *
 * calculateAverageHigh 1. sum = 0 2. for i in {0..11} 2.1 sum += array[i][0] 3.
 * return sum/12
 *
 * calculateAverageLow 1. sum = 0 2. for i in {0..11} 2.1 sum += array[i][1] 3.
 * return sum/12
 *
 * findHighestTemp 1. high = 0 2. for i in {1..11} 2.1 high = array[high][0] >
 * array[i][0] ? high : i 3. return high
 *
 * findLowestTemp 1. low = 0 2. for i in {1..11} 2.1 low = array[low][1] <
 * array[i][1] ? low : i 3. return low
 *
 * main 1. temps = inputTempForYear 2. print out all other methods
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static BufferedReader input;
  public static final String[] astrMonths =
      {"January", "February", "March", "April", "May", "June", "July", "August",
       "September", "October", "November", "December"};

  public static void inputTempForMonth(int nMonth, double[][] aadTemps) {
    try {
      System.out.printf("Enter highest temperature in %s: ",
          astrMonths[nMonth]);
      aadTemps[nMonth][0] = Double.valueOf(input.readLine());

      System.out.printf("Enter lowest temperature in %s: ", astrMonths[nMonth]);
      aadTemps[nMonth][1] = Double.valueOf(input.readLine());
    }
    catch(IOException e) {
      System.out.println("Please refer to the link when entering numbers");
      System.out.println("https://simple.wikipedia.org/wiki/Decimal");
      System.exit(-1);
    }
  }

  public static double[][] inputTempForYear() {
    double[][] aadTemps = new double[12][2];
    for(int i = 0; i < aadTemps.length; i++) {
      inputTempForMonth(i, aadTemps);
    }
    return aadTemps;
  }

  public static double calculateAverageHigh(double[][] aadTemps) {
    double dSum = 0;
    for(int i = 0; i < aadTemps.length; i++) {
      dSum += aadTemps[i][0];
    }
    return dSum / 12;
  }

  public static double calculateAverageLow(double[][] aadTemps) {
    double dSum = 0;
    for(int i = 1; i < aadTemps.length; i++) {
      dSum += aadTemps[i][1];
    }
    return dSum / 12;
  }

  public static int findHighestTemp(double[][] aadTemps) {
    int nHigh = 0;
    for(int i = 1; i < aadTemps.length; i++) {
      nHigh = aadTemps[nHigh][0] > aadTemps[i][0] ? nHigh : i;
    }
    return nHigh;
  }

  public static int findLowestTemp(double[][] aadTemps) {
    int nLow = 0;
    for(int i = 1; i < aadTemps.length; i++) {
      nLow = aadTemps[nLow][1] < aadTemps[i][1] ? nLow : i;
    }
    return nLow;
  }

  public static void main(String[] args) throws IOException {
    // create an input reader object
    input = new BufferedReader(new InputStreamReader(System.in));

    double[][] aadTemps = inputTempForYear();

    double dAvjHighest = calculateAverageHigh(aadTemps);
    double dAvjLowest = calculateAverageLow(aadTemps);
    int nHighMonth = findHighestTemp(aadTemps);
    int nLowMonth = findLowestTemp(aadTemps);

    System.out.printf("The average high for the year is: %.3f\n", dAvjHighest);
    System.out.printf("The average low  for the year is: %.3f\n", dAvjLowest);
    System.out.printf("%s hold the year's recod high at %.3f\n",
        astrMonths[nHighMonth], aadTemps[nHighMonth][0]);
    System.out.printf("%s hold the year's recod low  at %.3f\n",
        astrMonths[nLowMonth], aadTemps[nLowMonth][1]);

    // close stream
    input.close();

    System.exit(0);
  }
}
