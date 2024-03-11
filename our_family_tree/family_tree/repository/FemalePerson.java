package family_tree.repository;

import java.util.Scanner;

public class FemalePerson implements Person{

    private Scanner scanner;
    private FemaleAddPerson femaleAddPerson;
    public People people;
    private FemaleAddRelation femaleAddRelation;
    private FemaleConnectRelation femaleConnectRelation;


    public FemalePerson() {
        this.scanner = new Scanner(System.in);
        this.femaleAddPerson = new FemaleAddPerson();
        this.femaleAddRelation = new FemaleAddRelation();
        this.femaleConnectRelation = new FemaleConnectRelation();
    }

    @Override
    public void addPerson() {
        System.out.print("Please tell the name of the Person: ");
        String name = scanner.next();
        this.people = new People(name);
        femaleAddPerson.addPerson(this.people);
    }


    @Override
    public void addRelation() {
        System.out.println("Please enter the name first person");
        String firstName = scanner.next();
        System.out.println("Please enter the name second person");
        String secName = scanner.next();
        System.out.println("Please enter the name Relation of person ");
        String relation = scanner.next();
        femaleAddRelation.addRelation(new Relations(firstName, secName, relation));
    }

    @Override
    public void connectRelation() {
        System.out.println("Please enter the name first person");
        String firstName = scanner.next();
        System.out.println("Please enter the name second person");
        String secName = scanner.next();
        System.out.println("Please enter the name Relation of person ");
        String relation = scanner.next();
        femaleConnectRelation.connectRelation(new Relations(firstName, secName, relation));
    }

    @Override
    public People getPeople() {
        return people;
    }
    
}
