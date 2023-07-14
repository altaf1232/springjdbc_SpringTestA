package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("my Spring core JDBC program started");
        //here is create your jdbcTampleObject
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       JdbcTemplate jdbctemplate=context.getBean("AJTemplate",JdbcTemplate.class);
       //here is started your insert query
       String query="insert into students(id,name,city) values(?,?,?)";
       //here is insert your value used query
       //query ko fier karne key liye direct jdbctemplate  ka object used karte hai 
       //aaur iss key eaak method updatemethod ka used huta hai query fire karne key liye
        int result=jdbctemplate.update(query,192," malikkk","Mumbai_Citya");
        System.out.println("number of record inserted"+result);
    }
}
