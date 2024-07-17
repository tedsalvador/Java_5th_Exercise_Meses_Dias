package com.example.meses;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.time.Year;
import org.junit.jupiter.api.Test;

public class MesServiceTest {
    private MesService mesService = new MesService();

    @Test
    public void testGetMesInfo() {
        Mes enero = mesService.getMesInfo(1);
        assertThat(enero.getNombre(), equalTo("Enero"));
        assertThat(enero.getDias(), equalTo(31));

        Mes febrero = mesService.getMesInfo(2);
        int expectedDiasFebrero = Year.now().isLeap() ? 29 : 28;
        assertThat(febrero.getNombre(), equalTo("Febrero"));
        assertThat(febrero.getDias(), equalTo(expectedDiasFebrero));
    }
}
