package com.sanid.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "ssn_enroll")
public class SSNEnrollEntity {

	@Id
	@Column(name = "ssnid")
	@GenericGenerator(name="ssn_id_gen", strategy = "com.sanid.generators.SsnIdGenerator")	
	@GeneratedValue(generator = "ssn_id_gen")
	
	private Long ssnId;
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;
	@Column(name = "dob")
	private String dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "state_name")
	private String state_name;
	/*@Column(name = "photo")
	private Blob photo;*/

}
