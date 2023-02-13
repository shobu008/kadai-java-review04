package animal;

public class Animal {

    private String humanName;
    private int humanAge;

    public Animal() {
    }

    public Animal(String humanName, int humanAge) {
        this.humanName = humanName;
        this.humanAge = humanAge;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public int gethumanAge() {
        return humanAge;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void say() {
        System.out.println(humanName + "です。" + humanAge + "歳です。");
    }

}
