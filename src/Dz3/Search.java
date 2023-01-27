package Dz3;

import java.util.Iterator;
import java.util.List;

public class Search {
  public static void getRelation(Person person, Relation relation, FamilyTree tree) {
    List<RelationShip> elements = tree.getRelationship();
    for (RelationShip comparable : elements) {
      if (comparable.getPerson().getFirstname().equals(person.getFirstname()) && comparable.getPerson().getFirstname().equals(person.getFirstname())
              && comparable.getRelation() == relation) {
        System.out.println(comparable);
      }
    }
  }

  public static void getRelation(Relation relation, FamilyTree tree) {
    List<RelationShip> elements = tree.getRelationship();
    for (RelationShip comparable : elements) {
      if (comparable.getRelation() == relation) {
        System.out.println(comparable);
      }
    }
  }

  public static void getRelation(Person person, FamilyTree tree) {
    List<RelationShip> elements = tree.getRelationship();
    for (RelationShip comparable : elements) {
      if (comparable.getPerson().getFirstname().equals(person.getFirstname()) && comparable.getPerson().getSurname().equals(person.getSurname())) {
        System.out.println(comparable);
      }
    }
  }
}
