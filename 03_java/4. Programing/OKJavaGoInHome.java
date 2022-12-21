import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaGoInHome {
    public static void main(String[] args) {

        String id = "JAVA APT 507";

        // Elevator call
        Elevator myElevator = new Elevator(id);  // Elevator : 데이터타입, myElevator : 변수
        myElevator.callForUp(1); // 1층으로 호출 명령

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" / floor Lamp");
        floorLamp.on();
    }
}
