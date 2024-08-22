package com.Makersharks.Assesments;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.Makersharks.Assesments.Controllers.SupplierController;
import com.Makersharks.Assesments.DTO.GlobalFetchDTO;
import com.Makersharks.Assesments.DTO.SupplierFilterDTO;
import com.Makersharks.Assesments.DTO.SupplierOutputDTO;
import com.Makersharks.Assesments.Exeptions.NoDataFoundException;
import com.Makersharks.Assesments.Model.Supplier;
import com.Makersharks.Assesments.Service.SupplierService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collections;

@WebMvcTest(SupplierController.class)
public class AssesmentsApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SupplierService supplierService;

    @Autowired
    private ObjectMapper objectMapper;

  

    
}
