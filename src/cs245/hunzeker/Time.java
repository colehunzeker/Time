package cs245.hunzeker;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds) {
        try{
            setSeconds(seconds);
        }
        catch(IllegalArgumentException e){
            this.seconds = seconds % 60;
            minutes += seconds / 60;
        }
        try {
            setMinutes(minutes);
        }
        catch(IllegalArgumentException e){
            this.minutes = minutes % 60;
            hours += minutes / 60;
        }
        try {
            setHours(hours);
        }
        catch (IllegalArgumentException e){
            this.hours = hours % 24;

        }
    }
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23)
            throw new IllegalArgumentException("Invalid Hours");
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes <0 || minutes > 59)
            throw new IllegalArgumentException("Invalid Minutes");
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("Invalid Seconds");
        }
        this.seconds = seconds;
    }
    public void tick(){
        try {
            setSeconds(seconds + 1);
        }
        catch (IllegalArgumentException e){
            seconds = 0;
            minutes += seconds;
            try {
                setMinutes(minutes + 1);
            }
            catch (IllegalArgumentException r){
                minutes = 0;
                hours += minutes;
                try {
                    setHours(hours + 1);
                }
                catch (IllegalArgumentException t){
                    hours = 0;
                }
            }
        }

    }
}
