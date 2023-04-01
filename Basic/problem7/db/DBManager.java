package problem7.db;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Footballer> arr = new ArrayList<>();

    public static ArrayList<Footballer> getFootballers(){
        return arr;
    }
    public static void addFootballer(Footballer f){
        arr.add(f);
    }
}
