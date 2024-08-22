package com.Makersharks.Assesments.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.Makersharks.Assesments.DTO.GlobalFetchDTO;
import com.Makersharks.Assesments.DTO.SupplierFilterDTO;
import com.Makersharks.Assesments.DTO.SupplierOutputDTO;
import com.Makersharks.Assesments.Exeptions.NoDataFoundException;
import com.Makersharks.Assesments.Model.Supplier;
import com.Makersharks.Assesments.Repository.SupplierRepository;

import jakarta.persistence.criteria.Predicate;


@Service
public class SupplierService {

	private final SupplierRepository supplierRepository;

	public SupplierService(SupplierRepository supplierRepository) {
		this.supplierRepository = supplierRepository;
	}

	public GlobalFetchDTO<SupplierOutputDTO> findSuppliers(SupplierFilterDTO filterDTO) {
		Pageable pageable = PageRequest.of(filterDTO.getPage(), filterDTO.getSize());
		Page<Supplier> result = supplierRepository.findAll((Specification<Supplier>) (root, query, cb) -> {
			List<Predicate> predicate = new ArrayList<>();
			if (Objects.nonNull(filterDTO.getLocation()) && !filterDTO.getLocation().isEmpty()) {
				predicate.add(cb.like(cb.lower(root.get("location")), filterDTO.getLocation().toLowerCase()));
			}
			if (Objects.nonNull(filterDTO.getManufacturingProcess())
					&& !filterDTO.getManufacturingProcess().isEmpty()) {
				predicate.add(cb.like(cb.lower(root.get("manufacturingProcess")),
						filterDTO.getManufacturingProcess().toLowerCase()));
			}
			if (Objects.nonNull(filterDTO.getNatureOfBusiness()) && !filterDTO.getNatureOfBusiness().isEmpty()) {
				predicate.add(
						cb.like(cb.lower(root.get("natureOfBusiness")), filterDTO.getNatureOfBusiness().toLowerCase()));
			}

			return cb.and(predicate.toArray(new Predicate[0]));
		}, pageable);

		if (!result.hasContent()) {
			throw new NoDataFoundException();
		}
		GlobalFetchDTO<SupplierOutputDTO> supplierDto = new GlobalFetchDTO<>();
		supplierDto.content =  result.getContent().stream().map(obj -> {
			new SupplierOutputDTO();
			return SupplierOutputDTO.builder().location(obj.getLocation()).supplierId(obj.getSupplierId())
					.companyName(obj.getCompanyName()).manufacturingProcess(obj.getManufacturingProcess())
					.natureOfBusiness(obj.getNatureOfBusiness()).website(obj.getWebsite()).build();
		}).toList();

		 supplierDto.totalNumberOfRecordsInteger=result.getNumberOfElements();
		return supplierDto;
	}

}
