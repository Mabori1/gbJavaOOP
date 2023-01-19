package Dz1;


import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<RelationShip> link = new ArrayList<>();

    public List<RelationShip> getRelationShip() {
        return link;
    }

    public void setRelationship(List<RelationShip> links) {
        this.link.addAll(links);
    }

    public void addRelationShip(Person p1, Person p2, Relation r1, Relation r2) {
        this.link.add(new RelationShip(p1, p2, r1));
        this.link.add(new RelationShip(p2, p1, r2));
    }

    @Override
    public String toString() {
        String result = new String();
        for (RelationShip el :
                link) {
            result += el + "\n";
        }
        return result;
    }
}