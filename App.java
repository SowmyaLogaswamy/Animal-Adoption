import java.io.Console;
import java.util.List;
import java.util.ArrayList;



public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal puppy = new Animal(2, "Dog", "Spot", false);
    Animal kitten = new Animal(7, "Cat", "Sam", false);
    Animal snake = new Animal(15, "Reptile", "Slither", false);

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(puppy);
    allAnimals.add(kitten);
    allAnimals.add(snake);

    boolean programRunning = true;
    while(programRunning) {
    System.out.println("What would you like to do?  Enter one of the following options: Add new animal, See all animals, Search available pets, Search indoor pets, or Exit");

    String stringUserChoice = myConsole.readLine();

    if (stringUserChoice.equals("Add new animal")) {
      System.out.println("Alright! let's add an animal! What is the age the animal?");
      int animalAge = Integer.parseInt(myConsole.readLine());

      System.out.println("Great! What species is the animal?");
      String animalSpecies = myConsole.readLine();

      System.out.println("Great! What is name of the animal?");
      String animalName = myConsole.readLine();

       Animal newAnimal = new Animal(animalAge, animalSpecies, animalName, false);
       allAnimals.add(newAnimal);

    } else if (stringUserChoice.equals("See all animals")) {
        for(Animal individualAnimal: allAnimals) {
          System.out.println("----------------");
          System.out.println(individualAnimal.mAge);
          System.out.println(individualAnimal.mSpecies);
          System.out.println(individualAnimal.mName);
        }
    } else if (stringUserChoice.equals("Search available pets")) {
        for(Animal individualAnimal: allAnimals) {
          if(individualAnimal.mAdopted == false) {
            System.out.println("----------------");
            System.out.println(individualAnimal.mAge);
            System.out.println(individualAnimal.mSpecies);
            System.out.println(individualAnimal.mName);
          }
        }
    } else if (stringUserChoice.equals("Search indoor pets")) {
        for(Animal individualAnimal: allAnimals) {
          if(individualAnimal.mSpecies != "Reptile") {
            System.out.println("----------------");
            System.out.println(individualAnimal.mAge);
            System.out.println(individualAnimal.mSpecies);
            System.out.println(individualAnimal.mName);
          }
        }
    } else if (stringUserChoice.equals("Exit")) {
        programRunning = false;
    } else {
      System.out.println("Sorry, we don't recognize your input");
    }
  }

    // System.out.println("What is the maximum age you would prefer for adoption");
    // String stringMaxAge = myConsole.readLine();
    // int maxAge = Integer.parseInt(stringMaxAge);
    //
    // System.out.println("Here is the list of animals you can adopt.");
    //
    // for(Animal individualAnimal: allAnimals) {
    //   if (individualAnimal.insidePet(maxAge)) {
    //     System.out.println("----------------");
    //     System.out.println(individualAnimal.mAge);
    //     System.out.println(individualAnimal.mSpecies);
    //     System.out.println(individualAnimal.mName);
    //
    //   }
    // }


    // puppy.isAdopted();
    // System.out.println(puppy.mAdopted);
  }
}
