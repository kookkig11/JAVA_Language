package Monsterball;
// elab-source: Monsterball.MonsterballMain.java
// elab-mainclass: Monsterball.MonsterballMain

public class MonsterballMain {
    public static void main(String[] args) {
        Monsterball monsterball1 = new Monsterball("Poke Ball", 200, 100, 1);
        Monsterball monsterball2 = new Monsterball("Great Ball", 600, 300, 1.5);
        Monsterball monsterball3 = new Monsterball("Ultra Ball", 1200, 600, 2);
        Monsterball monsterball4 = new Monsterball("Drive Ball", 1000, 500, 3.5);

        System.out.println(monsterball1.toString() + "\n" + monsterball2.toString() + "\n" + monsterball3.toString() + "\n" + monsterball4.toString());
    }
}
