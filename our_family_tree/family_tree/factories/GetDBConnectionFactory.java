package family_tree.factories;

import java.util.HashMap;
import java.util.List;

import family_tree.controllers.FamilyTreeController;
import family_tree.repository.FamilyTreePeople;
import java.util.Scanner;

public class GetDBConnectionFactory {
    
    public static HashMap<String, HashMap<String, List<String>>> getDBConnectionFactory() {
        System.out.println("Please Enter the Gender: M/F");
        String gender = null;
        Scanner scanner = new Scanner(System.in);
        gender = scanner.next();
        HashMap<String, HashMap<String, List<String>>> hashMap = null;
        switch (gender) {
            case "M":
                hashMap = FamilyTreeController.getDBConnection(FamilyTreePeople.MALE);
                break;
            case "F":
                hashMap = FamilyTreeController.getDBConnection(FamilyTreePeople.FEMALE);
                break;
            default:
                break;
        }
        return hashMap;
    }
}
