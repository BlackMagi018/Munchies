package jjcdevelopments.munchies;

/**
 * Created by Jeremiah on 4/18/2017.
 */

public class Meal {

    /** Meal Name */
    private String name;
    /** Meal Steet Address */
    private String addr;
    /** Meal City,State,ZIP */
    private String addr2;
    /** Date of Meal */
    private String day;
    /** Time of Meal */
    private String time;

    /**
     * Constructor for an empty Meal Object
     */
    public Meal() {
        name = "";
        addr = "";
        addr2 = "";
        day = "";
        time = "";
    }

    /**
     * Get Meal Object Name
     * @return Name of Meal
     */
    public String getName() {
        return name;
    }

    /**
     * Set Meal Object Name
     * @param name New Name of Meal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Meal Object Street Address
     * @return Street Address of Meal
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Set Meal Object Street Address
     * @param addr New Street Address of Meal
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * Get Meal Object City,State ZIP
     * @return City,State ZIP of Meal
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Set Meal Object Street Address
     * @param addr2 New City,State ZIP of Meal
     */
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    /**
     * Get Meal Object Date
     * @return Date of Meal
     */
    public String getDay() {
        return day;
    }

    /**
     * Set Meal Object Date
     * @param day New Date of Meal
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Get Meal Object Time
     * @return Time of Meal
     */
    public String getTime() {
        return time;
    }

    /**
     * Set Meal Object Time
     * @param time New Time of Meal
     */
    public void setTime(String time) {
        this.time = time;
    }
}
