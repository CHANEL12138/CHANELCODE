package com.chanelcode.dao;

import com.chanelcode.entity.Province;
import com.chanelcode.util.UtilMySQLConnection;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProvinceDao {
    public String queryProById(Integer id)
    {
        String sql = "select name from springdb.province where id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String result = "";
        try{
            connection = UtilMySQLConnection.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            if(resultSet==null)return "";
            while (resultSet.next())
            {
                result = resultSet.getString(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            UtilMySQLConnection.close(connection,statement,resultSet);
        }
        return result;
    }

    public Province queryOneProById(Integer id)
    {
        String sql = "select * from springdb.province where id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Province result = null;
        try{
            connection = UtilMySQLConnection.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            if(resultSet==null)return null;
            while (resultSet.next())
            {
                result = new Province(id,resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            UtilMySQLConnection.close(connection,statement,resultSet);
        }
        return result;
    }

    public List<Province> queryProvinces()
    {
        List<Province> provinces = new ArrayList<>();
        String sql = "select * from springdb.province order by id";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = UtilMySQLConnection.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while(resultSet.next())
            {
                provinces.add(new Province(Integer.valueOf(resultSet.getString(1)),resultSet.getString(2),
                        resultSet.getString(3),resultSet.getString(4)));
            }
            return provinces;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            UtilMySQLConnection.close(connection,statement,resultSet);
        }
        return null;
    }


}
