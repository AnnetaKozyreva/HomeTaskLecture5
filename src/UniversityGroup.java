import java.util.ArrayList;
import java.util.List;

public class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<String>();

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getGroupName() {
        return groupName;
    }


    UniversityGroup(String gName, int sYear) {
        groupName = gName;
        startYear = sYear;
        endYear = startYear + 5;

    }

    UniversityGroup(String gName, int sYear, ArrayList<String> sList) {
        groupName = gName;
        startYear = sYear;
        endYear = startYear + 5;
        studentList = sList;

    }

    UniversityGroup() {
    }

    public void addStudent(String student) {
        studentList.add(student);
    }

    public boolean removeStudent(String student) {
        return studentList.remove(student);
    }

    public void getGroupDescription() {
        System.out.println("===========================================================");
        System.out.println("Group name: " + getGroupName());
        System.out.println("Start year: " + getStartYear());
        System.out.println("End year: " + getEndYear());
        System.out.println("Students: " + String.join(", ", getStudentList()));
    }


        public static void main(String[] args) {
            ArrayList<String> studentArray = new ArrayList<String>(List.of("Student11", "Student12", "Student13", "Student14", "Student15"));
            UniversityGroup group1 = new UniversityGroup("Group 1", 2014, studentArray);

            String[] studentList = {"Student21", "Student22", "Student23", "Student24", "Student25"};
            UniversityGroup group2 = new UniversityGroup("Group 2", 2020);
            for (int i = 0; i < studentList.length; i++) {
                group2.addStudent(studentList[i]);
            }

            group1.removeStudent("Student12");
            group2.removeStudent("Student24");

            group1.getGroupDescription();
            group2.getGroupDescription();
        }

}
