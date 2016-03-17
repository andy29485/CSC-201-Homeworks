//Name:    Andriy Zasypkin
//Date:    2016-01-12
//Unit:    01
//Problem: 02




import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    //get the student id
    System.out.print("Enter student id: ");
    int student_id = Integer.valueOf(input.readLine());

    //calculate chapter
    int chapter = student_id % 4 + 2;

    //calculate problem number
    int problem;
    if(chapter == 2)
      problem = student_id % 26 + 1;
    else if(chapter == 3)
      problem = student_id % 34 + 1;
    else if(chapter == 4)
      problem = student_id % 46 + 1;
    else
      problem = student_id % 38 + 1;

    //input the page number
    System.out.printf("Enter page of problem %d from chapter %d: ",
                      problem, chapter);
    int page = Integer.valueOf(input.readLine());

    //redundantly print out information that the user already knows
    System.out.printf("Please solve programming exercise %d "+
                      "from chapter %d, from page %d.\n",
                        problem, chapter, page);

    //close stream
    input.close();
    System.exit(0);
  }
}
