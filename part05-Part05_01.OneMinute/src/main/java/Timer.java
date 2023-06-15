public class Timer {
    private ClockHand second;
    private ClockHand hundered;

    public Timer() {
        this.second = new ClockHand(60);
        this.hundered = new ClockHand(100);
    }

    public void advance() {
        this.hundered.advance();
        if(this.hundered.value() == 0) {
            this.second.advance();
        }
    }

    public String toString() {
        return this.second + ":" + this.hundered;
    }

}
