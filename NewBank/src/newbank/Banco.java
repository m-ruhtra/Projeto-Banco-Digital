package newbank;

import java.util.Scanner;

/*Classe abstrata Banco para construção do método Iniciar(), onde será 
apresentado todas as funcionalidades da aplicação.

    - Criado para não sobrecarregar o main.
*/
public abstract class Banco extends Conta{
    public static void Iniciar(){
        Scanner sc = new Scanner(System.in);
        String banco = " NewBank Digital";
        System.out.println(banco);
        System.out.println("");
        System.out.println("-- MENU INICIAL --");
        System.out.println("1. Criar Conta");
        System.out.println("0. Sair");
        System.out.println("------------------");
        
        System.out.print("Opção: ");
        int opcao;
        opcao = sc.nextInt();
        sc.nextLine();
        System.out.println(" ");
        
        
        if (opcao == 1){
            System.out.println("Digite o nome do titular da conta:");
            String nome;
            nome = sc.nextLine();
            System.out.println(""); 
        
            Cliente c1 = new Cliente (nome);
        
            System.out.println("Qual conta gostaria de abrir?\n"
                         + "CC - Conta Corrente\n"
                         + "CP - Conta Poupança");
        
            System.out.print("Opção: ");
            String tipoConta = sc.nextLine();
            
            do {
                if(null == tipoConta){
                    System.out.println("Opção inválida!");
                }else{
                    if("CC".equals(tipoConta)){
                        Conta cc = new ContaCorrente(c1);
                        System.out.println("-----------------------------------");
                        System.out.println("Conta Corrente aberta com sucesso!");
                        System.out.println("\n\n");
                        int opcaoContaCC;
                        
                        do{
                            System.out.println("--- MENU CONTA ---");
                            System.out.println("1. Dados Bancários");
                            System.out.println("2. Depósito");
                            System.out.println("3. Saque");
                            System.out.println("4. Transferência");
                            System.out.println("5. Extrato");
                            System.out.println("0. Sair");
                            System.out.println("------------------");
                            
                            System.out.print("Opção: ");
                            
                            opcaoContaCC = sc.nextInt();
                            System.out.println("\n\n");
                            
                            if (opcaoContaCC >= 0 && opcaoContaCC <=5){
                                switch (opcaoContaCC) {
                                    case 1:
                                        cc.DadosBancarios();
                                        break;
                                    case 2:
                                        cc.Depositar();
                                        break;    
                                    case 3:
                                        cc.Sacar();
                                        break;
                                    case 4:
                                        cc.Transferir();
                                        break;
                                    case 5:
                                        cc.Extrato();
                                        break;
                                    default:
                                        System.exit(0);
                                }                
                                        
                            } else {
                                System.out.println("Opção inválida!");
                            }
        
                        } while (opcaoContaCC != 0);
                        
                    } else if ("CP".equals(tipoConta)){
                        Conta cp = new ContaPoupanca(c1);
                        System.out.println("-----------------------------------");
                        System.out.println("Conta Poupança aberta com sucesso!");
                        System.out.println("\n\n");
                        int opcaoContaCP;
                        
                        do{
                            System.out.println("--- MENU CONTA ---");
                            System.out.println("1. Dados Bancários");
                            System.out.println("2. Depósito");
                            System.out.println("3. Saque");
                            System.out.println("4. Transferência");
                            System.out.println("5. Extrato");
                            System.out.println("0. Sair");
                            System.out.println("------------------");
                            
                            System.out.print("Opção: ");
                            
                            opcaoContaCP = sc.nextInt();
                            System.out.println("\n\n");
                            
                            if (opcaoContaCP >= 0 && opcaoContaCP <=5){
                                switch (opcaoContaCP) {                
                                    case 1:
                                        cp.DadosBancarios();;
                                        break;
                                    case 2:
                                        cp.Depositar();
                                        break;
                                    case 3:
                                        cp.Sacar();
                                        break;
                                    case 4:
                                        cp.Transferir();
                                        break;
                                    case 5:
                                        cp.Extrato();
                                        break;
                                    default:
                                        System.exit(0);
                                }        
                            } else {
                                System.out.println("Opção inválida!");
                            } 
                        } while (opcaoContaCP != 0);
                    }
                }
            } while (tipoConta == "CC" || tipoConta == "CP");
        } else {
            System.out.println("Encerrando aplicação!");
            System.exit(0);
        }
    }    
}

        
    
    
  
    
    