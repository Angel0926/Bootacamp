package HomeWorks.car;

public class Engine {
    int horsePow;
    double maillage;
    int weight;

    public Engine() {
    }

      public Engine(int horsePow, double maillage, int weight) {
        this.horsePow = horsePow;
        this.maillage = maillage;
        this.weight = weight;

    }

    public int getHorsePow() {
        return horsePow;
    }

    public void setHorsePow(int horsePow) {
        this.horsePow = horsePow;
    }

    public double getMailiage() {
        return maillage;
    }

    public void setMailiage(double mailiage) {
        this.maillage = mailiage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePow=" + horsePow +
                ", mailiage=" + maillage +
                ", weight=" + weight +
                '}';
    }
}
