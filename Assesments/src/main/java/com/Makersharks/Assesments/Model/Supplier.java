package com.Makersharks.Assesments.Model;


import org.apache.el.parser.AstFalse;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "suppliers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SUPPLIER_ID")
    private Long supplierId;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "LOCATION",nullable = false)
    private String location;

    @Column(name = "NATURE_OF_BUSINESS",nullable = false)
    private String natureOfBusiness;

    @Column(name = "MANUFACTURING_PROCESSES",nullable = false)
    private String manufacturingProcess;

}
