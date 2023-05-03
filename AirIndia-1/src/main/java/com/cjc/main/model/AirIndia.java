package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AirIndia {
	@Id
private int flno;
private String flname;
private String flfrom;
private String flto;
private String fltime;
public int getFlno() {
	return flno;
}
public void setFlno(int flno) {
	this.flno = flno;
}
public String getFlname() {
	return flname;
}
public void setFlname(String flname) {
	this.flname = flname;
}
public String getFlfrom() {
	return flfrom;
}
public void setFlfrom(String flfrom) {
	this.flfrom = flfrom;
}
public String getFlto() {
	return flto;
}
public void setFlto(String flto) {
	this.flto = flto;
}
public String getFltime() {
	return fltime;
}
public void setFltime(String fltime) {
	this.fltime = fltime;
}

}
