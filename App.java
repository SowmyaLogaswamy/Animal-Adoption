import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal puppy = new Animal(2, "Dog", "Spot", false);
    Animal kitten = new Animal(7, "Cat", "Sam", false);
    Animal snake = new Animal(15, "Reptile", "Slither", false);

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

    boolean adopted = puppy.isAdopted();
    System.out.println(adopted);
  }
}
