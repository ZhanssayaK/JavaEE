package problem6.db;

public class Student {
    private String name;
    private int mark;

    public Student() {}
    public Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
