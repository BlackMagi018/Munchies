package jjcdevelopments.munchies;

public class Entries {

    private String name;
    private String addr;
    private String type;
    private String price;
    private String hours;
    private double lat = 0;
    private double lng = 0;

    public Entries(){

    }

    public Entries(String name,String addr,String type, String price,String hours) {
        this.name = name;
        this.addr = addr;
        this.type = type;
        this.price = price;
        this.hours = hours;
    }

    public Entries(String name,String addr,String type, String price,String hours, double lat, double lng) {
        this.name = name;
        this.addr = addr;
        this.type = type;
        this.price = price;
        this.hours = hours;
        this.lat = lat;
        this.lng = lng;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
