package Experiment;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Budi",500);
        InternshipEmployee iEmp = new InternshipEmployee("Kasbi",5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e;
        IPayable p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
//        p = iEmp;
//        e = eBill;
    }
}