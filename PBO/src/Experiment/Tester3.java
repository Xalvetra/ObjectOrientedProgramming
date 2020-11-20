package Experiment;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Budi",500);
        InternshipEmployee iEmp = new InternshipEmployee("Kasbi",5);
        ElectricityBill eBill = new ElectricityBill(5,"A-1");
        Employee e[] = {pEmp,iEmp};
        IPayable p[] = {pEmp,eBill};
//        Employee e2[] = {pEmp,iEmp,eBill};
    } 
}
