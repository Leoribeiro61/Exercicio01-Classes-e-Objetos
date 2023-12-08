
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cadastro = new Scanner(System.in);
        boolean outroCadastro = true;

        while (outroCadastro) {
            System.out.println("Deseja realizar um cadastro de Animal, Pessoa ou Veículo?(A/P/V)");
            char cadastroEscolhido = cadastro.next().charAt(0); // pega apenas o primeiro caracter

            switch (cadastroEscolhido) {
                case 'A', 'a':
                    // 1ª forma - usando o scanner - mais simples, com poucos métodos na classe
                    System.out.println("+-------------------------------+\n" +
                            "|       Cadastro de Pet         |\n" +
                            "+-------------------------------+");

                    Pet pet1 = new Pet();
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Informe a espécie do pet: ");
                    pet1.setEspecie(sc.nextLine());
                    System.out.println("Informe a raça do " + pet1.getEspecie());
                    pet1.setRaca(sc.nextLine());
                    System.out.println("Informe a idade(em anos): ");
                    pet1.setIdade(sc.nextInt());

                    System.out.println("+-------------------------------+\n" +
                            "|      Pet cadastrado com       |\n" +
                            "|      os seguintes dados:      |\n" +
                            "+-------------------------------+");
                    System.out.println("Espécie: " + pet1.getEspecie() +
                            "\nRaça: " + pet1.getRaca() +
                            "\nIdade: " + pet1.getIdade());
                    System.out.println("+============\n");

                    break;

                case 'P', 'p':
                    // 2ª forma - usando JOptionPane
                    System.out.println("+-------------------------------+\n" +
                            "|       Cadastro de Pessoas     |\n" +
                            "+-------------------------------+");

                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa: "));
                    pessoa.setCpf(JOptionPane.showInputDialog(pessoa.getNome() + ", Informe o cpf: ")); // atribui
                    //                int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
                    pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
                    pessoa.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));

                    JOptionPane.showMessageDialog(null, "Cadastro bem sucedido!\nNome: "
                            + pessoa.getNome() + "\nCpf: " + pessoa.getCpf() + "\nIdade: " + pessoa.getIdade() + "\nTelefone: " + pessoa.getTelefone());


                    break;
                case 'V', 'v':
                    // 3ª forma - com maior uso de métodos dentro da classe Veiculo
                    Veiculo v1 = new Veiculo();

                    v1.insertDados();

                    v1.imprimirDados();

                    break;
                default:
                    System.out.println("Escolha uma opção valida!");
                    break;
            }
            System.out.println("Gostaria de fazer um novo cadastro?(S/N)");
            char op = cadastro.next().charAt(0);
            if (op == 's' || op == 'S') {
                outroCadastro = true;
            } else {
                outroCadastro = false;
            }
        }


    }

}