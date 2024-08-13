package contentt;

import java.util.Scanner;

public class InterfacePessoa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Conteudo conteudo = new Conteudo();

        int opcaoMenuPrincipal = 0;
        int opcaoMenuConteudo = 0;

        while (opcaoMenuPrincipal != 3) {
            System.out.println("Bem vindo !");
            System.out.println("O que deseja fazer ? ");
            System.out.println("1 - Fazer Login");
            System.out.println("2 - Listar os Conteúdos");
            System.out.println("3 - Sair do sistema");

            try {
                opcaoMenuPrincipal = scan.nextInt();
                scan.nextLine(); // Consumir o caractere de nova linha
            } catch (Exception e) {
                System.out.println("Opção inválida. Digite um número entre 1 e 3.");
                scan.nextLine(); // Limpar o buffer de entrada
                continue;
            }

            switch (opcaoMenuPrincipal) {
                case 1:
                    System.out.println("Digite seu usuário: ");
                    String usuario = scan.nextLine();
                    pessoa.setUsuario(usuario);

                    System.out.println("Digite sua senha: ");
                    String senha = scan.nextLine();
                    pessoa.setSenha(senha);

                    System.out.println("Usuário: " + pessoa.getUsuario());
                    System.out.println("Senha: " + pessoa.getSenha());

                    while (opcaoMenuConteudo != 5) {
                        System.out.println("1 - Criar conteúdo");
                        System.out.println("2 - Listar conteúdo");
                        System.out.println("3 - Editar conteúdo");
                        System.out.println("4 - Deletar conteúdo");
                        System.out.println("5 - Sair");

                        try {
                            opcaoMenuConteudo = scan.nextInt();
                            scan.nextLine(); // Consumir o caractere de nova linha
                        } catch (Exception e) {
                            System.out.println("Opção inválida. Digite um número entre 1 e 5.");
                            scan.nextLine(); // Limpar o buffer de entrada
                            continue;
                        }

                        switch (opcaoMenuConteudo) {
                            case 1:
                                System.out.println("Digite um novo conteúdo: ");
                                String novoConteudo = scan.nextLine();
                                conteudo.createContent(novoConteudo);
                                break;
                            case 2:
                                conteudo.listContent();
                                break;
                            case 3:
                                System.out.println("Digite o conteúdo que quer alterar e depois o novo conteúdo: ");
                                String conteudoAntigo = scan.nextLine();
                                String novoConteudoAlteracao = scan.nextLine();
                                conteudo.updateContent(conteudoAntigo, novoConteudoAlteracao);
                                break;
                            case 4:
                                System.out.println("Digite o conteúdo que quer deletar: ");
                                String conteudoDeletado = scan.nextLine();
                                conteudo.deleteContent(conteudoDeletado);
                                break;
                            case 5:
                                opcaoMenuConteudo = 5;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    }
                    opcaoMenuConteudo = 0; // Reiniciar a opção do menu de conteúdo
                    break;
                case 2:
                    conteudo.listContent();
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar nosso sistema, volte sempre !");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scan.close();
    }
}

class Pessoa {
    private String usuario;
    private String senha;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}


