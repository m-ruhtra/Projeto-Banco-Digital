package newbank;

public class ContaCorrente extends Conta{
    //Atributos:
    private final String tipoConta = "CC";
    private static int SEQUENCIA = 100;
    private Cliente titular;
    
    //Método Contrutor:
    public ContaCorrente(Cliente nome) {
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
    Sobrepostos para execução de tarefas especificas da classe Conta Corrente.
    */
    @Override
    protected void DadosBancarios() {
        System.out.println("--- Dados Bancários ---");
        System.out.println("- Titular: " + this.getTitular().getNome());
        System.out.println("- Tipo de Conta: " + this.getTipoConta());
        System.out.println("- Número da conta: " + this.numeroConta);
        System.out.println("- Agência: " + super.getAgencia());
        //System.out.printf("- Saldo: R$ %.2f\n", super.getSaldo());
        System.out.println("-----------------------");
        System.out.println("\n\n");
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
