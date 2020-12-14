import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StopWatch time = new StopWatch();
        time.getStartTime();
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr[i] = (int) (Math.random() * 100000);
        }
        Arrays.sort(arr);
        time.getStopTime();
        time.getElapsedTime();
        System.out.println(time.getElapsedTime());

    }
}
