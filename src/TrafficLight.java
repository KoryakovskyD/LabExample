import java.util.Arrays;

public class TrafficLight implements Work{
    private Signal signal = Signal.RED;

    @Override
    public void change() {
        switch (signal) {
            case RED: signal = Signal.GREEN;
            break;
            case GREEN: signal = Signal.YELLOW;
            break;
            case YELLOW: signal = Signal.RED;
        }
    }

    public static String[] addArray(int size) {
        TrafficLight t = new TrafficLight();
        String[] array = new String[size];
        for (int i=0; i < array.length; i++) {
            array[i] = t.signal.getColor();
            t.change();
        }
        return array;
    }

    @Override
    public String toString() {
        return "This traffic light is " + signal;
    }

    @Function(value = "l", name = 5)
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i=0; i< 7; i++) {
            System.out.println(t);
            System.out.println(t.signal.getColor());
            t.signal.change();
            t.change();
        }

        String[] result = addArray(7);
        System.out.println(Arrays.toString(result));

        int countStop=0;
        int countGo=0;
        int countWait=0;

        for (int i=0; i< result.length;i++) {
            String sign = result[i];
            if (sign == "Stop") {
                countStop++;
            } else if (sign == "Wait") {
                countWait++;
            } else {
                countGo++;
            }
        }

        System.out.println("count go = " + countGo);
        System.out.println("count wait = " + countWait);
        System.out.println("count stop = " + countStop);

        System.out.println(t.signal.name().toUpperCase());
        System.out.println(t.signal.ordinal());  //числовой порядок значения в enum


    }
}
