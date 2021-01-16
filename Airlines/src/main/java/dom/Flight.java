/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;

/**
 *
 * @author shishira
 */
public class Flight {
    private int f_no;
    private int rid;
    private String from_city;
    private String to_city;
    private String carrier_name;
    private String date_of_travel;
    private String day_of_week;
    private float price;

    public int getF_no() {
        return f_no;
    }

    public void setF_no(int f_no) {
        this.f_no = f_no;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getFrom_city() {
        return from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public String getCarrier_name() {
        return carrier_name;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public String getDate_of_travel() {
        return date_of_travel;
    }

    public void setDate_of_travel(String date_of_travel) {
        this.date_of_travel = date_of_travel;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Flight(int f_no, int rid, String from_city, String to_city, String carrier_name, String date_of_travel, String day_of_week, float price) {
        this.f_no = f_no;
        this.rid = rid;
        this.from_city = from_city;
        this.to_city = to_city;
        this.carrier_name = carrier_name;
        this.date_of_travel = date_of_travel;
        this.day_of_week = day_of_week;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" + "f_no=" + f_no + ", rid=" + rid + ", from_city=" + from_city + ", to_city=" + to_city + ", carrier_name=" + carrier_name + ", date_of_travel=" + date_of_travel + ", day_of_week=" + day_of_week + ", price=" + price + '}';
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Flight get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
