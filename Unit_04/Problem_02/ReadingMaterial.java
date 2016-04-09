package Unit_04.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

public abstract class ReadingMaterial {
  private String[] astrAuthors;
  private int      nPages;

  public ReadingMaterial() {
    this.astrAuthors = new String[] {"No one"};
    this.nPages = 0;
  }

  public void setAuthors(String[] astrAuthors) {
    this.astrAuthors = astrAuthors;
  }

  public String[] getAuthors() {
    return this.astrAuthors;
  }

  public void addAuthor(String strAuthor) {
    if(strAuthor == null)
      return;
    for(String author : this.astrAuthors) {
      if(author.equalsIgnoreCase(strAuthor))
        return;
    }
    String[] tmp = new String[this.astrAuthors.length + 1];
    for(int i = 0; i < this.astrAuthors.length; i++) {
      tmp[i] = this.astrAuthors[i];
    }
    tmp[this.astrAuthors.length] = strAuthor;
    this.astrAuthors = tmp;
  }

  public void setPages(int nPages) {
    this.nPages = nPages;
  }

  public int getPages() {
    return this.nPages;
  }
}
