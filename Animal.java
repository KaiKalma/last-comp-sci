import org.code.media.*;

public class Animal extends Nature {
    /**
 * The Animal class represents an animal to be displayed in a scene.
 * It inherits from the nature class and uses a 2D array to match animal names to 
 * corresponding image filenames. It returns the correct image filename
 * if a match is found, or returns "error" otherwise.
 * This is in the main function of draw elements
 */

 public Animal(String animalInput) {
   this.animalInput = animalInput;
  }
    String[][] animalData = {//the first colum is all the animal names, second colum is all their file names
      {"turtle", "turtle.jpg"},
      {"fish", "fish.png"},
      {"lion", "lion.png"},
      {"zebra", "zebra.png"}
    };
  //draw all animal elements
  public String drawElements() {
    //iterate through the animal data and determine when one matches up. 
    for (int i = 0; i < animalData.length; i++) {
  //check if user input from nature is the same as the current index
  if (animalInput.equals(animalData[i][0])) {
    //draw the corresponding image at coordinates 120 100 at 100%
    return animalData[i][1];
  }
}
    return "error";
  }
}
