package family_tree;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import family_tree.factories.GetDBConnectionFactory;
import family_tree.factories.GetPersonGenderFactory;
import family_tree.repository.FamilyTreePeople;
import family_tree.repository.Person;
import family_tree.utils.DBQueries;

public class FamilyTreeClient {
    
    public static void main(String[] args) {
        System.out.println("Welcome to our Family");
        Scanner scanner = new Scanner(System.in);
        Person malePerson = GetPersonGenderFactory.getPersonGender(FamilyTreePeople.MALE);
        Person femalePerson = GetPersonGenderFactory.getPersonGender(FamilyTreePeople.FEMALE);
        DBQueries queries = new DBQueries();
        while (true) {
            System.out.println("Please choose the option here: 1/2/3/4/5");
            System.out.println("1) Add Person");
            System.out.println("2) Add Relation");
            System.out.println("3) Connect Relation");
            System.out.println("4) Get Details");
            System.out.println("5) Queries");
            System.out.println("6) Exit");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Please mention the gender M/F: ");
                    String person = scanner.next();
                    if (person.equals("M")){
                        malePerson.addPerson();
                    } else {
                        femalePerson.addPerson();
                    }
                    break;
                case 2:
                    System.out.println("Please mention the gender M/F: ");
                    person = scanner.next();
                    if (person.equals("M")){
                        malePerson.addRelation();
                    } else {
                        femalePerson.addRelation();
                    }
                    break;
                case 3:
                    System.out.println("Please mention the gender M/F: ");
                    person = scanner.next();
                    if (person.equals("M")){
                        malePerson.connectRelation();
                    } else {
                        femalePerson.connectRelation();
                    }
                    break;
                case 4:
                    HashMap<String, HashMap<String, List<String>>> DBConnections = GetDBConnectionFactory.getDBConnectionFactory();
                    System.out.println(DBConnections);
                    break;
                case 5:
                    queries.getDBQueries();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
