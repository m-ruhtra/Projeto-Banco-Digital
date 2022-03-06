package newbank;

public class ContaPoupanca extends Conta{
    //Atributos:
    private final String tipoConta = "CP";
    private static int SEQUENCIA = 200;
    private Cliente titular;

    //Método Contrutor:    
    public ContaPoupanca(Cliente nome) {
        this.titular = nome;
        super.numeroConta = SEQUENCIA++;        
        super.saldo = 0;
    }
    
    // Métoods Especiais GET:
    public final String getTipoConta(){
        return tipoConta;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    
    /*Métodos abstratos herdados da classe Conta
    Sobrepostos para execução de tarefas especificas da classe Conta Poupança.
    */
    @Override
    public final int getNumeroConta(){
        return numeroConta;
    }
    
    @Override
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    protected void DadosBancarios() {
        System.out.println("--- Dados Bancários ---");
        System.out.println("- Titular: " + this.getTitular().getNome());
        System.out.println("- Tipo de Conta: " + this.getTipoConta());
        System.out.println("- Número da conta: " + this.getNumeroConta());
        System.out.println("- Agência: " + super.getAgencia());
        System.out.println("-----------------------");
        System.out.println(" ");
    }

    @Override
    protected void Extrato() {
        System.out.println("------- EXTRATO -------");
        System.out.println("- Tipo de Conta: " + this.getTipoConta());
        System.out.println("- Número da conta: " + this.numeroConta);
        System.out.println("- Agência: " + super.getAgencia());
        System.out.printf("- Saldo: R$ %.2f\n", super.getSaldo());
        System.out.println("-----------------------");
        System.out.println("\n\n");
    }
}
