package jjcdevelopments.munchies;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

/**
 * Created by Jeremiah on 4/18/2017.
 */

public class Meal {

    private String name;
    private String addr;
    private String addr2;
    private String day;
    private String time;

    public Meal() {
        name = "Jeremiah's House";
        addr = "10897 48th Ave";
        addr2 = "Allendale,MI 49401, USA";
        day = "7/28/2017";
        time = "7:45";
    }

    public Meal(String name, String addr, String addr2, String day, String time) {
        this.name = name;
        this.addr = addr;
        this.addr2 = addr2;
        this.day = day;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
