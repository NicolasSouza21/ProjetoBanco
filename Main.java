package Banco;

import javax.swing.JOptionPane;

public class Main extends Conta {
    public static void main(String[] args) {
        ContaPF clientePF[] = new ContaPF[10];
        ContaPJ clientepPj[] = new ContaPJ[10];
        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;

        while (aberta) {
            int action = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação"
                    + "\n 1-Criar Conta"
                    + "\n 2-Acessar Conta"
                    + "\n 3-Sair"));
                    

            if (action == 1) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação"
                    + "\n 1-Criar Conta PF"
                    + "\n 2-Criar Conta PJ"
                    
                    
                    
                    ));

                if(acao == 1){
                clientePF[contPF] = new ContaPF();
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
                clientePF[contPF].setnCPF(JOptionPane.showInputDialog("Informe o número do CPF do cliente"));
                clientePF[contPF].setSaldo(0);
                clientePF[contPF].setNconta(1000 + contPF + 1);
                contPF++;
                int nConta = contPF+999+1;
                JOptionPane.showMessageDialog(null,"Seu número é " +nConta );
                    }
                    else if (acao == 2){
                clientepPj[contPJ] = new ContaPJ();
                clientepPj[contPJ].setNome(JOptionPane.showInputDialog("Digite o nome da Empresa"));
                clientepPj[contPJ].setnCNPJ(JOptionPane.showInputDialog("Informe o número do CNPJ da empresa"));
                clientepPj[contPJ].setSaldo(0);
                clientepPj[contPJ].setNconta(2000 + contPJ + 1);
                int nConta = contPJ + 1999;
                
                
                JOptionPane.showMessageDialog(null,"Seu número é " +nConta );

                 

                    }else if(action == 3){
                        JOptionPane.showMessageDialog(null,"Você escolheu sair");
                        aberta = false;

                    }
                    
                    else{
                        JOptionPane.showMessageDialog(null,"Insira um valor válido " );
                    }



            } else if (action == 2) {
                int nFinderPF = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
                int i = 0;
                int contaAtual = 0;
                for (i = 0; i < clientePF.length; i++) {
                    if (nFinderPF == clientePF[i].getNconta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Cliente encontrado");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"Cliente não encontrado");

                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int segundaEtapa = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a ação desejada"
                                    + "\n 1-Verificar saldo"
                                    + "\n 2-Fazer saque"
                                    + "\n 3-Fazer depósito"
                                    + "\n 4-Fazer empréstimo"
                                    + "\n 5-Sair da conta"));
                    if (segundaEtapa == 1) {
                        JOptionPane.showMessageDialog(null, clientePF[contaAtual].getSaldo());
                    } else if (segundaEtapa == 2) {

                        double vSaque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do saque"));

                        if (saldo >= vSaque) {
                            saldo -= vSaque;
                            JOptionPane.showInputDialog("Foram sacados: R$" + vSaque);
                            JOptionPane.showInputDialog("Seu saldo atual é de: R$" + saldo);
                        } else {
                            JOptionPane.showInputDialog("Seu saldo é insuficiente, faça um depósito");
                        }
                    } else if (segundaEtapa == 3) {
                        double vDeposito = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do depósito"));

                        saldo += vDeposito;

                        JOptionPane.showInputDialog("Seu depósito foi concluído");
                        JOptionPane.showInputDialog("Seu saldo atual é de: R$ " + saldo);

                    } else if (segundaEtapa == 4) {
                        
                        double vEmprestimo = Integer.parseInt((JOptionPane.showInputDialog("Insira o valor desejado para o empréstimo")));
                            if(vEmprestimo > 0 && vEmprestimo < 20000){
                                JOptionPane.showInputDialog("Seu empréstimo foi realizado com sucesso");
                            } else{
                                JOptionPane.showInputDialog("Insira um valor válido para o empréstimo");
                            }
                    }

                    else if (segundaEtapa == 5) {
                        acessar = false;
                    }
                }

            }
             else if (action == 4) {
                int nFinderPj = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
                int i = 0;
                int contaAtual = 0;
                for (i = 0; i < clientepPj.length; i++) {
                    if (nFinderPj == clientepPj[i].getNconta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Cliente encontrado");
                        break;

                    }

                }
                boolean acessar = true;
                while (acessar) {
                    int segundaEtapa = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a ação desejada"
                                    + "\n 1-Verificar saldo"
                                    + "\n 2-Fazer saque"
                                    + "\n 3-Fazer depósito"
                                    + "\n 4-Fazer Empréstimo"
                                    + "\n 5-Sair da conta"));
                
                           if (segundaEtapa == 1) {
                        JOptionPane.showMessageDialog(null, clientePF[contaAtual].getSaldo());
                    } else if (segundaEtapa == 2) {

                        double vSaque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do saque"));

                        if (saldo >= vSaque) {
                            saldo -= vSaque;
                            JOptionPane.showMessageDialog("Foram sacados: R$" + vSaque);
                            JOptionPane.showMessageDialog("Seu saldo atual é de: R$" + saldo);
                        } else {
                            JOptionPane.showMessageDialog("Seu saldo é insuficiente, faça um depósito");
                        }
                    } else if (segundaEtapa == 3) {
                        double vDeposito = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do depósito"));

                        saldo += vDeposito;

                        JOptionPane.showMessageDialog("Seu depósito foi concluído");
                        JOptionPane.showMessageDialog("Seu saldo atual é de: R$ " + saldo);

                    } else if (segundaEtapa == 4) {
                        
                        double vEmprestimo = Integer.parseInt((JOptionPane.showInputDialog("Insira o valor desejado para o empréstimo")));
                            if(vEmprestimo > 0 && vEmprestimo < 50000){
                                JOptionPane.showMessageDialog(null,"Seu empréstimo foi realizado com sucesso");
                            } else{
                                JOptionPane.showInputDialog("Insira um valor válido para o empréstimo");
                            }
                    }

                    else if (segundaEtapa == 5) {
                        aberta = false;
                    }
                }
            }else if(action == 3){
                
                aberta = false;
            }

            }

        }

}


