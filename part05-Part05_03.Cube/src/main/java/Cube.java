public class Cube {
    private int edge;

    public Cube(int length) {
        this.edge = length;
    }
    public int volume() {
        return this.edge*this.edge*this.edge;
    }

    public String toString() {
        return "The length of the edge is " + this.edge + " and the volume " + volume();
    }
}
