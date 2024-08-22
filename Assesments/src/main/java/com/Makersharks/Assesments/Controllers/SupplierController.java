package com.Makersharks.Assesments.Controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Makersharks.Assesments.DTO.GlobalFetchDTO;
import com.Makersharks.Assesments.DTO.SupplierFilterDTO;
import com.Makersharks.Assesments.DTO.SupplierOutputDTO;
import com.Makersharks.Assesments.Model.Supplier;
import com.Makersharks.Assesments.Service.SupplierService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }


    @PostMapping("/query")
    @Operation(summary = "Search suppliers based on filter criteria", description = "Returns a paginated list of suppliers matching the given criteria(location,nature of busniess,manufacturing.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Suppliers retrieved successfully")
    })
    public ResponseEntity<GlobalFetchDTO<SupplierOutputDTO>> searchSuppliers(@RequestBody SupplierFilterDTO filterDTO) {
        GlobalFetchDTO<SupplierOutputDTO>  suppliers = supplierService.findSuppliers(filterDTO);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}
