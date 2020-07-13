public class GameMain {
    public static void main(String[] args) {
        //set new character
        GameCharacter player = new GameCharacter("Kookkig", 10, 10, 10, 1000);
        Item item = new Item("newItem", 100);
        UsableItem usableItem = new UsableItem("useItem", 100, 10, 10, 10);
        Monsterball monsterBall = new Monsterball("newMonsterBall", 100, 100);
        Skill skill = new Skill("playerSkill", false);

        // buyItem method
        try {
            player.buy(usableItem, 5);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // useItem method
        try {
            player.useItem(usableItem);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // receiveItem method
        try {
            player.receiveItems(item, 5);
            player.receiveItems(monsterBall, 1);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // sell method
        try {
            player.sell(item, 5);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // learnSkill method
        try {
            player.learnSkill(skill);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // castSpell method
        try {
            player.castSpell(skill);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // catchBy method
        try {
            player.catchBy(monsterBall);
            System.out.println(player.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
