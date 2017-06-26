class Animal {
  public int mAge;
  public String mSpecies;
  public String mName;
  public boolean mAdopted;

  public Animal(int age, String species, String name, boolean adopted) {
    mAge = age;
    mSpecies = species;
    mName = name;
    mAdopted = adopted;
  }

  public boolean insidePet(int age) {
   return(mAge < age);
  }

  public boolean isAdopted() {
    mAdopted = true;
    return mAdopted;
  }
}
