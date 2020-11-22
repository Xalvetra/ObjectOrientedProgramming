package PBO12;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tester2 {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Budi", 500);
        Employee e;

        e = pEmp;
        System.out.println("" + e.getEmployeeInfo());
        System.out.println("-----------------------");
        System.out.println("" + pEmp.getEmployeeInfo());

    }
}
