package family_tree.repository;

import java.util.Scanner;


public class MalePerson implements Person{

    private Scanner scanner;
    private MaleAddPerson maleAddPerson;
    public People people;
    private MaleAddRelation maleAddRelation;
    private MaleConnectRelation maleConnectRelation;


    public MalePerson() {
        this.scanner = new Scanner(System.in);
        this.maleAddPerson = new MaleAddPerson();
        this.maleAddRelation = new MaleAddRelation();
        this.maleConnectRelation = new MaleConnectRelation();
    }

    @Override
    public void addPerson() {
        System.out.print("Please tell the name of the Person: ");
        String name = scanner.next();
        this.people = new People(name);
        maleAddPerson.addPerson(this.people);
    }


    @Override
    public void addRelation() {
        System.out.println("Please enter the name first person");
        String firstName = scanner.next();
        System.out.println("Please enter the name second person");
        String secName = scanner.next();
        System.out.println("Please enter the name Relation of person ");
        String relation = scanner.next();
        maleAddRelation.addRelation(new Relations(firstName, secName, relation));
    }

    @Override
    public void connectRelation() {
        System.out.println("Please enter the name first person");
        String firstName = scanner.next();
        System.out.println("Please enter the name second person");
        String secName = scanner.next();
        System.out.println("Please enter the name Relation of person ");
        String relation = scanner.next();
        maleConnectRelation.connectRelation(new Relations(firstName, secName, relation));
    }

    @Override
    public People getPeople() {
        return people;
    }
    
}
