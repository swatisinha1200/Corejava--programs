
class PenM {

    public void Car(){
        System.out.println("Car is created");
    }
    public String  Pen( int cost){
        if (cost>10){
            return "Pen is expensive";
        }
        return "Pen is created";
    }
}
public class PenMethod {
    public static void main(String[] args) {
        PenM obj=new PenM();
        obj.Car();
        System.out.println(obj.Pen(15));

            }
}