package problem5.db;

import java.util.ArrayList;

public class dataBase {
    public static ArrayList<Person> person = new ArrayList<>();
    public static void addPerson(Person p){
        person.add(p);
    }
    public static ArrayList<Person> getPerson(){
        return person;
    }

}
