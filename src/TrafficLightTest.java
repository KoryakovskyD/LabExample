import org.junit.Test;

public class TrafficLightTest {

    TrafficLight t = new TrafficLight();

    @Test
    public void initialization() {
        assert t.toString().equals(str(Signal.RED));
    }


    public static String str(Signal s) {
        return "This traffic light is " + s;
    }

}
