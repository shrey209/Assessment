package com.Makersharks.Assesments.Repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.Makersharks.Assesments.Model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>,JpaSpecificationExecutor<Supplier> {

	
	  Page<Supplier> findAll(Specification<Supplier> specification ,Pageable pageable);
}
