import org.code.media.*;
public class Plant extends Nature {
/**
 * The Plant class represents a plant to be displayed in a scene.
 * It inherits from the Nature class and uses a draw element method and 2D array to map user-provided
 * plant names to corresponding image filenames. It returns the image filename
 * if a match is found, or returns "error".
 */
   public Plant(String plantInput) {
   this.plantInput = plantInput;
  }
  
    String[][] plantData = {//left colum is all names, right is their ids
      {"tree", "tree1.png"},
      {"kelp", "kelp.png"}
    };
  //draw all plant elements
  public String drawElements() {
    //iterate through the 2d array in order to match
   for (int i = 0; i < plantData.length; i++) {
  //check if user input from nature is the same as the current index
  if (plantInput.equals(plantData[i][0])) {
    //draw the corresponding image at coordinates 140 100 at 100%
    return plantData[i][1];
  }
}
    return "error";
  }
}
