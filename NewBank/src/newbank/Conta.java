package newbank;

import java.util.Scanner;

public abstract class Conta extends Cliente{
    Scanner sc = new Scanner(System.in);
    //Atributos:
    private static int AGENCIA_UNICA = 01;
    
    protected int agencia = 01;
    protected int numeroConta;
   
    protected double saldo = 0;
    static int qtdContas = 100;
    
    protected String destinoTransferencia;
    
    //Métodos Especiais GET e SET:
    protected int getAgencia(){
        return agencia;
    }
          
    protected int getNumeroConta(){
        return numeroConta;
    }
    
    protected double getSaldo(){
        return saldo;
    }
    
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    protected String getDestinoTransferencia(){
        return destinoTransferencia;
    }
    
    private void setDestinoTransferencia(String destino){
        this.destinoTransferencia = destino;
    }
    
    //Métodos:
    public void Depositar(){
        System.out.println(" ");
        System.out.println("----------- DEPOSITO -----------");
        System.out.println("Informe o valor para depósito: ");
        System.out.print("R$ ");
        double pValor = sc.nextDouble();
        System.out.println("    - Realizando Depósito -");
        System.out.printf("- Saldo Anterior: R$ %.2f\n", this.getSaldo());
        
        
        this.setSaldo(this.getSaldo() + pValor);
        System.out.println("Depósito realizado com sucesso!");
        System.out.printf("- Saldo Atual: R$ %.2f\n", this.getSaldo());
        System.out.println("-------------------------------");
        System.out.println("\n\n");
    }
    
    protected void Sacar(){
        System.out.println("----------- SAQUE -----------");
        System.out.println("Informe o valor para saque: ");
        System.out.print("R$ ");
        double pValor = sc.nextDouble();
        if (pValor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - pValor);
            System.out.println("    - Realizando Saque -");
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("- Saldo Atual: R$ %.2f\n", this.getSaldo());
            System.out.println("----------------------------");
        } 
        else{
            System.out.println("- Saldo Insuficiente!");
        }
        System.out.println("\n\n");
    }
    
    protected void Transferir(){
        String destino;
        System.out.println("----------- TRANSFERENCIA -----------");
        sc.nextLine();
        System.out.println("Informe o titular da conta de destino:");
        destino = sc.nextLine();
        this.setDestinoTransferencia(destino);
       
        System.out.println("Informe o valor para transferência: ");
        System.out.print("R$ ");
        double pValor = sc.nextDouble();
        if (pValor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - pValor);
            System.out.println("");
            System.out.println("    - Realizando Transferência -");
            System.out.println("Transferência realizada com sucesso para:");
            System.out.println("Conta de: " + this.getDestinoTransferencia());
            System.out.println("Valor transferência: " + pValor);
            System.out.printf("- Saldo Atual: R$ %.2f\n", this.getSaldo());
            System.out.println("------------------------------------");
            System.out.println("\n\n");
        } 
        else{
            System.out.println("- Saldo Insuficiente!");
            System.out.println("\n\n");
        }
    }
    
    //Métodos Abstratos para sobreposição:
    protected abstract void DadosBancarios();
     
    protected abstract void Extrato();
}
