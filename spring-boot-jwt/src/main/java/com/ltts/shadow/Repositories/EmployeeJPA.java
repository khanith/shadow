package com.ltts.shadow.Repositories;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ltts.shadow.model.Employe;
import com.ltts.shadow.model.Patients;


public interface EmployeeJPA extends JpaRepository<Employe, Integer>
{
	
//	 
//	@Query("select u.Emp_Name from Employee u where u.Emp_id = :doc_id") 
//	 public String getname();
//	 
//	@Query(value="SELECT emp_name as doctor_assigned, patients.patient_id, patients.patient_name, patients.patient_symptoms, patients.v_date, patients.last_vdate FROM employee INNER JOIN patients ON employee.doc_id = patients.doc_id",nativeQuery=true)
//	public List<Employee> findByid();	
	
}
