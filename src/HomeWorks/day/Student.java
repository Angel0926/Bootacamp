package HomeWorks.day;

import java.util.Objects;

public class Student extends Person{
    private  int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student() {
    super();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Person p=new Person("name", 25);
        Student s=new Student("name", 25,6);
        Student s1=new Student("name", 25,6);
        System.out.println(s.equals(s1));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!this.getClass().isInstance(o)) return false;
        Student student = (Student) o;
        return (grade == student.grade && getName().equals(student.getName()) && getAge() == student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + getGrade() +"age"+ getAge() + "name" + getName() +
                "}";
    }
}
