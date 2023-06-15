public class Counter {
    private int count;

    public Counter() {
        this(0);
    }

    public Counter(int num) {
        this.count = num;
    }

    public int value() {
        return this.count;
    }

    

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }
    public void increase(int val) {
        if(val >= 0) {
            this.count += val;

        }
    }

    public void decrease(int val) {
        if(val >= 0) {
            this.count -= val;

        }
    }
}
