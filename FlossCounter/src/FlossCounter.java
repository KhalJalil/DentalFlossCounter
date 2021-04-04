

import static java.lang.System.out;


import java.util.Scanner;
public class FlossCounter {
    public static void main (String args[]) {

        Scanner intake = new Scanner(System.in);
        FlossProperties flosser = new FlossProperties();

        out.print("What brand of floss do you use ? : ");
        String brand = intake.nextLine();

        flosser.FlossBrand(brand);

        float flosslength ;
        out.print("How much floss does it contain in meters ? : ");
        flosslength = intake.nextFloat();
        flosser.FlossLength(flosslength);

        float deductFloss;
        out.println("What would you like to do ");
        while (true){

            out.println("1. Use floss ");
            out.println("2. Close floss");
            String choice = intake.next();

            if (choice.equals("1")) {

                out.print("How much floss do you need in meters ? : ");
                deductFloss = intake.nextFloat();
                flosser.useFloss(flosslength, deductFloss);
                flosslength -= deductFloss;
                continue;
            }

            else if(choice.equals("2")){
                out.println("You have closed the floss");
                break;
            }
            else
                out.println("The floss is still open !");
            out.println("Choose a valid option ");
            continue;
        }
    }

}
