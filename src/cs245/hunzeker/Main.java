package cs245.hunzeker;

public class Main {

    public static void main(String[] args) {
      /*  Time t = new Time(10, 8, 45);
        System.out.println(t);
        t.setSeconds(41);
        System.out.println(t);
        try {
            t.setSeconds(983);
        } catch (IllegalArgumentException e) {
            System.out.println("Oops");
        }
        System.out.println(t);
        */
        Time t2 = new Time(23, 59, 59);
        System.out.println(t2);
        t2.tick();
        System.out.println(t2);
        Date d = new Date (12, 150, 2016);
        System.out.println(d);
        d.nextDay();
        System.out.println(d);
    }

}
