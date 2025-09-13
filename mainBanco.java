package finanzas;

public class mainBanco {
    public static void main(String[] args) {
        solucionBanco cuenta = new solucionBanco(1000);

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500);     
        cuenta.retirar(200);      
        cuenta.retirar(2000);      
        System.out.println("Saldo final: $" + cuenta.getSaldo());

        
    }
}

