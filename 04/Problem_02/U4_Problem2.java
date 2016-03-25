//Name:    Andriy Zasypkin
//Date:    2016-03-09
//Unit:    04
//Problem: 02


/* Description:
 *   Design and implement a set of classes that define various types of reading
 *     material: books, novels, magazines, technical journals, textbooks, and so
 *     on. Include data values that describe various attributes of the material,
 *     such as the number of pages and the names of the primary characters.
 *     Include methods that are named appropriately for each class and that
 *     print an appropriate message. Create a main driver class to instantiate
 *     and exercise several of the classes.
 *
 * Assumptions:
 *   - Things will be hard-coded
 *   - I can use only default constructors
 *     - changes can be made using mutator methods(if needed)
 *
 * Pseudocode:
 *   1. same as all the other problems in this unit but with diffrent names
 */

public class U4_Problem2 {
  public static void main(String[] args) {

    TextBook a = new TextBook();
    a.setTitle("Intro to java");
    a.setPages(300);
    a.setAuthors(new String[] {"Y. Daniel Liang"});

    Novel b = new Novel();
    b.setPages(230);

    TechnicalJournal c = new TechnicalJournal();
    c.setPages(50);

    Magazine d = new Magazine();
    d.setPages(60);
    d.setAuthors(new String[] {"J. Nanjan", "Mike Miller",
                               "Iban Coello", "Brian Buccellato"});


    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    System.exit(0);
  }
}
