package Dz2;

public class DogLover extends Human implements CallPetAnimal{

  public DogLover(String name, int age){
    super(name, age);
  }
  @Override
  public void callPetAnimal(PetAnimal pet) {
    if (pet instanceof Dog) {
      System.out.printf("%s call %s with a whistle, and %s says: ", super.getName(),
              pet.getNickName(), pet.getNickName());
      pet.respond();
    } else if (pet instanceof Cat) {
      System.out.printf("%s call %s with a whistle, and %s says: \"MEOW-MEOW-MEOW!!!\"\n",
              super.getName(), pet.getNickName(), pet.getNickName());
    }
  }
}