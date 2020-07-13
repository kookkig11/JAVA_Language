package i02;
// elab-source: CheckTestMain.java
// elab-mainclass: CheckTestMain

import java.util.Scanner;

public class CheckTestMain {
    public static void main(String[] args) {
        int n;
        String ans, student;
        Scanner sc = new Scanner(System.in);
        CheckTest2 checkTest = new CheckTest2();

        ans = sc.next();
        checkTest.setAnswer(ans);
        n = sc.nextInt();
        checkTest.setNumStudent(n);
        for (int i = 1; i <= n; i++) {
            student = sc.next();
            checkTest.checkStudent(student);
        }

        for (int i = 1; i <= checkTest.getNumAnswer(); i++) {
            System.out.println(i + ": " + checkTest.getCorrect(i));
        }
    }
}
