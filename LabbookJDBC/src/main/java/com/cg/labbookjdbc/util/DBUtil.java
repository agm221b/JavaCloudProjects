package com.cg.labbookjdbc.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.labbookjdbc.exception.AuthorException;
import com.cg.labbookjdbc.util.DBUtil;

public class DBUtil {

	private static Logger myLogger;
	private static Connection connection;
	
    static{
  	
  	  Properties props = System.getProperties();
  	  String userDir= props.getProperty("user.dir")+"/src/main/resources/";
  	  System.out.println("Current working directory is " +userDir);
  	  PropertyConfigurator.configure(userDir+"/log4j.properties");
  	  myLogger=Logger.getLogger("DBUtil.class");
		}
    
    public static Connection getConnection() throws AuthorException{
  	  
  	  String driver,url,username, password;
  	try {
  		Properties prop=DBUtil.loadProp();
  		url = prop.getProperty("url");
		  username = prop.getProperty("user");
		  password = prop.getProperty("password");
		  
		  connection=DriverManager.getConnection(url, username, password);
		  if(connection!=null)
			  myLogger.info("connection Obtained! : "+connection);
		  else
			  throw new AuthorException("sorry!!! Something went wrong"
  			  		+ " with the connection");
	  }catch(Exception e) {
		  throw new AuthorException(e.getMessage());
	  }
	   return connection;  
    }
	


	private static Properties loadProp() throws AuthorException{
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
  	  String userDir= props.getProperty("user.dir")+"/src/main/resources/";
  	  Properties myProp=new Properties();
		try (FileInputStream fis=new FileInputStream(userDir+"/jdbc.properties"))	{  			
			myProp.load(fis);
			//System.out.println("Property file loaded");
			myLogger.info("Property File loaded : ");	
		} 
		catch (Exception e){
			myLogger.error("Property File Not loaded");	
			throw new AuthorException(e.getMessage());
		}
		return myProp;
		//
	}
	
	public static void closeConnection() throws AuthorException {
  	  try {
  		  if(connection !=null) {
  			  connection.close();
  			  myLogger.error("Closing Connection");
  		  }
  		  else
  			  myLogger.error("Connection already closed");
  	  } catch (Exception e) {
  		  myLogger.error("Connection already closed");	
  		  throw new AuthorException(e.getMessage());
  	  }
    }
}