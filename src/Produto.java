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

    public double aplicarDesconto(double porcentagemDesconto) {
        double desconto = (preco * porcentagemDesconto) / 100;
        this.preco -= desconto;
        return desconto;
    }

    public static void main(String[] args) {
        Produto produto01 = new Produto();

        produto01.setNome("Headset");
        produto01.setPreco(100);

        System.out.println("Produto: " +produto01.getNome());
        System.out.println("Preço do produto: " +produto01.getPreco());
        double desconto = produto01.aplicarDesconto(20);
        System.out.println("O desconto do produto é de: " +desconto+ "%");
        System.out.println("O preço do produto com desconto é de: " +produto01.getPreco());
    }
}