/*Desenvolva uma classe Livro com os atributos privados titulo e autor.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.*/

public class Livro {

    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes() {
        //System.out.println("O autor é " +getAutor()+ " e o título é: " +getTitulo());
        System.out.println("O título é: " +getTitulo()+ " e o autor é: " +getAutor());
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setAutor("Machado de Assis");
        livro1.setTitulo("Memórias Póstumas de Brás Cubas");

        livro2.setAutor("Charlie Donlea");
        livro2.setTitulo("A garota do Lago");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}