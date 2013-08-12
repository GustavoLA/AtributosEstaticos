
public class PrincipalFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.nome = "Jão da Silva";
        f1.salario = 500;
        System.out.println(Funcionario.salarioTotal);

        Funcionario f2 = new Funcionario();
        f2.nome = "Jão Pedro";
        f2.salario = 400;
        System.out.println(Funcionario.salarioTotal);
    }
}
