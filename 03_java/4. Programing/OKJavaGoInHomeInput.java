import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {

    // Parameter, 매개변수 = args
    public static void main(String[] args) {

        String id = args[0];
        String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id);  // Elevator : 데이터타입, myElevator : 변수
        myElevator.callForUp(1); // 1층으로 호출 명령

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id+" / hallLamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" / floorLamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" / moodLamp");
        moodLamp.setBright(Double.parseDouble(bright)); // 10의 밝기로
        moodLamp.on();
    }
}
