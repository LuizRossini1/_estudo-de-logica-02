/*Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double aplicarDesconto() {
        double porcentagemDesconto = 10;
        double desconto = (preco * porcentagemDesconto) / 100;
        double precoFinal = preco - desconto;
        return precoFinal;
    }

    public static void main(String[] args) {
        Produto produto01 = new Produto();

        produto01.aplicarDesconto();
        produto01.setNome("Headset");
        produto01.setPreco(100);

        System.out.println("Produto: " +produto01.getNome());
        System.out.println("Preço do produto: " +produto01.getPreco());
        System.out.println("O desconto do produto é de: " +produto01.aplicarDesconto()+ "%");
    }
}