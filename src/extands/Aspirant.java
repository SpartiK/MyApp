package extands;

public class Aspirant extends Student {
    private String aspirantWork;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String aspirantWork) {
        super(firstName, lastName, group, avgMark);
        this.aspirantWork = aspirantWork;
    }

    public Aspirant() {
    }

    public String getAspirantWork() {
        return aspirantWork;
    }

    public void setAspirantWork(String aspirantWork) {
        this.aspirantWork = aspirantWork;
    }
    public int getScholarship() {
        return getAvgMark() == 5 ? 200 : 180;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Ivan","Kojushko", "Group1", 5);
        Aspirant aspirant1 = new Aspirant("Petr","Poroshenko","Group1",3,"scienceWork");
        System.out.println(student1.getFirstName()+" "+ student1.getLastName()+" "+student1.getGroup()+" "+student1.getAvgMark());
        System.out.println(aspirant1.getFirstName()+" "+ aspirant1.getLastName()+" "+aspirant1.getGroup()+" "+aspirant1.getAvgMark()+" "+aspirant1.getAspirantWork());
        Student aspirant2 = new Aspirant("Kolya","Kojushko", "Group1", 5,"Кофеварка");
        System.out.println(aspirant2.getFirstName()+" "+ aspirant2.getLastName()+" "+aspirant2.getGroup()+" "+aspirant2.getAvgMark());
        Student[] group = {student1,aspirant1,aspirant2};
        for (Student st: group){
            System.out.println(st.getLastName()+" "+ st.getScholarship());
        }


    }
}
