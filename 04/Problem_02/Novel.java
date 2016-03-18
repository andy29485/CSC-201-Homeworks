//Name:    Andriy Zasypkin
//Date:    2016-03-18
//Unit:    04
//Problem: 02

public class Novel extends Book {
  private String[] astrCharacters;

  public Novel() {
    super();
    astrCharacters = {"Alice"};
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
    String[] tmp = new String[this.astrCharacters.length+1];
    for(int i=0; i<this.astrCharacters; i++) {
      tmp[i] = this.astrCharacters[i];
    }
    tmp[this.astrCharacters.length] = strCharacter;
    this.astrCharacters = tmp;
  }
}
