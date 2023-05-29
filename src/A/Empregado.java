package A;

public class Empregado implements Comparable{
    private String cpf;
    private int idade;
    private double salario;

    public Empregado(String cpf, int idade, double salario){
        setCpf(cpf);
        setIdade(idade);
        setSalario(salario);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
