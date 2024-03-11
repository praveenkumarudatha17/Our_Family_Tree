package family_tree.utils;

import java.util.Scanner;

import family_tree.repository.FamilyTreePeople;

public class DBQueries {

    private Scanner scanner;

    public DBQueries() {
        this.scanner = new Scanner(System.in);
    }

    public void getDBQueries(){
        System.out.println("Please choose the queries here: 1/2/3/4");
        System.out.println("1) Count");
        System.out.println("2) Relation");
        String queryName = scanner.next();
        System.out.println("Please Enter the name: ");
        String name = scanner.next();
        System.out.println("Please Enter the Relation: ");
        String relation  = scanner.next();
        System.out.println("Please Enter the Gender M/F: ");
        String gender  = scanner.next();
        CountQuery query1;
        RelationQuery query2;
        switch (queryName) {
            case "1":
                if (gender.equals("M")){
                    query1 = new CountQuery(name, FamilyTreePeople.MALE, relation);
                }
                else{
                    query1 = new CountQuery(name, FamilyTreePeople.FEMALE, relation);
                }
                System.out.println(query1.getCount());
                return;
            case "2":
                if (gender.equals("M")){
                    query2 = new RelationQuery(name, FamilyTreePeople.MALE, relation);
                }
                else{
                    query2 = new RelationQuery(name, FamilyTreePeople.FEMALE, relation);
                }
                System.out.println(query2.getRelation());
                return;
            default:
                System.out.println("Please enter a valid option");
                return;
        }

    }
}
