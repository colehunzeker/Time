package cs245.hunzeker;
import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    Scanner goodDate = new Scanner(System.in);
    public int daysInMonth;

    public Date(){
        day = 1;
        month = 1;
        year = 1;
    }



    public Date(int month, int day, int year) {
        System.out.println("How many days are in this month?");
        daysInMonth = goodDate.nextInt();
        if (day > 0){
            try {
                setDay(day);
            }
            catch (IllegalArgumentException e){
                    this.day = day % daysInMonth;
                    month += day / daysInMonth;
                }
            }
        if (month > 0) {
            try {
                setMonth(month);
            } catch (IllegalArgumentException e) {
                this.month = month % 12;
                year += month / 12;
            }
        }
        if (year > 0) {
            try {
                setYear(year);
            } catch (IllegalArgumentException e) {
                this.year = -year;
            }
        }


    }
    public String toString(){
        return (month + "/" + day + "/" + year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > daysInMonth || day < 0)
            throw new IllegalArgumentException("Invalid day");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12)
            throw new IllegalArgumentException("Invalid Month");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0)
            throw new IllegalArgumentException("Invalid Year");
        this.year = year;
    }
    public void nextDay(){
        try {
            setDay(day + 1);
        }
        catch (IllegalArgumentException e){
            day =  1;
            month += day;
            try {
             setMonth(month + 1);
          }
            catch (IllegalArgumentException r) {
                month = 1;
                year += month;
            }
        }
    }
}
