import static java.lang.System.out;
public class FlossProperties extends FlossCounter {


    void FlossBrand(String brandName){
        System.out.println("The Brand of floss you use is: "+brandName);
    }

    void FlossLength(float length){
        out.println("The original length of your floss is: "+length +"m");
    }

    void useFloss(float length, float amountused){

         length -=amountused;
         if (length >= 1) {
             out.println("You have used " + amountused + "meters of floss");
             out.println("You have " + length + "m of floss left");
         }
         else {
             out.println("Your floss is finished !!!");
         }
    }
}
