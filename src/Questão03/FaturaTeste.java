
import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura f1 = new Fatura(null,null,0,0.0);
        Scanner sc = new Scanner(System.in);


        System.out.println("+----- Suprimentos de informática -----+");
        System.out.println("Itens disponíveis: ");

        int itemEscolhido;
        do {
            System.out.println("1- Teclado\n2- Mouse\n3- Computador\n4- sair.");
            System.out.println("Escolha uma das opções a cima: ");
            itemEscolhido = sc.nextInt();
        }while (itemEscolhido != 1 && itemEscolhido != 2 && itemEscolhido != 3 && itemEscolhido != 4);
        switch (itemEscolhido) {
            case 1:
                // obs: teremos um getter e setter para cada variável de instância, logo não conseguimos fazer desta forma " setDescricao("Teclado");"
                f1.setDescricao("Teclado");
                break;
            case 2:
                f1.setDescricao("Mouse");
                break;
            case 3:
                f1.setDescricao("Computador");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opção invalida");
        }


        System.out.println("Forneça um preço para o "+f1.getDescricao());
        f1.setPrecoPorItem(sc.nextDouble());
        System.out.println("Informe a quantidade de "+ f1.getDescricao()+" que será comprada");
        f1.setQtdCompradaDeUmItem(sc.nextInt());
        System.out.println("Informe o número da fatura: ");
        sc.nextLine(); // limpa o buffer
        f1.setNumero(sc.nextLine());

        System.out.println("+----- Dados relacionados a fatura: -----+\nNúmero: "
        +f1.getNumero()+"\nDescrição: "+f1.getDescricao()+"\nPreço unitário: R$ "
                +f1.getPrecoPorItem()+"\nQuantidade comprada: "+f1.getQtdCompradaDeUmItem()+" unidades.");
        System.out.println("Valor da Fatura= "+ f1.getPrecoPorItem()+" * "+ f1.getQtdCompradaDeUmItem()+" = R$ "+f1.getTotalFatura());

    }
}
