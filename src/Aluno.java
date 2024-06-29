/*4 - Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.*/

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public double calculaMedia(int nota1, int nota2, int nota3) {
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        return notaFinal;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Luiz Rossini");
        aluno2.setNome("Jocasta Pedroso");

        System.out.println("O aluno " +aluno1.getNome()+ " tem a média de notas de: " +aluno1.calculaMedia(6, 6 , 6));
        System.out.println("A aluna " +aluno2.getNome()+ " tem a média de notas de: " +aluno2.calculaMedia(3, 6, 8));
    }
}