package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rachana {
	@Id
private int trno;
private String trname;
private String trfrom;
private String trto;
private String trdetime;
private String trdate;
public int getTrno() {
	return trno;
}
public void setTrno(int trno) {
	this.trno = trno;
}
public String getTrname() {
	return trname;
}
public void setTrname(String trname) {
	this.trname = trname;
}
public String getTrfrom() {
	return trfrom;
}
public void setTrfrom(String trfrom) {
	this.trfrom = trfrom;
}
public String getTrto() {
	return trto;
}
public void setTrto(String trto) {
	this.trto = trto;
}
public String getTrdetime() {
	return trdetime;
}
public void setTrdetime(String trdetime) {
	this.trdetime = trdetime;
}
public String getTrdate() {
	return trdate;
}
public void setTrdate(String trdate) {
	this.trdate = trdate;
}
}
