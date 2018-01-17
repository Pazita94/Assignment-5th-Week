public class Singer {

    static Singer[] singers = new Singer[10];

    String name;
    int id;
    static int counter = 0;

    public Singer(String name) {
        this.name = name;
        this.id = counter;
        singers[counter] = this;
        counter++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[name="+this.name+", id="+this.id+"]";
    }
}
