import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    Student student;

    @Before
    public void setUP() {
        student = new Student("Eloys", 6739029);
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);

    }

    @Test
    public void testGetId(){
        Assert.assertEquals(6739029, student.getId());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("Eloys",student.getName());
    }

    @Test
    public void testAddGrade(){
        student.addGrade(65);
        Assert.assertTrue(student.getGrades().contains(65));
    }

    @Test
    public void testGetGrades(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(100);
        expected.add(90);
        expected.add(95);

        Assert.assertEquals(expected, student.getGrades());

    }

    @Test
    public void testGetGradeAverage(){
        double expected = (100 + 90 + 95) / 3;
        Assert.assertEquals(expected,student.getGradeAverage(),0);

    }

}
