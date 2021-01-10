/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import airlines.Utilities.JdbcUtil;
import java.sql.Connection;

/**
 *
 * @author shishira
 */
public class ConnectionTest {
    public static void main(String[] args) {
        Connection connection = JdbcUtil.getConnection("Airlines");
        if(connection != null) {
            System.out.println("Shi connection establised");
        }
    }
}
