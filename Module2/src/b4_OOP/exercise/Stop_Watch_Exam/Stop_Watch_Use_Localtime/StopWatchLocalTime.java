package b4_OOP.exercise.Stop_Watch_Exam.Stop_Watch_Use_Localtime;

import java.time.LocalTime;

public class StopWatchLocalTime {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatchLocalTime() {
    }

    public StopWatchLocalTime(LocalTime starTime, LocalTime endTime) {
        this.startTime = starTime;
        this.endTime = endTime;
    }


    public LocalTime getStarTime1() {
        return startTime;
    }

    public void setStarTime1(LocalTime starTime) {
        this.startTime = starTime;
    }

    public LocalTime getEndTime1() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int start1() {
        this.startTime = LocalTime.now();
        return this.startTime.getNano();
    }

    public int end1() {
        this.endTime = LocalTime.now();
        return this.endTime.getNano();
    }

    public int getElapsetTime1() {
        return this.endTime.getNano() - this.startTime.getNano();
    }
}
