package com.module.user.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectDB {

    private static Connection con = null;

    public static Connection abrirBanco() {
        Connection con;
        try {
            //com.mysql.cj.jdbc.Driver  --  com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8", "root", "root");
            /**

             jdbc.url=jdbc:mysql://rm-8vbj1iw38ys186f96o.mysql.zhangbei.rds.aliyuncs.com:3306/cashloan_defq_test?rewriteBatchedStatements=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&zeroDateTimeBehavior=CONVERT_TO_NULL&allowMultiQueries=true
             jdbc.username=defqtest
             jdbc.password=appMqsd234_1c!sfg

             */

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DaDa?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC", "root", "root");
            //con = DriverManager.getConnection("jdbc:mysql://rm-8vbj1iw38ys186f96o.mysql.zhangbei.rds.aliyuncs.com:3306/cashloan_defq_test?rewriteBatchedStatements=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&zeroDateTimeBehavior=CONVERT_TO_NULL&allowMultiQueries=true", "defqtest", "MFfq!23qwe");
            //con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC", "root", "root");
            System.out.println("conectando");
            return con;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("driver nao encontrado: " + cnfe.getMessage());
            return null;
        } catch (SQLException sql) {
            System.out.println("SQLException: " + sql.getMessage());
            System.out.println("SQLState: " + sql.getSQLState());
            System.out.println("Erro: " + sql.getErrorCode());
            System.out.println("StackTrace: " + sql.getStackTrace());
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void fecharBDcon() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("erro ao fechar o banco" + e.getMessage());
        }
    }

    public static void main(String arr[]) {
        System.out.println("Making connection..");
        Connection connection = TestConnectDB.abrirBanco();
        if (connection != null) System.out.println("链接成功");
        System.out.println(connection == null);
        System.out.println("Connection made...");
    }
}
