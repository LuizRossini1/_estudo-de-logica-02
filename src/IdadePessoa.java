/*Crie uma classe idadePessoa com os atributos privados nome e idade.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return true;
        } else {
            System.out.println("Menor de idade");
            return false;
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Luiz Rossini");
        pessoa1.setIdade(20);

        System.out.println("Nome: " +pessoa1.getNome());
        System.out.println("Idade: " +pessoa1.getIdade());
        System.out.println(pessoa1.verificarIdade());
    }
}