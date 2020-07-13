public class Skill {
    private int level;
    private boolean active;
    private String name;

    Skill(String name, boolean isActive) {
        this.name = name;
        level = 1;
        active = isActive;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public void addLevel(){
        level++;
    }

    public boolean isActive(){
        return active;
    }
}
