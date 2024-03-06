package Actividad2;

public class SavingsAccounts {
    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public void aplicarInteres() {
        saldo += saldo * 0.006;
    }

    public double getSaldo() {
        return saldo;
    }
}
