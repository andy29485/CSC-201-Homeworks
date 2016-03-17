//Name:    Andriy Zasypkin
//Date:    2016-03-16
//Unit:    04
//Problem: 04

public class DigitalCamera extends Electronics {
  private int nPhotos;

  public DigitalCamera() {
    super("Digital Camera", "70d");
    this.getManufacturers().add("Canon");
    this.nPhotos = 0;
  }

  public DigitalCamera(String strName, int nPhotos) {
    super("Digital Camera", strName);
    this.nPhotos = nPhotos;
  }

  public void DigitalCamera(int nPhotos) {
    this.nPhotos = nPhotos;
  }

  public int getNumberOfPhotos() {
    return this.nPhotos;
  }

  public String toString() {
    String strOut = String.format("\n  Number of Photos: %6d\n", nPhotos);
    return super.toString().replaceFirst("\n", strOut);
  }
}
