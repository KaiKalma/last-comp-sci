import org.code.theater.*;
import org.code.media.*;
/**
 * The nature class represents my custom scene for the animation.
 * It draws either an ocean or desert, then adds animals and plants
 * based on user input.
 * This class extends the scene class 
 * the main method is play, which makes this class helpful
 */

public class Nature extends Scene {
  public String sceneType;     // Type of scene (ocean or desert)
  public String animalInput;   // Animal input string
  public String plantInput;    // Plant input string

  // Constructor to store all input data
  public Nature(String sceneType, String animalInput, String plantInput) {
    this.sceneType = sceneType;
    this.animalInput = animalInput;
    this.plantInput = plantInput;
  }
  
    public Nature() {//no argument constructor since the animal and plant subclasses only inherit methods
    sceneType = "";
    animalInput = "";
    plantInput = "";
  }


  // Called automatically to draw the scene
  public void play() {
    // Draw ocean or desert background
    if (sceneType.equals("ocean")) {
      drawImage("water.jpg", 0, 0, 400);//draws the water image
      playSound("water-191999.wav");
    } else {
      drawImage("desert1.jpg", 0, 0, 400);//draw sand image
    }
    drawText("This is the " + sceneType, 20, 20);//writes the text
    //new animal object that will draw the animals
    Animal animals = new Animal(animalInput);
  String animalFile = animals.drawElements(); //draw the animal
    drawImage (animalFile, 180, 200, 100);
//new plant object that will draw the plants
    Plant plants = new Plant(plantInput);
    String plantFile = plants.drawElements(); //draws the plants 
    drawImage (plantFile, 120, 100, 100);
    
  }
}
