package problem4.db;

public class Person {
    private String name;
    private String surname;
    private String food;
    public Person(){}
    public Person(String name, String surname, String food){
        this.name = name;
        this.surname = surname;
        this.food = food;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
