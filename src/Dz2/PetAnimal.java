package Dz2;

abstract public class PetAnimal {
  private final String  nickName;
  private final int age;

  public PetAnimal(String nickName, int age) {
    this.nickName = nickName;
    this.age = age;
  }

  public String getNickName() {
    return nickName;
  }

  public int getAge() {
    return age;
  }

  abstract public void respond();
  @Override
  public String toString() {
    return ("Nickname: "+this.nickName+"; age:"+this.age);
  }
}