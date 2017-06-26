public class App {
  public static void main(String[] args) {

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

  System.out.println("All Animals:");

  for(Animal individualAnimal: allAnimals) {
    System.out.println("----------------");
    System.out.println(individualAnimal.mAge);
    System.out.println(individualAnimal.mSpecies);
    System.out.println(individualAnimal.mName);
  }
 }
}
