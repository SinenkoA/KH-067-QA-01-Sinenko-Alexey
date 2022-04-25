import java.util.Arrays;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] students;


    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] students) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.students = students;
        this.endYear = startYear + 5;
    }

    String getGroupDiscription() {
        String description = String.format("%s start %d end %d students %s", groupName, startYear, endYear, students);
        return description;
    }


    public static void main(String[] args) {
        UniversityGroup universitygroup1 = new UniversityGroup("Java", 2022);
        String studentJava = ("Mayson Maunt, Rise James");
        String[] students = studentJava.split(", ");

        System.out.println(universitygroup1.getGroupDiscription());

        UniversityGroup universityGroup2 = new UniversityGroup("QA", 2022);
        String studentQA = ("Mayson Maunt, Rise James");
        String[] students = studentQA.split(", ");

        System.out.println(universityGroup2.getGroupDiscription());


    }
}
