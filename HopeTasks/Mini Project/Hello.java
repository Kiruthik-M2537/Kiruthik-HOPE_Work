import java.util.*;

abstract class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) this.health = 0;
        else this.health = health;
    }

    public abstract void attack(GameCharacter target);

    public void display() {
        System.out.println(name + " | Health: " + health);
    }
}

class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name, 150);
    }

    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks with sword");
        target.setHealth(target.getHealth() - 20);
    }
}

class Mage extends GameCharacter {

    public Mage(String name) {
        super(name, 100);
    }

    public void attack(GameCharacter target) {
        System.out.println(getName() + " casts fireball");
        target.setHealth(target.getHealth() - 25);
    }
}

class Item {
    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}

class Inventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        System.out.println("Inventory:");
        for (Item i : items) {
            System.out.println(i.getItemName());
        }
    }
}

class GameEngine {
    public void battle(GameCharacter c1, GameCharacter c2) {
        System.out.println("Battle Start");
        c1.attack(c2);
        c2.attack(c1);
        c1.display();
        c2.display();
    }
}

public class Hello {
    public static void main(String[] args) {

        GameCharacter w = new Warrior("Thor");
        GameCharacter m = new Mage("Merlin");

        Inventory inv = new Inventory();
        inv.addItem(new Item("Sword"));
        inv.addItem(new Item("Potion"));

        inv.showItems();

        GameEngine game = new GameEngine();
        game.battle(w, m);
    }
}