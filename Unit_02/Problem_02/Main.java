package Unit_02.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-01-26
// Unit: 02
// Problem: 02

/*
 * Description: In the sport of diving, seven judges award a score between 0 and
 * 10, where each score may be a floating-point value. The highest and lowest
 * scores are thrown out and the remaining scores are added together. The sum is
 * then multiplied by the degree of difficulty for that dive. The degree of
 * difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6
 * to determine the diver’s score. Write a computer program that will ultimately
 * determine the diver’s score. This program must include the following methods:
 * - A method name inputValidScore that inputs one valid score for one judge for
 * one diver. This method will return the valid score. - A method named
 * inputAllScores that creates an array to store the scores for all judges for
 * the diver. This method will fill the array with a valid score from each
 * judge. This method does not take input arguments, but it does return the
 * array of scores. - A method named inputValidDegreeOfDifficulty that inputs a
 * valid degree of difficulty for the dive. The valid degree of difficulty will
 * be returned from the method. - A method named calculateScore that will
 * calculate the score for the diver based on the scores from all judges and the
 * degree of difficulty. The score will be returned from the method. - A main
 * method that uses the previous methods to determine the score for the diver
 * and then prints out the score to the console.
 *
 * Assumptions: - Things such as 2.3. will not be typed in as numbers
 *
 * Pseudocode: inputValidScore: 1. ask for input, input it 2. while input
 * invalid 2.1 print invalid input 2.2 input again 3. return score
 *
 * inputAllScores: 1. create array1 of size 7, array2 of size 5, int
 * nIndexMax,nIndexMin 2. for i in {0..6} 2.1 ask for valid input 2.2 set input
 * to array1 slot 2.3 keep track of max and min indcies 2.3.1 Note: if first 2
 * numbers are identica:, max stays, min moves on 3. copy array1 to array2 with
 * the exception of min and max indcies 4. return array2
 *
 * inputValidDegreeOfDifficulty: <same as *inputValidScore* but diffrent number
 * range/message>
 *
 * calculateScore: 1. double score = 0 2. for i in judge_scores(the arraly of
 * length five) 2.1 scoce += jugde_score 3. score *= difficulty *.6 4. return
 * score
 *
 * main: 1. diff = inputValidDegreeOfDifficulty 2. scores = inputAllScores 3.
 * score = calculateScore 4. print score
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static BufferedReader input;

  public static double inputValidScore(int nJudge) throws IOException {
    double dScore = -1;
    String strScore = "";

    // step 1
    System.out.printf("Enter judge %d score: ", nJudge);
    strScore = input.readLine();
    if(strScore.matches("[.\\d]+"))
      dScore = Double.valueOf(strScore);

    // step2
    while(dScore > 10.000001 || dScore < 0) {
      // step 2.1
      System.out.print("Invlaid, enter number in range [0 - 10]: ");
      // step 2.2
      strScore = input.readLine();
      if(strScore.matches("[.\\d]+"))
        dScore = Double.valueOf(strScore);
    }
    // step 3
    return dScore;
  }

  public static double[] inputAllScores() throws IOException {
    // step 1
    double[] array1 = new double[7];
    double[] array2 = new double[5];
    int nIndexMax = 0;
    int nIndexMin = 0;

    // step 2
    for(int i = 0; i < 7; i++) {
      // step 2.1
      double dScore = inputValidScore(i + 1);
      // step 2.2
      array1[i] = dScore;
      // step 2.3
      if(dScore > nIndexMax)
        nIndexMax = i;
      if(dScore <= nIndexMin)// see note in step 2.3.1
        nIndexMin = i;
    }

    // step 3
    int j = 0;
    for(int i = 0; i < array1.length; i++) {
      if(i != nIndexMax && i != nIndexMin)
        array2[j++] = array1[i];
    }

    // step 4
    return array2;
  }

  public static double inputValidDegreeOfDifficulty() throws IOException {
    double dDiff = -1;
    String strScore = "";

    // step 1
    System.out.print("Enter degree of difficulty: ");
    strScore = input.readLine();
    if(strScore.matches("[.\\d]+"))
      dDiff = Double.valueOf(strScore);

    // step2
    while(dDiff > 3.80001 || dDiff < 1.19999) {
      // step 2.1
      System.out.print("Invlaid, enter number in range [1.2 - 3.8]: ");
      // step 2.2
      strScore = input.readLine();
      if(strScore.matches("[.\\d]+"))
        dDiff = Double.valueOf(strScore);
    }
    // step 3
    return dDiff;
  }

  public static double calculateScore(double[] adScores, double dDifficulty) {
    // step 1
    double dScore = 0;

    // step 2
    for(int i = 0; i < 5; i++) {
      // step 2.1
      dScore += adScores[i];
    }

    // step 3
    dScore *= dDifficulty * 0.6;

    // step 4
    return dScore;
  }

  public static void main(String[] args) throws IOException {

    // create an input reader object
    input = new BufferedReader(new InputStreamReader(System.in));

    // step 1
    double dDifficulty = inputValidDegreeOfDifficulty();

    // step 2
    double[] adScores = inputAllScores();

    // step 3
    double dTotalScore = calculateScore(adScores, dDifficulty);

    // step 4
    System.out.printf("The score for the dive is: %.2f\n", dTotalScore);

    // close stream
    input.close();

    System.exit(0);
  }
}
