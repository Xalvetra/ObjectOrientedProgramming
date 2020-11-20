package Experiment;

/**
 *
 * @author Faris Ikhlasul H
 */
public class tugasTester {

    public static void main(String[] args) {
        tugasWalkingZombie wz = new tugasWalkingZombie(100, 1);
        tugasJumpingZombie jz = new tugasJumpingZombie(100, 2);
        tugasBarrier b = new tugasBarrier(100);
        tugasPlant p = new tugasPlant();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getZombieInfo());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getZombieInfo());
    }
}
