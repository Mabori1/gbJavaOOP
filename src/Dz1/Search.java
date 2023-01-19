package Dz1;

public class Search {
    public static void getRelation(Person person, Relation relation, FamilyTree tree) {
        for (RelationShip el : tree.getRelationShip()) {
            if (el.getPerson().getFirstname().equals(person.getFirstname()) && el.getPerson().getSurname().equals(person.getSurname())
                    && el.getRelation() == relation) {
                System.out.println(el);
            }
        }
    }

    public static void getRelation(Relation relation, FamilyTree tree) {
        for (RelationShip el :
                tree.getRelationShip()) {
            if (el.getRelation() == relation) {
                System.out.println(el);
            }
        }
    }

    public static void getRelation(Person person, FamilyTree tree) {
        for (RelationShip el :
                tree.getRelationShip()) {
            if (el.getPerson().getFirstname().equals(person.getFirstname()) && el.getPerson().getSurname().equals(person.getSurname())) {
                System.out.println(el);
            }
        }
    }
}
