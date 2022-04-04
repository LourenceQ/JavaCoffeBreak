package AppTimeCalc;

public class Time {

    public static void main(String[] args) {
        Time myObj = new Time(2, 20, 30);
        System.out.println(myObj.PrintTimeToSec());
        System.out.println();

        Time myObj2 = new Time(0, 0, 0);
        System.out.println(myObj2.PrintTimeToSec());
        System.out.println();

        Time myObj3 = new Time(0, 20, 30);
        System.out.println(myObj3.PrintTimeToSec());
        System.out.println();

        Time myObj4 = new Time(2, 0, 30);
        System.out.println(myObj4.PrintTimeToSec());
    }

    public int Hour;
    public int Minute;
    public int Seconds;

    public Time() {
    }

    public Time(int hour, int min) {
        this.Hour = hour;
        this.Minute = min;
    }

    public Time(int hour, int min, int sec) {
        this.Hour = hour;
        this.Minute = min;
        this.Seconds = sec;
    }

    public int ConvertHourToSec() {
        if (this.Hour <= 0)
            return 0;

        else if (this.Hour == 1)
            return (int) Math.pow(60, 2);

        else
            return (int) Math.pow(60, this.Hour) * this.Hour;
    }

    public int ConvertMinToSec() {
        if (this.Minute <= 0)
            return 0;

        else
            return this.Minute * 60;
    }

    public int SumSeconds() {
        return ConvertHourToSec() + ConvertMinToSec() + this.Seconds;
    }

    public String PrintTimeToSec() {
        return this.Hour + ":" + this.Minute + ":" + this.Seconds + "\n"
                + "Hora em segundos: " + ConvertHourToSec() + "\n"
                + "Minuto em segundos: " + ConvertMinToSec() + "\n"
                + "Soma de tempo total em segundos: " + SumSeconds();
    }
}
