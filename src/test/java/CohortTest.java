import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {

    Cohort cohort;
    Student student;
    @Before
    public void setUp(){

        student = new Student("Eloys", 6739029);
        cohort = new Cohort();
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);
        cohort.addStudent(student);

    }

    @Test
    public void testAddGetStudent() {
        Cohort expected = new Cohort();
        expected.addStudent(student);

        Assert.assertEquals(expected.getStudents(), cohort.getStudents());
    }

    @Test public void testGetCohortAverage(){
        double exp = student.getGradeAverage();
        Assert.assertEquals(exp, cohort.getCohortAverage(), 0);

    }
}
