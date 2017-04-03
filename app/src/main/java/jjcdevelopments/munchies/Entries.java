package jjcdevelopments.munchies;

public class Entries {

    /** Name of Restaurant */
    private String name;
    /** Address of Restaurant */
    private String addr;
    /** Type of Food Sold */
    private String type;
    /** Price Point of Restaurant */
    private String price;
    /** Latitude Coordinates */
    private double lat = 0;
    /** Longitude Coordinates */
    private double lng = 0;

    /** Default Entries Constrctor */
    public Entries(){

    }

    /**
     * Entries Constructor that's provided data about the restaurant to be stored
     * @param name - given name of restaurant
     * @param addr - given address of restaurant
     * @param type - given type of food served
     * @param price - given price point
     * @param lat - given latitude coordinates
     * @param lng - given longitude coordinates
     */
    public Entries(String name,String addr,String type, String price, double lat, double lng) {
        this.name = name;
        this.addr = addr;
        this.type = type;
        this.price = price;
        this.lat = lat;
        this.lng = lng;
    }

    /**
     * Returns Object's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Object's name to name
     * @param name - new name of restaurant
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns Object's address
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Set the Ohject's address to addr
     * @param addr - new address of restaurant
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * Returns Object's Type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Object's Cuisine Type to type
     * @param type - new cuisine type of restaurant
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the Object's Price Point
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     *Set the Object's Price Point
     * @param price  - new price point of restaurant
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Returns the Object's Latitude Coordinates
     * @return lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * Set the Objects Latitude Coordinates
     * @param lat - new latitude coordinates of restaurant
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * Return the Object's Longitude Coordinates
     * @return lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * Set the Object's Longitude Coordinates
     * @param lng - new longitude coordinates of restaurant
     */
    public void setLng(double lng) {
        this.lng = lng;
    }
}
