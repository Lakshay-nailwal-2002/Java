package Encapsulation;

public class Player {
    private String name;
    private int health;
    private String weapon;

    static private final int MAX_HEALTH = 100;

    public Player(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public Player() {
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(health <= 0){
            System.out.println("Player " + name + " got K.O. ");
        }
    }

    public void restoreHealth(int extraHealth){
        this.health += extraHealth;
        this.health = Math.max(MAX_HEALTH , this.health);
    }

    public int healthRemaining(){
        return this.health;
    }

}
