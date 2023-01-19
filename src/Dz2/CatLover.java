package Dz2;

public class CatLover extends Human implements CallPetAnimal {

  public CatLover(String name, int age){
    super(name, age);
  }
  @Override
  public void callPetAnimal(PetAnimal pet) {
    if (pet instanceof Cat) {
      System.out.printf("%s call %s with a \"kis-kis-kis\", and %s says: ", super.getName(),
              pet.getNickName(), pet.getNickName());
      pet.respond();
    } else if (pet instanceof Dog) {
      System.out.printf("%s call %s with a \"kis-kis-kis\", and %s says: \"RRRR WOOF-WOOF!!!\"\n",
              super.getName(), pet.getNickName(), pet.getNickName());
    }
  }
}
