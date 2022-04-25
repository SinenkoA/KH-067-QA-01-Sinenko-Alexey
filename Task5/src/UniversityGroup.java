import java.util.Arrays;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentsArray;

    //getter groupName
    public String getGroupName() {
        return groupName;
    }

    //getter startYear
    public int getStartYear() {
        return startYear;
    }

    //getter endYear
    public int getEndYear() {
        return endYear;
    }

    //getter studentsArray
    public String[] getStudentsArray() {
        return studentsArray;
    }

    // constructor
    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] students) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentsArray = students;
        this.endYear = startYear + 5;
    }

    // addStudents method
    public String[] addStudent(String[] newStudents) {
        int lenghtNewArr;
        if (studentsArray == null) {
            lenghtNewArr = 0;
            studentsArray = newStudents;
        } else {
            lenghtNewArr = studentsArray.length + newStudents.length;
            String[] newStudentsArray = new String[lenghtNewArr];
            for (int i = 0; i < studentsArray.length; i++) {
                newStudentsArray[i] = studentsArray[i];
            }
            for (int i = studentsArray.length; i < lenghtNewArr; i++) {
                newStudentsArray[i] = newStudents[i - studentsArray.length];
            }
            studentsArray = newStudentsArray;
        }
        return studentsArray;
    }

    // getGroupDiscription
    String getGroupDiscription() {
        String description = String.format("%s start %d end %d students: ", groupName, startYear, endYear);
        for (int i = 0; i < studentsArray.length; i++) {
            description = description + studentsArray[i] + ", ";
        }
        return description;
    }


    public static void main(String[] args) {
        String[] studentJava = new String[]{"Mayson Maunt", "Rise James", "N'Golo Kante"};
        UniversityGroup universitygroup1 = new UniversityGroup("Java", 2022);
        universitygroup1.addStudent(studentJava);

        System.out.println(universitygroup1.getGroupDiscription());

        String[] studentQA = new String[]{"Timo Werner", "Kai Havertz", "Tiago Silva"};
        UniversityGroup universityGroup2 = new UniversityGroup("QA", 2021, studentQA);
        String[] newStudent = {"Eduard Mendy"};
        universityGroup2.addStudent(newStudent);

        System.out.println(universityGroup2.getGroupDiscription());
    }
}
