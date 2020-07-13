public class Students{
    private int age;
    private  double score;

    public Students(int age) {
        this.age = age;
    }

    public void addScore(double score){
        this.score += score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}
