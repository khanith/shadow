package com.ltts.shadow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PatientDiagnosis")
public class PatientDiagnosis {
	@Id
	private int d_id;
    
	@OneToOne
    @JoinColumn(name = "Patient_ID", nullable = false)
    private Patients Patients;
	
	private String blood_test_results;
	
	private String bp;
	
	private String surgery_required;
	
	private Date surgical_date;
	
	private String anesthetic_name;
	
	private String nurse_name;

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}


	public int getPatients() {
		return Patients.getPatient_ID();
	}

	public void setPatients(Patients patients) {
		Patients = patients;
	}

	public String getBlood_test_results() {
		return blood_test_results;
	}

	public void setBlood_test_results(String blood_test_results) {
		this.blood_test_results = blood_test_results;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getSurgery_required() {
		return surgery_required;
	}

	public void setSurgery_required(String surgery_required) {
		this.surgery_required = surgery_required;
	}

	public Date getSurgical_date() {
		return surgical_date;
	}

	public void setSurgical_date(Date surgical_date) {
		this.surgical_date = surgical_date;
	}

	public String getAnesthetic_name() {
		return anesthetic_name;
	}

	public void setAnesthetic_name(String anesthetic_name) {
		this.anesthetic_name = anesthetic_name;
	}

	public String getNurse_name() {
		return nurse_name;
	}

	public void setNurse_name(String nurse_name) {
		this.nurse_name = nurse_name;
	}

	public PatientDiagnosis(int d_id, com.ltts.shadow.model.Patients patients, String blood_test_results, String bp,
			String surgery_required, Date surgical_date, String anesthetic_name, String nurse_name) {
		super();
		this.d_id = d_id;
		Patients = patients;
		this.blood_test_results = blood_test_results;
		this.bp = bp;
		this.surgery_required = surgery_required;
		this.surgical_date = surgical_date;
		this.anesthetic_name = anesthetic_name;
		this.nurse_name = nurse_name;
	}

	public PatientDiagnosis() {
		super();
	}
	
	
}
