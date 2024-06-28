/*1 - Crie uma classe ContaBancaria com os seguintes atributos:
numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.*/

public class ContaBancaria {
    private int numeroConta;
    private int saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(1048596);
        conta1.setSaldo(2100);
        conta1.setTitular("Luiz Rossini");

        System.out.println("Número da conta: " +conta1.getNumeroConta());
        System.out.println("Saldo da conta: " +conta1.getSaldo());
        System.out.println("Titular da conta: " +conta1.getTitular());
    }
}