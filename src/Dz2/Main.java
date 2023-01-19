package Dz2;

public class Main {
  public static void main(String[] args) {
    CatLover hu1 = new CatLover("Ivan", 20);
    DogLover hu2 = new DogLover("Petya", 25);
    DogLover hu3 = new DogLover("Katya", 30);
    CatLover hu4 = new CatLover("Vova", 40);

    PetAnimal pet1 = new Dog("Sharik", 5);
    PetAnimal pet2 = new Cat("Murka", 1);

    ((CatLover) hu1).callPetAnimal(pet1);
    ((CatLover) hu4).callPetAnimal(pet2);
    ((DogLover) hu2).callPetAnimal(pet1);
    ((DogLover) hu3).callPetAnimal(pet2);
  }
}