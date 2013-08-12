
public class Pessoa {

    static int codigo;  //Atributo pertence a classe e não ao objeto
    String nome;

    public Pessoa() {
        this.codigo++;
    }

    public String toString() {
        return "Codigo: " + codigo + "\nNome: " + nome;
    }
}
