public class GameMaster {
    public static void main(String[] args){
        Hero abel = new Hero("アベル",100,"銅の剣");
        Slime a = new Slime("スライムA", 30);
        System.out.println("冒険が始まる…!");
        abel.showStatus();
        a.showStatus();
        System.out.println("戦闘開始");
        abel.attack(a);
        a.showStatus();
        a.attack(abel);
        abel.showStatus();
        abel.heal();
        abel.showStatus();
        abel.attack(a);
        abel.attack(a);
        abel.attack(a);
        abel.showStatus();
        a.showStatus();
        System.out.println(abel.isAlive());
        System.out.println(a.isAlive());
        Character partyMember = abel;
        partyMember.hp -= 50;
        abel.showStatus();
    }
}
