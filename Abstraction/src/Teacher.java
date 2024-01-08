public class Teacher extends Person {

    public String subject;
    public String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int iD, String subject, String school) {
        super(name, iD);
        this.subject = subject;
        this.school = school;
    }

    @Override
    void describeRole() {
        System.out.println(
                "Name: " + getName() + "\nID: " + getID() + "\nis a " + getSubject() + " teacher in " + getSchool());
    }
}
