public class Fitbyte {
    private int age;
    private int restinghr;

    public Fitbyte(int age, int restinghr) {
        this.age = age;
        this.restinghr = restinghr;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((maxhr(getAge())-getRestinghr()) * (percentageOfMaximum) + getRestinghr());
    }

    public double maxhr(int age) {
        return 206.3 - (0.711 * age);
    }

    public int getRestinghr() {
        return this.restinghr;
    }

    public int getAge() {
        return this.age;
    }
}
