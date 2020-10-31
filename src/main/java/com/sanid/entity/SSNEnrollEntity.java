package com.sanid.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ssn_enroll")
public class SSNEnrollEntity {

	@Id
	@Column(name = "ssnid")
	@GeneratedValue
	private Long ssnid;
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;
	@Column(name = "dob")
	private String dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "stateName")
	private String stateName;
	@Column(name = "photo")
	private Blob photo;

}
