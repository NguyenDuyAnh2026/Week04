package Bai2;

public class Hero extends ActionCharacter implements CanFly, CanFight, CanSwim{
    public void swim(){
        System.out.println("Hero is swimming..");
    }
    public void fly(){
        System.out.println("Cat canh...");
    }

    public static void main(String[] args) {
        Hero hero = new  Hero();
        hero.fly();
        CanSwim swimmer = (CanSwim) hero; //upcasting
        swimmer.swim();

        CanFight fighter = (CanFight) hero;
        fighter.fight();
    }
}
