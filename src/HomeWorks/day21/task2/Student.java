package HomeWorks.day21.task2;

public class Student extends Person {
      protected  String language;
   protected int week;

    public Student() {
    }

    public Student(String language, int week) {
        this.language = language;
        this.week = week;
    }

    @Override
    public  int id(){
        return age*2/3;
    }


    public  int id(int k, int age){
        return  age*k*4;

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
