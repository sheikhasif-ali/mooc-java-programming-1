public class Archive {
    private String id;
    private String name;
    
    public Archive (String id, String name) {
        this.id = id;
        this.name = name;       
    }

    public String getId() {
        return this.id;
    }

    public boolean equals(Archive compared) {
        if(this.id.equals(compared.id)) {
            System.out.println("equal");
            return true;
        }
        System.out.println("false");
        return false;
    } 
    
    public String toString() {
        return id + ": " + name;
    }
}