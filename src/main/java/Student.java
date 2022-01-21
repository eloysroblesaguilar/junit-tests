import java.util.ArrayList;

public class Student {


/**    The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    The Student class should have the following methods:
    // returns the student's id
    public long getId(){...}

    // returns the student's name
    public String getName(){...}

    // adds the given grade to the grades list
    public void addGrade(int grade){...}

    // returns the list of grades
    public ArrayList<Integer> getGrades(){...}

    // returns the average of the students grades
    public double getGradeAverage(){...}
**/

private String name;
private long id;
private ArrayList<Integer> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public Student (){}
}
