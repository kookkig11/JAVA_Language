import java.util.ArrayList;
import java.util.Collection;

public class Data {
    //ถ้าเป็นการทำงานที่เหมือนกัน จะใช้interfaceเข้ามาช่วย
/*
    public static double average(Collection<InterfaceCallback.Measurable> collection){ //use collection(interface)
        double sum = 0;
        for (InterfaceCallback.Measurable mea: collection){
            sum += mea.getMeasure();
            //เรียกใช้ได้แค่ method interface เท่านั้น
        }
        return sum/collection.size();
    }
*/
    public static double average(Collection<?> collection,Measurer measurer){ //use collection(interface)
        double sum = 0;
        for (Object obj: collection){
            sum += measurer.measure(obj);
            //เรียกใช้ได้แค่ method interface เท่านั้น
        }
        return sum/collection.size();
    }

    public static void main(String[] args) {
//        InterfaceCallback.Students s1 = new InterfaceCallback.Students(10);
//        InterfaceCallback.Students s2 = new InterfaceCallback.Students(20);
//        InterfaceCallback.Students s3 = new InterfaceCallback.Students(30);
//        Collection<InterfaceCallback.Measurable> stdArr = new ArrayList<>();
//        stdArr.add(s1);
//        stdArr.add(s2);
//        stdArr.add(s3);
//        System.out.println(InterfaceCallback.Data.average(stdArr));
//
//        InterfaceCallback.MemberCard m1 = new InterfaceCallback.MemberCard(10);
//        InterfaceCallback.MemberCard m2 = new InterfaceCallback.MemberCard(20);
//        InterfaceCallback.MemberCard m3 = new InterfaceCallback.MemberCard(30);
//        Collection<InterfaceCallback.Measurable> memArr = new ArrayList<>();
//        memArr.add(m1);
//        memArr.add(m2);
//        memArr.add(m3);
//        System.out.println(InterfaceCallback.Data.average(memArr));

        Measurer ageMeasurer = new Measurer() {
            @Override
            public double measure(Object obj) {
                return ((Students)obj).getAge();
            }
        };

        Students s1 = new Students(10);
        Students s2 = new Students(20);
        Students s3 = new Students(30);
        s1.addScore(100);
        s2.addScore(120);
        s3.addScore(300);
        Collection<Students> stdArr = new ArrayList<>();
        stdArr.add(s1);
        stdArr.add(s2);
        stdArr.add(s3);
        System.out.println(Data.average(stdArr, ageMeasurer));
        System.out.println(Data.average(stdArr, new Measurer() {
            //Ctrl + space = แนะนำ
            @Override
            public double measure(Object obj) {
                return ((Students)obj).getScore();
            }
        }));
/*
        MemberCard m1 = new MemberCard(10);
        MemberCard m2 = new MemberCard(20);
        MemberCard m3 = new MemberCard(30);
        Collection<MemberCard> memArr = new ArrayList<>();
        memArr.add(m1);
        memArr.add(m2);
        memArr.add(m3);
        System.out.println(Data.average(memArr, new Measurer() {
            @Override
            public double measure(Object obj) {
                return ((MemberCard)obj).getMeasure();
            }
        }));
        */
    }
}
