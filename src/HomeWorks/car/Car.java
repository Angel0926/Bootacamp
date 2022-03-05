package HomeWorks.car;

public final class Car {
   private int year;
    private  String model;
   private  String mark;
   private   Engine engin;


    public Car(int year, String model, String mark, Engine engin) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engin = engin;
    }

    public int getYear() {
        return year;
    }


    public String getModel() {
        return model;
    }



    public String getMark() {
        return mark;
    }


   public  Engine getEngin() {
        return engin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engin=" + engin +
                '}';
    }
}
