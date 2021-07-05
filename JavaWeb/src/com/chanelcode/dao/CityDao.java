package com.chanelcode.dao;

import com.chanelcode.entity.City;
import com.chanelcode.entity.Province;
import com.chanelcode.util.UtilMySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDao {


    public List<City> queryCities(Integer id)
    {
        List<City> cities = new ArrayList<>();
        String sql = "select * from springdb.city where provinceid = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = UtilMySQLConnection.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();

            while(resultSet.next())
            {
               cities.add(new City(Integer.valueOf(resultSet.getString(1)),resultSet.getString(2)));
            }
            return cities;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            UtilMySQLConnection.close(connection,statement,resultSet);
        }
        return null;
    }
}
