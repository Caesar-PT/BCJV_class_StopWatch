public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return start();
    }

    public long getStopTime() {
        return stop();
    }

    public StopWatch(){
            this.startTime = getStartTime();
            this.endTime = getStopTime();
    }

    private long start(){
      return  this.startTime = System.currentTimeMillis();
    }

    private long stop(){
      return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}