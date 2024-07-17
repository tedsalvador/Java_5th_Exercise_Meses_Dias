package com.example.meses;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.time.Year;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import com.github.stefanbirkner.systemlambda.SystemLambda;

public class MainTest {

    @Test
    public void testMain() throws Exception {
        // Simular la entrada del usuario
        String input = "2\n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Ejecutar el main con la entrada simulada
        SystemLambda.withTextFromSystemIn(input).execute(() -> {
            System.setOut(new PrintStream(out));
            Main.main(new String[]{});
        });

        // Verificar la salida de la consola
        String consoleOutput = out.toString();
        assertThat(consoleOutput, containsString("Nombre del mes: Febrero"));
        assertThat(consoleOutput, containsString("Número de días: " + (Year.now().isLeap() ? 29 : 28)));
    }
}
