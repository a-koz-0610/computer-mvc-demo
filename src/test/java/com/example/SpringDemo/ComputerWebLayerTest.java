package com.example.SpringDemo;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ComputerController.class)
public class ComputerWebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComputerRepository computerRepo;

    @Mock
    private Computer comp1;
    private String comp1Name = "mac";

    @Mock
    private Computer comp2;

    @Test
    public void shouldReturnOkWhenFindingAllComputers() throws Exception {
        when(computerRepo.findAll()).thenReturn(Arrays.asList(comp1, comp2));
        mockMvc.perform(get("/computers")).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnOkWhenFindingComp1() throws Exception {
        when(computerRepo.findComputerByName(comp1Name)).thenReturn(comp1);
        mockMvc.perform(get("/computers/mac")).andExpect(status().isOk());
    }

    @Test
    public void shouldAddComp1ToModel() throws Exception {
        when(computerRepo.findComputerByName(comp1Name)).thenReturn(comp1);
        mockMvc.perform(get("/computers/mac")).andExpect(model().attribute("singleComputerModel",is(comp1)));
    }

}
