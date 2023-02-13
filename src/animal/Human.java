package animal;

import animal.Thinkable;

public class Human extends Animal implements Thinkable {

    private String humanHobby;

    public Human() {
    }

    public Human(String humanName, int humanAge, String humanHobby) {
        super(humanName,humanAge);
        this.humanHobby = humanHobby;
    }
    
    @Override
    public void say() {
        System.out.println(getHumanName() + "です。" + gethumanAge() + "歳です。");
    }

    public String getHumanHobby() {
        return humanHobby;
    }

    public void setHumanName(String humanHobby) {
        this.humanHobby = humanHobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + humanHobby + "について考えています。");
    }

}
