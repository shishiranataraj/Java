/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import airlines.Utilities.JdbcUtil;
import java.util.List;
import dom.Flight;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author shishira
 */
public class FlightDaoImpl {
    public List<Flight> getFlights(){
       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;
       
       List<Flight> flights = new ArrayList<Flight>();
       String sql = "select * from flight_info";
     try{
      connection = JdbcUtil.getConnection("Airlines");
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);
      
      while(resultSet.next()){
          flights.add(new Flight(
                    resultSet.getInt("f_no"),
                    resultSet.getInt("rid"),
                    resultSet.getString("from_city"),
                    resultSet.getString("to_city"),
                    resultSet.getString("carrier_name"),
                    resultSet.getDate("date_of_travel").toString(),
                    resultSet.getString("day_of_week"),
                    resultSet.getFloat("price")
                  
                  
                  
                    
          
          ));
      }
     }
     catch (SQLException sqle){
         System.out.println(sqle);
     }
     finally {
            JdbcUtil.closeConnection(connection);
            JdbcUtil.closeStatement(statement);
        }
        System.out.println("Entered");
        return flights;
    }
    
}

