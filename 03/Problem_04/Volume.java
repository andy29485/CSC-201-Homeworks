//Name:    Andriy Zasypkin
//Date:    2016-02-13
//Unit:    03
//Problem: 04

public class Volume {
  private Book[] aBooks;
  private String strVolumeName;
  private int    numberOfBooks;

  public Volume(String strVolumeName, Book[] aBooks) {
    this.strVolumeName = strVolumeName;
    this.aBooks        = aBooks;
    this.numberOfBooks = aBooks.length;//never trust people to give you numbers
                                       // on the other hand this might be a null
                                       // pointer... but I don't feel like
                                       // tripling the amout of code that I need
                                       // to write, so I'll leave it like this
  }

  public Book[] getBookArray() { //see Assumptions in Main.java
    return this.aBooks;
  }

  public String toString() {
    //start volume toString() with volume name
    StringBuilder sbOut = new StringBuilder(this.strVolumeName+":\n");
    for(Book book : this.aBooks) { //for each book indent and add a new line
      sbOut.append("  ");//indent
      sbOut.append(book.toString());//book description
      sbOut.append("\n");//new line
    }
    return sbOut.toString();
  }
}
