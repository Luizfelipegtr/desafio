import java.util.Scanner;

public class Desafio {
    static Scanner input = new Scanner(System.in);
    static String[] nomes = new String[20];
    static String[] numeros = new String[20];
    static int posicao = 0;
    static String continuar = "";


        // static pra imprimir o menu

    public static void menu() {

            System.out.println("Digite: ");

            System.out.println("1 - Cadastrar Contato; ");
            System.out.println("2 - Excluir Contato; ");
            System.out.println("3 - Listar todos os Contatos; ");
            System.out.println("4 - Limpar a lista de contatos; ");
            System.out.println("99 - Sair. ");

    }

        // static principal

    public static void main(String[] args) {
    int digito;

        do {
            menu();

             digito = input.nextInt();

            switch (digito) {

                case 1:

                    // adicionar um novo cadastro

                    do {

                        input.nextLine();
                        System.out.println("insira nome: ");
                        String nome = input.nextLine();

                        System.out.println("Insira numero: ");
                        String numero = input.nextLine();

                        System.out.println("denovo?");
                        continuar = input.nextLine();
                        posicao++;

                        nomes[posicao] = nome;
                        numeros[posicao] = numero;

                    } while (continuar.equalsIgnoreCase("sim"));

                    break;

                case 2:

                    // excluir um cadastro específico

                    do {
                        input.nextLine();
                        System.out.println("Insira o nome do cadastro: ");

                        String nome = input.nextLine();

                        for (int i = 0; i < nomes.length; i++) {
                            if (nome.equals(nomes[i])) {
                                nomes[i] = null;
                                numeros[i] = null;
                            }
                        }
                        System.out.println("seu contato foi apagado com exito! ");
                        System.out.println("denovo?");
                        continuar = input.nextLine();

                    } while (continuar.equalsIgnoreCase("sim"));

                    break;

                case 3:

                    // listar (imprimir) os contatos

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null){
                            System.out.println("Nome:" + nomes[i] + " " +  "|" + " Número: " + numeros[i]);
                        }
                    }

                    break;

                case 4:

                    // excluir todos os contatos

                    for (int i = 0; i < nomes.length; i++) {
                        nomes[i] = null;
                        numeros[i] = null;
                    }
                    System.out.println("seus contatos forma apagados! ");

                    break;

                case 99:

                    // fechar o programa

                    System.out.println("finalizando... ");
                    break;

                default:
                    System.out.println("opção invalida tente novamente! ");
                break;
            }
        }while (digito != 99);

        System.out.println("Muito obrigado por usar nosso programa :) ");

    }
}
