package br.com.exemplo.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes da Calculadora")
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Somar dois números positivos")
    void somar_numerosPositivos_retornaSomaCorreta() {
        // Arrange
        int a = 5;
        int b = 3;
        int esperado = 8;

        // Act
        int resultado = calculadora.somar(a, b);

        // Assert
        assertEquals(esperado, resultado);
    }
}
