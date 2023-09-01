package armazem;
                                     //Alt + Incert = CONSTRUTOR
public class Estoque {
    private int id;
    private String produto;
    private int estoque;
    private double preco;

                                     //variaveis
    public Estoque(int id, String produto, int estoque, double preco) {   //Metedos
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;         //THIS Modificador que faz referencia aos atributos
        this.preco = preco;

    }
    public void Acrescimo(int qtde){
        estoque = estoque + qtde;
    }

    public void Baixa (int qtde){
        if (qtde <= estoque)
        estoque = estoque - qtde;
    }

    public double TotalEstoque(){
        return estoque * preco;
    }
    public String ConsultaEstoque(){
        return "produto: " +produto+ "\nEstoque: " +estoque+ "\nPreço: " +preco;
    }
}
