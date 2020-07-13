import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String currentWorkDir = System.getProperty("user.dir");
        String fileSep = System.getProperty("file.separator");
        // fileSeparator = \ (escape character) >> ใช้ \\ [ถ้าใส่แค่ \ จะ error]

        //objectFile จะต้อง reference path ให้ถูก
        File newFile = new File("test.txt");
        try {
            if (newFile.createNewFile()){ //createNewFile = สร้างไฟล์ขึ้นมาเอง เมื่อรัน
                System.out.println("- create file test.txt -");
            }
            else{
                System.out.println("have test.txt >> can't create");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Current Dir: " + currentWorkDir);
        try {
            /*
            <<same>>
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter));
             */
            /*
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile, true));
            //BufferedWriter ส่ง String ไปให้ FileWriter เขียน
            bufferedWriter.write(currentWorkDir);
            bufferedWriter.newLine(); //newLine() = ใส่\n
            bufferedWriter.close();
            */

            PrintWriter printWriter = new PrintWriter(new FileWriter(newFile));
            printWriter.printf("[%s] %s\n", new Date(), currentWorkDir); //printf() = การไม่ขึ้นบรรทัดใหม่
            //getPath() = get RelativePath
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(newFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) { //sub
            e.printStackTrace();
        } catch (IOException e) { //super
            e.printStackTrace();
        }
    }
}
