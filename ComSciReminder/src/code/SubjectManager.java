package code;

import java.io.*;
import java.util.ArrayList;

public class SubjectManager {

    private ArrayList<Subject> subjects;
    final private String filePath = "SubjectsList.txt";

    public SubjectManager() throws Exception {
        subjects = new ArrayList<>();
        readFileToSubject(subjects);
    }

    private void saveChangeToFile() throws FileNotFoundException {
        StringBuilder stf = new StringBuilder();
        for (Subject subject : subjects) {
            stf.append(subject.getId() + "/");
            if (subject.isPassed())
                stf.append("P/");
            else
                stf.append("U/");

            if (subject.getPreSubjectsId().size() > 0) {
                StringBuilder tmpStringBuilder = new StringBuilder();
                for (String preSubjectId : subject.getPreSubjectsId()) {
                    tmpStringBuilder.append(preSubjectId + ":");
                }
                stf.append(tmpStringBuilder.toString().substring(0, tmpStringBuilder.toString().length() - 1));
            } else {
                stf.append("null");
            }

            stf.append("\n");
        }

        try (PrintWriter printWriter = new PrintWriter(filePath)) {
            printWriter.print(stf.toString());
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    public void toggleStatusOfSubject(Subject subject) throws FileNotFoundException {
        if (subject.isPassed()) {
            subject.setStatus(false);
        } else {
            subject.setStatus(true);
        }
        saveChangeToFile();
    }

    private void readFileToSubject(ArrayList<Subject> subjects) throws Exception {
        this.subjects.clear();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = bufferedReader.readLine();
        while (line != null && !line.isEmpty()) {
            String[] sffs = line.split("/");
            if (sffs[1].equals("P"))
                subjects.add(new Subject(sffs[0], true, sffs[2]));
            else
                subjects.add(new Subject(sffs[0], false, sffs[2]));
            line = bufferedReader.readLine();
        }
    }

    public Subject getSubject(String id) {
        for (Subject subject : subjects) {
            if (id.equals(subject.getId()))
                return subject;
        }
        return null;
    }
}