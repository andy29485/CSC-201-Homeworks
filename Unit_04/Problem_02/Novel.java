package Unit_04.Problem_02;

// Name: Andriy Zasypkin
// Date: 2016-03-18
// Unit: 04
// Problem: 02

public class Novel extends Book {
  private String[] astrCharacters;

  public Novel() {
    super();
    astrCharacters = new String[] {"Alice"};
    this.setTitle("Through the Looking Glass");
    this.setAuthors(new String[] {"Lewis Carroll"});
  }

  public void setCharacters(String[] astrCharacters) {
    this.astrCharacters = astrCharacters;
  }

  public String[] getCharacters() {
    return this.astrCharacters;
  }

  public void addCharacter(String strCharacter) {
    if(strCharacter == null)
      return;
    for(String character : this.astrCharacters) {
      if(character.equalsIgnoreCase(strCharacter))
        return;
    }
    String[] tmp = new String[this.astrCharacters.length + 1];
    for(int i = 0; i < this.astrCharacters.length; i++) {
      tmp[i] = this.astrCharacters[i];
    }
    tmp[this.astrCharacters.length] = strCharacter;
    this.astrCharacters = tmp;
  }

  @Override
  public String toString() {
    String aut = "";
    for(int i = 0; i < this.getAuthors().length; i++) {
      if(i != 0) {
        aut += ", ";
      }
      aut += this.getAuthors()[i];
    }
    String chars = "";
    for(int i = 0; i < this.getCharacters().length; i++) {
      if(i != 0) {
        chars += ", ";
      }
      chars += this.getCharacters()[i];
    }
    return String.format("Novel: %s(%d pages) by: %s - chars: [%s]",
        this.getTitle(), this.getPages(), aut, chars);
  }
}
