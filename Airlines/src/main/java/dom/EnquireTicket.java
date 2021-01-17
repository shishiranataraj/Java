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
public class EnquireTicket {
    private String from_city;
    private String to_city;
    private String date_of_travel;

    public EnquireTicket(String from_city, String to_city, String date_of_travel) {
        this.from_city = from_city;
        this.to_city = to_city;
        this.date_of_travel = date_of_travel;
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

    public String getDate_of_travel() {
        return date_of_travel;
    }

    public void setDate_of_travel(String date_of_travel) {
        this.date_of_travel = date_of_travel;
    }

    @Override
    public String toString() {
        return "EnquireTicket{" + "from_city=" + from_city + ", to_city=" + to_city + ", date_of_travel=" + date_of_travel + '}';
    }
    
}
