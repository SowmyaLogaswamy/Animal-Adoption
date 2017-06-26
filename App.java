import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal puppy = new Animal();
    puppy.mAge = 2;
    puppy.mSpecies = "Dog";
    puppy.mName = "Spot";

    Animal kitten = new Animal();
    kitten.mAge = 7;
    kitten.mSpecies = "Cat";
    kitten.mName = "Sam";

    Animal snake = new Animal();
    snake.mAge = 15;
    snake.mSpecies = "Reptile";
    snake.mName = "Slither";

    Animal[] allAnimals = {puppy, kitten, snake};
    System.out.println("What is the maximum age you would prefer for adoption");
    String stringMaxAge = myConsole.readLine();
    int maxAge = Integer.parseInt(stringMaxAge);

    System.out.println("Here is the list of animals you can adopt.");

    for(Animal individualAnimal: allAnimals) {
      if (individualAnimal.insidePet(maxAge)) {
        System.out.println("----------------");
        System.out.println(individualAnimal.mAge);
        System.out.println(individualAnimal.mSpecies);
        System.out.println(individualAnimal.mName);
      }
    }
  }
}
