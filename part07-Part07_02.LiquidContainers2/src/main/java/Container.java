public class Container {
    private int ltr;

    public Container() {
        this.ltr = 0;
    }

    public int contains() {
        return this.ltr;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.ltr += amount;
        } else if (amount + this.ltr > 100) {
            this.ltr = 100;
            
        } else {
            return;
        }
        if(ltr>100) {
            ltr = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        } else if (this.ltr - amount < 0) {
            this.ltr = 0;

        } else {
            this.ltr -= amount;
        }

        if(ltr<0) {
            ltr = 0;
        }

    }

    public String toString() {
        return this.ltr + "/100";
    }

}
