package Experiment;

/**
 *
 * @author Faris Ikhlasul H
 */
public class tugasJumpingZombie extends tugasZombie {

    public tugasJumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void health() {
        switch (this.level) {
            case 1:
                this.health += this.health * 0.3;
                break;
            case 2:
                this.health += this.health * 0.4;
                break;
            case 3:
                this.health += this.health * 0.5;
                break;
            default:
                System.out.println("Level Anda Tidak Cukup");
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= this.health*0.01;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \nHealth = "+this.health+"\nLevel: "+this.level;
    }
}
