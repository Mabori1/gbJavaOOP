package Dz1;

public class Main {
    public static void main(String[] args) {


        FamilyTree tree = new FamilyTree();
        Person human1 = new Person("Name1", "Surname1", 30, Gender.MALE);
        Person human2 = new Person("Name2", "Surname2", 27, Gender.FEMALE);
        Person human3 = new Person("Name3", "Surname3", 57, Gender.MALE);
        Person human4 = new Person("Name4", "Surname4", 50, Gender.FEMALE);
        Person human5 = new Person("Name5", "Surname5", 29, Gender.MALE);
        Person human6 = new Person("Name6", "Surname6", 19, Gender.MALE);
        Person human7 = new Person("Name7", "Surname7", 86, Gender.FEMALE);
        Person human8 = new Person("Name8", "Surname8", 3, Gender.MALE);

        tree.addRelationShip(human1, human2, Relation.HUSBAND, Relation.WIFE);
        tree.addRelationShip(human1, human3, Relation.SON, Relation.FATHER);
        tree.addRelationShip(human1, human8, Relation.FATHER, Relation.SON);
        tree.addRelationShip(human1, human4, Relation.MOTHER, Relation.SON);
        tree.addRelationShip(human1, human5, Relation.BROTHER, Relation.BROTHER);
        tree.addRelationShip(human1, human6, Relation.BROTHER, Relation.BROTHER);
        tree.addRelationShip(human1, human7, Relation.GRANDSON, Relation.GRANDMA);

        tree.addRelationShip(human5, human8, Relation.UNCLE, Relation.NEPHEW);
        tree.addRelationShip(human6, human8, Relation.UNCLE, Relation.NEPHEW);

        tree.addRelationShip(human2, human8, Relation.MOTHER, Relation.SON);

        tree.addRelationShip(human8, human3, Relation.GRANDSON, Relation.GRANDPA);

        System.out.println("-------------------");

        Search.getRelation(human8, tree);
        System.out.println("-------------------\n");
        System.out.println(tree.getRelationShip());
    }
}