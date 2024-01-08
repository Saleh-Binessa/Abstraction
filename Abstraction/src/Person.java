abstract class Person {
    public String name;
    public int ID;

    public Person(String name, int iD) {
        this.name = name;
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    abstract void describeRole();
}
