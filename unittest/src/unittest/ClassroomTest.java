package unittest;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClassroomTest {
    private Classroom classroom;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach // ทำทุกครั้งก่อนทุก test method
    void init() {
        student1 = new Student("Kanittha","6010405076");
        student2 = new Student("Jirapa","6010405046");
        student3 = new Student("Kanoto","5910405076");
        classroom = new Classroom();
    }

    @Test
    @Tag("addStudent")
    @DisplayName("เพิ่มนักเรียน")
    void addStudent_ShouldAddStudentToClassroom_WhenReceiveNameAndId(){
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Assertions.assertEquals(3,classroom.size());
    }

    @Test
    @Tag("addScoreById")
    @DisplayName("เพิ่มคะแนน จากการตรวจสอบid")
    void addScoreById_ShouldIncreaseScore_WhenReceiveCorrectId() {
        classroom.addStudent(student1);
        classroom.addScoreById("6010405076", 100);
        Assertions.assertEquals(100,classroom.getScoreById("6010405076"));
    }

    @Test
    @Tag("addScoreById")
    @DisplayName("หาidไม่พบ แล้วเกิด exception")
    void addScoreById_ShouldThrowNoSuchElementException_WhenReceiveWrongId() {
        classroom.addStudent(student2);
        Throwable exception = assertThrows(NoSuchElementException.class, () -> classroom.addScoreById("6010405085", 80));
        assertEquals("Your id not found!!", exception.getMessage());
    }

    @Test
    @Tag("addScoreById")
    @DisplayName("หาidไม่พบ แล้วเพิ่มคะแนนไม่ได้")
    void addScoreById_ShouldNotIncreaseScore_WhenReceiveWrongId() {
        classroom.addStudent(student1);
        try {
            classroom.addScoreById("6010405085", 80);
        } catch (NoSuchElementException ignored) {

        }

        classroom.addScoreById("6010405076", 70);
        Assertions.assertEquals(70, classroom.getScoreById("6010405076"));
    }

    @Test
    @Tag("averageScore")
    @DisplayName("หาคะแนนเฉลี่ยของนักเรียนในclassroom")
    void averageScore_ShouldFindAverageScoreInClassroom_WhenHaveStudentMoreThanOne(){
        classroom.addStudent(student1);
        classroom.addScoreById("6010405076", 125);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        Assertions.assertEquals(125, classroom.averageScore());
    }

    @Test
    @Tag("totalScore")
    @DisplayName("หาคะแนนรวมของนักเรียนในclassroom")
    void totalScore_ShouldFindTotalScoreInClassroom_WhenHaveStudentMoreThanOne(){
        classroom.addStudent(student1);
        classroom.addScoreById("6010405076", 125);
        classroom.addStudent(student2);
        classroom.addScoreById("6010405046", 75.25);
        classroom.addStudent(student3);
        classroom.addScoreById("5910405076", 99.75);
        Assertions.assertEquals(300, classroom.totalScore());
    }
}
