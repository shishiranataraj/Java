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
public class Routes {
    
    private int rid;
    private String from_city;
    public String to_city;
    private Boolean Monday;
    private Boolean Tuesday;
    private Boolean Wednesday;
    private Boolean Thursday;
    private Boolean Friday;
    private Boolean Saturday;
    private Boolean Sunday;

    @Override
    public String toString() {
        return "Routes{" + "rid=" + rid + ", from_city=" + from_city + ", to_city=" + to_city + ", Monday=" + Monday + ", Tuesday=" + Tuesday + ", Wednesday=" + Wednesday + ", Thursday=" + Thursday + ", Friday=" + Friday + ", Saturday=" + Saturday + ", Sunday=" + Sunday + '}';
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

    public Boolean getMonday() {
        return Monday;
    }

    public void setMonday(Boolean Monday) {
        this.Monday = Monday;
    }

    public Boolean getTuesday() {
        return Tuesday;
    }

    public void setTuesday(Boolean Tuesday) {
        this.Tuesday = Tuesday;
    }

    public Boolean getWednesday() {
        return Wednesday;
    }

    public void setWednesday(Boolean Wednesday) {
        this.Wednesday = Wednesday;
    }

    public Boolean getThursday() {
        return Thursday;
    }

    public void setThursday(Boolean Thursday) {
        this.Thursday = Thursday;
    }

    public Boolean getFriday() {
        return Friday;
    }

    public void setFriday(Boolean Friday) {
        this.Friday = Friday;
    }

    public Boolean getSaturday() {
        return Saturday;
    }

    public void setSaturday(Boolean Saturday) {
        this.Saturday = Saturday;
    }

    public Boolean getSunday() {
        return Sunday;
    }

    public void setSunday(Boolean Sunday) {
        this.Sunday = Sunday;
    }

    public Routes(int rid, String from_city, String to_city, Boolean Monday, Boolean Tuesday, Boolean Wednesday, Boolean Thursday, Boolean Friday, Boolean Saturday, Boolean Sunday) {
        this.rid = rid;
        this.from_city = from_city;
        this.to_city = to_city;
        this.Monday = Monday;
        this.Tuesday = Tuesday;
        this.Wednesday = Wednesday;
        this.Thursday = Thursday;
        this.Friday = Friday;
        this.Saturday = Saturday;
        this.Sunday = Sunday;
    }

    
}
