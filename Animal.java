class Animal {
  public int mAge;
  public String mSpecies;
  public String mName;

  public Animal(int age, String species, String name) {
    mAge = age;
    mSpecies = species;
    mName = name;
  }

 public boolean insidePet(int age) {
   return(mAge < age);
 }
}
