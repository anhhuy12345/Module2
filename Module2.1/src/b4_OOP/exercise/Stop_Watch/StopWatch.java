package b4_OOP.exercise.Stop_Watch;


public class StopWatch {
    private Long startTime;
    private Long endTime;

    public StopWatch() {
    }

    public StopWatch(Long startTime, Long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //setter getter
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    //phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public Long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    //phương thức stop() để reset endTime về thời gian thực của hệ thống.
    public Long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    // Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public Long getElapsetTime() {
        return this.endTime - this.startTime;
    }
}
