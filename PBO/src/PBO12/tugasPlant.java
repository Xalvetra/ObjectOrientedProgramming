package PBO12;

/**
 *
 * @author Faris Ikhlasul H
 */
public class tugasPlant {

    public void doDestroy(tugasDestroyable d) {
        if (d instanceof tugasJumpingZombie) {
            tugasJumpingZombie jz = (tugasJumpingZombie) d;
            jz.destroyed();
        } else if (d instanceof tugasWalkingZombie) {
            tugasWalkingZombie wz = (tugasWalkingZombie) d;
            wz.destroyed();
        } else if (d instanceof tugasBarrier) {
            tugasBarrier b = (tugasBarrier) d;
            b.destroyed();
        } else {
            System.out.println("Anda Mengalami Kesalahan Dalam penginputan");
        }
    }
}
