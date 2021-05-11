package com.ltts.shadow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="diseases")
public class Disease {
	@Id
	private String d_id;
	@Column(name = "d_name"  ,length = 50, nullable = false)
private String disease_name;
	@Column(name = "surgical_Limit"  ,length = 50, nullable = false)
private String surgical_limit;
public String getD_id() {
	return d_id;
}
public void setD_id(String d_id) {
	this.d_id = d_id;
}
public String getDisease_name() {
	return disease_name;
}
public void setDisease_name(String disease_name) {
	this.disease_name = disease_name;
}
public String getSurgical_limit() {
	return surgical_limit;
}
public void setSurgical_limit(String surgical_limit) {
	this.surgical_limit = surgical_limit;
}
public Disease(String d_id, String disease_name, String surgical_limit) {
	super();
	this.d_id = d_id;
	this.disease_name = disease_name;
	this.surgical_limit = surgical_limit;
}
public Disease() {
	super();
}

}
