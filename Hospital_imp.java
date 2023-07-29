import java.util.Scanner;

interface HospitalImpFile{
    void VisitingCounter();
    void Vist();
    void listForMediciens();
}
class VisitingHospital implements HospitalImpFile {
    Scanner sc = new Scanner(System.in);
    String name; String Disease; long age ,phoneNo;
    public void VisitingCounter() {
        System.out.println(" \n\t\t\t \t WELCOME TO AIMS \n \t\t\t \t  How can i help u");
        System.out.println("Ok, Register your details ");
        System.out.println("Enter your name:: ");
        name=sc.nextLine();

        System.out.println("Enter your Disease name:: ");
        Disease=sc.nextLine();
       System.out.println("your Disease name is:: "+Disease);

        System.out.println("Enter your age:: ");
        age=sc.nextLong();

        System.out.println("Enter your Mobile number:: ");
        phoneNo= sc.nextLong();
        System.out.println("Find your details "+"Name: "+ name+ "\t"+"Age: "+ age +"\t"+" M.No: "+ phoneNo);
        System.out.println("\n");

        System.out.println("Thanks for yours details ");
        System.out.println("let will be confirm you the available doctors ");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("some thing went wrong");
        }


    }

    @Override
    public void Vist() {
        int Dr_name;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Pls choose the Dr below for consult  ");
        System.out.println("1.DR.SHAH(MD)\t 2.DR.SOURAV(MD)\t 3.DR.AJAY(MD)");
        Dr_name=sc.nextInt();
        switch (Dr_name){
            case 1:
                System.out.println("appoint mint will be 1:30pm  ");
                break;
            case 2:
                System.out.println("appoint mint will be 3:30pm ");
                break;
            case 3:
                System.out.println("appoint mint will be 7:30pm");
                break;
            default:
                System.out.println("choose the correct one");


        }

    }

    @Override
    public void listForMediciens() {
        System.out.println("\n Mediciens are as follows");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("some thing went wrong");
        }

        System.out.println(" Acetaminophen ");
        System.out.println(" ibuprofen     ");
        System.out.println(" aspirin       ");
        System.out.println(" aspirin       ");

        System.out.println("\n Thanks for Visit ");
    }
}


public class Hospital_imp {
    public static void main(String[] args) {
        VisitingHospital VS= new VisitingHospital();
        VS.VisitingCounter();
        VS.Vist();
        VS.listForMediciens();

    }
}