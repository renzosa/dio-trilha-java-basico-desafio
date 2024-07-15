import java.util.Scanner;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import edu.renzosa.contaBanco.Conta;

public class ContaTerminal {

    private static Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    private static Conta contaAtual;
    private static String operador = "M";

    public static void main(String[] args) throws Exception {

        String agencia;
        Integer numero;
        String nomeCliente;
        Double saldo;
        Double saque;
        Double deposito;

        try {

            if(args.length > 4) {
                throw new Exception("Erro ao carregar os Dados da Conta!");
            } else if (args.length == 4) {
                System.out.println("Carregando conta...");
                contaAtual = new Conta(args[0], Integer.valueOf(args[1]), args[2], Double.valueOf(args[3]));
            } else {
                System.out.println("Informe os dados da Conta\r\n=================================");
                System.out.println("Agencia:");
                agencia = scan.nextLine();
                try {
                    System.out.println("Conta:");
                    numero = Integer.valueOf(scan.nextLine());
                } catch (Exception e) {
                    throw new Exception("Apenas números são aceitos!");
                }
                System.out.println("Primeiro Nome do cliente:");
                nomeCliente = scan.nextLine();
                try {
                    System.out.println("Saldo atual:");
                    saldo = Double.valueOf(scan.nextLine().replace(",","."));
                } catch (Exception e) {
                    throw new Exception("O saldo deve ser numérico!");
                }
                contaAtual = new Conta(agencia, numero, nomeCliente, saldo);
            }

            System.out.print("\r\nOlá ".concat(contaAtual.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, ")
                .concat("sua agência é " + contaAtual.getAgencia())
                .concat(", conta " + contaAtual.getNumero())
                .concat(" e seu saldo de R$ " + contaAtual.getSaldo())
                .concat(" já está disponível para saque."));
                
            while (!operador.equals("Q") && !operador.equals("q") ) {
                menu();
                System.out.print("Sua opção: ");
                operador = scan.nextLine();

                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,2}$");
                Matcher matcher = pattern.matcher(operador);

                if(!matcher.matches()) operador = "XX";

                switch (operador) {
                    case "0":
                    System.out.println("\r\n" + contaAtual.status());
                        break;
                    case "1":
                        try {
                            saque = 0.0;
                            System.out.print("\r\nInforme o valor do saque: R$");
                            saque = Double.valueOf(scan.nextLine().replace(",","."));
                        } catch (Exception e) {
                            throw new Exception("O saldo deve ser numérico!");
                        }
                        try {
                            contaAtual.sacar(saque);
                            System.out.println("\r\nSaque realizado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("\r\n# " + e.getMessage());
                        }
                        break;
                    case "2":
                        try {
                            deposito = 0.0;
                            System.out.print("\r\nInforme o valor do deposito: R$");
                            deposito = Double.valueOf(scan.nextLine().replace(",","."));
                        } catch (Exception e) {
                            throw new Exception("O deposito deve ser numérico!");
                        }
                        try {
                            contaAtual.depositar(deposito);
                            System.out.println("\r\nDeposito realizado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("\r\n# " + e.getMessage());
                        }
                        break;
                    case "Q":
                    case "q":
                        break;
                    default:
                        System.out.println("\r\n# Opção inválida!");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }

    public static void menu() {
        System.out.println("\r\n0 > Saldo");
        System.out.println("1 > Saque");
        System.out.println("2 > Deposito");
        System.out.println("Q > Sair");
    }
}
