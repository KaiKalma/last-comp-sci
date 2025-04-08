import org.code.theater.*;
import java.util.Scanner; // For user input

public class TheaterRunner {
  public static void main(String[] args) {
    /**
 * This class is the starting point of the program.
 * It interacts with the user to pick a background
 * has animals and plants that the user chooses
 * It then animates the scene
 */
    Scanner scanner = new Scanner(System.in); // Create scanner to read user input

    // Ask the user what kind of scene they want
    System.out.println("What scene would you like to see? (ocean or desert):");
    String scene = scanner.nextLine(); //scene input

    // Ask the user what animals they want to include
    System.out.println("What animals would you like to see (like turtle, fish, lion, zebra):");
    String animalWords = scanner.nextLine(); //animal input

    // Ask the user what plants they want to include
    System.out.println("What plants would you like to see (tree or kelp):");
    String plantWords = scanner.nextLine(); //plant input

    // Create a new Nature scene using the input
    Nature s = new Nature(scene, animalWords, plantWords);
    s.play();
  Theater.playScenes(s);
  }
}
