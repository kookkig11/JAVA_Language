package i07;

public class Vocabulary {
    private String word;
    private String type;
    private String mean;
    private String example;

    public Vocabulary(String word, String type, String mean, String example) {
        this.word = word;
        this.type = type;
        this.mean = mean;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String getType() {
        return type;
    }

    public String getMean() {
        return mean;
    }

    public String getExample() {
        return example;
    }
}
