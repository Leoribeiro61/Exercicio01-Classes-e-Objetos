
import java.util.Scanner;

public class Veiculo {
    private String tipo;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String tipo, String modelo, int ano, double preco) {
        this();
        this.tipo = tipo;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }


    public void insertDados() {
        Veiculo v1 = new Veiculo();
        Scanner sc = new Scanner(System.in);

        System.out.println("+-------------------------------+\n" +
                "|       Cadastro de Veiculos    |\n" +
                "+-------------------------------+");


        System.out.println("Selecione o Tipo de veículo:");
        int escolhaDoVeiculo;
        do {
            System.out.println("1- Carro\n2- Moto\n3- Caminhão\n4- Ônibus");
            escolhaDoVeiculo = sc.nextInt();

            if (escolhaDoVeiculo == 1) {
                setTipo("Carro");
            } else if (escolhaDoVeiculo == 2) {
                setTipo("Moto");
            } else if (escolhaDoVeiculo == 3) {
                setTipo("Caminhão");
            } else if (escolhaDoVeiculo == 4) {
                setTipo("Ônibus");
            } else {
                System.out.println("Opção inválida!\nSelecione uma destas: ");
            }


        } while (escolhaDoVeiculo != 1 && escolhaDoVeiculo != 2 && escolhaDoVeiculo != 3 && escolhaDoVeiculo != 4);

        System.out.println("Informe o modelo: ");
        sc.nextLine(); // limpa o buffer do teclado
        setModelo(sc.nextLine());
        System.out.println("Informe o ano (apenas números): ");
        setAno(sc.nextInt());
        System.out.println("Informe o preço: ");
        setPreco(sc.nextDouble());
    }

    public void imprimirDados() {
        System.out.println("+-------------------------------+\n" +
                "|    Veículo cadastrado com    |\n" +
                "|    os seguintes dados:       |\n" +
                "+-------------------------------+");
        System.out.println("Tipo: " +getTipo() + ", Modelo: " +getModelo() + "\nAno: " +getAno() + "\nPreço: " +preco);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }
}
