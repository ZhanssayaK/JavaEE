package problem4.db;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class DBManager{
    public static ArrayList<Person> person = new ArrayList<>();

    public static ArrayList<Person> getPerson(){
        return person;
    }
    public static void orderFood(Person p){
        person.add(p);
    }
}
