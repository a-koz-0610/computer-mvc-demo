package com.example.SpringDemo;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ComputerController.class)
public class WebLayerTest {

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
        when(computerRepo.getAllComputers()).thenReturn(Arrays.asList(comp1, comp2));
        mockMvc.perform(get("/computers")).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnOkWhenFindingComp1() throws Exception {
        when(computerRepo.getOneComputerByName(comp1Name)).thenReturn(comp1);
        mockMvc.perform(get("/computers/mac")).andExpect(status().isOk());
    }

}
