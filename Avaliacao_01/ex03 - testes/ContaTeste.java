package teste;

import ex03.Conta;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {

    @Test
    public void testeCredita(){
        double resultadoCredita;

        Conta conta = new Conta(1, 1000);
        conta.creditaSaldo(500);
        resultadoCredita = conta.getSaldo();
        assertEquals(1500, resultadoCredita, 0);

        Conta conta02 = new Conta(2, -1000);
        conta02.creditaSaldo(500);
        resultadoCredita = conta02.getSaldo();
        assertEquals(-500, resultadoCredita, 0);

        Conta conta03 = new Conta(3, -1000);
        conta03.creditaSaldo(2000);
        resultadoCredita = conta03.getSaldo();
        assertEquals(1000, resultadoCredita, 0);
    }

    @Test
    public void testeDebita(){
        double resultadoDebita;

        Conta conta = new Conta(1, 1000);
        conta.debitaSaldo(500);
        resultadoDebita = conta.getSaldo();
        assertEquals(500, resultadoDebita, 0);

        Conta conta02 = new Conta(2, 1000);
        conta02.debitaSaldo(1500);
        resultadoDebita = conta02.getSaldo();
        assertEquals(-500, resultadoDebita, 0);

        Conta conta03 = new Conta(3, -1000);
        conta03.debitaSaldo(500);
        resultadoDebita = conta03.getSaldo();
        assertEquals(-1500, resultadoDebita, 0);
    }

    @Test
    public void testePossuiSaldo(){
        boolean resultadoPossui;

        Conta conta = new Conta(1, 1000);
        resultadoPossui = conta.possuiSaldo();
        assertTrue(resultadoPossui);

        Conta conta02 = new Conta(2, -1000);
        resultadoPossui = conta02.possuiSaldo();
        assertFalse(resultadoPossui);

        Conta conta03 = new Conta(3, 0);
        resultadoPossui = conta03.possuiSaldo();
        assertFalse(resultadoPossui);


    }
}
