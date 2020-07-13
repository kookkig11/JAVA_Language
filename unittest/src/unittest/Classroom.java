package unittest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

public class Classroom {
    private Collection<Student> students;
    private double average;
    private double scores;

    public Classroom() {
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addScoreById(String id, double score) {
        for (Student i: students){
            if (i.getId().equals(id)){
                i.addScore(score);
            }
            else{
                throw new NoSuchElementException("Your id not found!!");
            }
        }
    }

    public double getScoreById(String id) {
        for (Student i: students){
            if (i.getId().equals(id)){
                 scores = i.getScore();
            }
            else{
                throw new NoSuchElementException();
            }
        }
        return scores;
    }

    public double averageScore() {
        if (size() > 0) {
            average = totalScore()/size();
        }
        return average;
    }

    public double totalScore() {
        double total = 0;
        for (Student i: students){
            total += i.getScore();
        }
        return total;
    }

    public int size() {
        return students.size();
    }
}
