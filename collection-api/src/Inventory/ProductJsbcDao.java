package Inventory;

 

import java.sql.Statement;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;

 

public class ProductJsbcDao {

    

    public ProductJsbcDao() {

    }

    

    public void add(Product p) {

        String sql ="insert into product values (?,?,?)";

        

        Connection conn;

        try {

            conn = JdbcFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            // Replace place holders with values from p object

 

            stmt.setInt(1, p.getCode());

            stmt.setString(2, p.getName());

            stmt.setDouble(3, p.getPrice());

            stmt.execute();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    

    public Product find(int code) {

        String sql ="select *from product where code="+code;

        Connection conn;

        try {

            conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            // create product class object with results set record

            Product p = null;

            if (rs.next()) {

                p = new Product();

                p.setCode(rs.getInt(1));

                p.setName(rs.getString(2));

                p.setPrice(rs.getDouble(3));

            }

            return p;

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        }

    }

    

    public List<Product> list(){

        String sql = "select *from product";

        Connection conn;

        try {

            conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

 

            List<Product> products = new ArrayList<Product>();

            // Create a list from records of result set

            while(rs.next()) {

                Product p = new Product();

                p.setCode(rs.getInt(1));

                p.setName(rs.getString(2));

                p.setPrice(rs.getDouble(3));

                products.add(p);

            }

            return products;

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        }        

    }

    

    public void delete(int code) {

        String sql ="delete from product where code ="+ code;

        

        try {

            Connection conn = JdbcFactory.getConnection();

            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}