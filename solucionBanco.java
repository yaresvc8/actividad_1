package finanzas;

public class solucionBanco {
    
    private double saldo; 

    public solucionBanco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0; 
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
        } else {
            System.out.println("El depósito debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}

