package armazem;
import java.sql.SQLOutput;
import java.util.Scanner;
//EXEPLO QUE O USUARIO DECIDE O QUE VAI ENTRAR
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;
        System.out.println("id: ");
        id = ler.nextInt();
        System.out.println("Nome do Produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();
        System.out.println("Estoque Inicial: ");
        estoque = ler.nextInt();
        System.out.println("Preço: ");
        preco=ler.nextDouble();
        Estoque e1 = new Estoque(id, produto,estoque,preco);

        System.out.println("Informe a qtde para acrescentar: ");
        int qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println("Informe a qtde para baixar: ");
        qtde  = ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());



    }
}

                    //EXEPLOS  QUE A GENTE CRIA O METODOS //
       /*    Estoque e1 = new Estoque(1, "Arroz",10,25);
            Estoque e2 = new Estoque(2, "feijão", 10, 5.65);
            Estoque e3 = new Estoque(3, "açucar", 10, 16);
            e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());

        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        System.out.println(e3.TotalEstoque());*/


