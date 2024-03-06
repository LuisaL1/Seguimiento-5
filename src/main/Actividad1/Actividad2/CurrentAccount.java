package Actividad2;

public class CurrentAccount {
    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
