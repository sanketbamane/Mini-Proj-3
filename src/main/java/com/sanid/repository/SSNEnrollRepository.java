package com.sanid.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanid.entity.SSNVerifyEntity;

public interface SSNEnrollRepository extends JpaRepository<SSNVerifyEntity, Serializable> {

	
}
