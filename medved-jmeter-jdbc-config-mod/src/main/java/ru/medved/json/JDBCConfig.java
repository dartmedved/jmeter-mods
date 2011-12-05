package ru.medved.json;

import java.io.Serializable;

public class JDBCConfig implements Serializable {

	private static final long serialVersionUID = -5399171327784064563L;

	private String url;

	private String section;
	
	private String driver;

	private String user;

	private String password;

	public JDBCConfig() {
		super();
	}

	public String getDriver() {
		return driver;
	}

	public String getPassword() {
		return password;
	}

	public String getSection() {
		return section;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSection(String section) {
		this.section = section;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
