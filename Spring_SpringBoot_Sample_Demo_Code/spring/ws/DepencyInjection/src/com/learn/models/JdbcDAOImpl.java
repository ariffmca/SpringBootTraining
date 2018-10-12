package com.learn.models;

public class JdbcDAOImpl {
	
	private String driverClass;
	private String connURL;
	private String dbUserName;
	private String dbPassword;
	private int maxConn ;
	
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getConnURL() {
		return connURL;
	}
	public void setConnURL(String connURL) {
		this.connURL = connURL;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	public int getMaxConn() {
		return maxConn;
	}
	public void setMaxConn(int maxConn) {
		this.maxConn = maxConn;
	}
	
	@Override
	public String toString() {
		return "JdbcDAOImpl [driverClass=" + driverClass + ", connURL=" + connURL + ", dbUserName=" + dbUserName
				+ ", dbPassword=" + dbPassword + ", maxConn=" + maxConn + "]";
	}
}
