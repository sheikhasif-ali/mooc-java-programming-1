public class Song {
    private String name;
    private int length;

    public Song(String track, int sec) {
        this.name = track;
        this.length = sec;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
