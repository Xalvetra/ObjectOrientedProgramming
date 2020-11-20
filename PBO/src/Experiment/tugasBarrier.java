package Experiment;

/**
 *
 * @author Faris Ikhlasul H
 */
public class tugasBarrier implements tugasDestroyable {

    private int strength;

    public tugasBarrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
    }

    public String getZombieInfo() {
        return "Barrier Strength = "+strength;
    }
}