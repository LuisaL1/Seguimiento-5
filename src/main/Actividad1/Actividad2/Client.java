package Actividad2;

public class Client {
    private CurrentAccount currentAccount;
    private SavingsAccounts savingsAccounts;
    private CertificateDeposit certificateDeposit;

    public Client() {
        currentAccount = new CurrentAccount();
        savingsAccounts = new SavingsAccounts();
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public SavingsAccounts getSavingsAccounts() {
        return savingsAccounts;
    }

    public CertificateDeposit getCertificateDeposit() {
        return certificateDeposit;
    }

    public void abrirCDT(double monto, double interes) {
        certificateDeposit = new CertificateDeposit(monto, interes);
    }

    public void cerrarCDT() {
        double monto = certificateDeposit.cerrar();
        currentAccount.depositar(monto);
        certificateDeposit = null;
    }

    public double getSaldoTotal() {
        double total = currentAccount.getSaldo() + savingsAccounts.getSaldo();
        if (certificateDeposit != null) {
            total += certificateDeposit.getSaldo();
        }
        return total;
    }
}

