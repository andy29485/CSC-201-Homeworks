package unit_03.problem_04;

// Name: Andriy Zasypkin
// Date: 2016-02-13
// Unit: 03
// Problem: 04

public class Book {
  private String strTitle;
  private String strAuthor;
  private int    nPages;

  public Book(String strTitle, String strAuthor, int nPages) {
    this.strTitle = strTitle;
    this.strAuthor = strAuthor;
    this.nPages = nPages;
  }

  @Override
  public String toString() {// return book name author and # of pages as string
    return String.format("%s by %s(%d pages)", this.strTitle, this.strAuthor,
        this.nPages);
  }
}
