package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;               //right click -> generate -> constructor -> choose all
        this.ID = ID;                 //change the class name from public student to public void setInfo
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


    public void code() {
        System.out.println(name + " is coding");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

}
