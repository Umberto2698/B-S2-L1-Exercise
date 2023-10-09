package terzoEsercizio;

import exceptions.BancaException;

public class ContoCorrente {
    final int maxMovimenti = 50;
    String titolare;
    int nMovimenti;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
            if (saldo < 0) {
                nMovimenti++;
                throw new BancaException("il conto è in rosso.");
            }
        } else
            saldo = saldo - x - 0.50;
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}