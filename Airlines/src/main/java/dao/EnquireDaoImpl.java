/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import airlines.Utilities.JdbcUtil;
import dom.Flight;
import dom.Routes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shishira
 */
public class EnquireDaoImpl {
     public List<Routes> getRoute(){
       Connection connection = null;
       Statement statement = null;
       ResultSet resultSet = null;
       System.out.println("Here the var is ");
       List<Routes> routes = new ArrayList<Routes>();
       String sql = "select * from routes ";
     try{
      connection = JdbcUtil.getConnection("Airlines");
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);
      
      while(resultSet.next()){
          routes.add(new Routes(
                    
                    resultSet.getInt("rid"),
                    resultSet.getString("from_city"),
                    resultSet.getString("to_city"),
                    resultSet.getBoolean("Monday"),
                    resultSet.getBoolean("Tuesday"),
                    resultSet.getBoolean("Wednesday"),
                    resultSet.getBoolean("Thursday"),
                    resultSet.getBoolean("Friday"),
                    resultSet.getBoolean("Saturday"),
                    resultSet.getBoolean("Sunday")


             
                  
                  
                  
                    
          
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
        return routes;
     }
}
