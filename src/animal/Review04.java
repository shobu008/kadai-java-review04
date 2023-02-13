package animal;

public class Review04 {

    public static void main(String[] args) {

        Animal human01 = new Human("田中 太郎" , 25 ,"電車");
        Animal human02 = new Human("鈴木 次郎" , 30 , "野球");
        Animal human03 = new Human ("佐藤 花子" , 20 , "英語");

        human01.say();
        ((Human) human01).think();
        human02.say();
        ((Human) human02).think();
        human03.say();
        ((Human) human03).think();
    }

}
