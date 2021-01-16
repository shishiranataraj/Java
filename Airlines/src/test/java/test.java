
import dao.FlightDaoImpl;
import dom.Flight;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shishira
 */
public class test {
    public static void main(String [] args){
        FlightDaoImpl fdi = new FlightDaoImpl();
        for(Flight fdu : fdi.getFlights()){
            System.out.println(fdu.toString());
        }
    }
}
