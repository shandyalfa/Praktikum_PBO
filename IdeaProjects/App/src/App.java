import model.burung;
import model.ular;

public class App {
    public  static void main(String[] args){
        System.out.println("haloo");
        burung burung1 = new burung(" elang", 2);
        ular ular1 = new ular(" python", 3);


        System.out.println(burung1.jenis);


    }
}
