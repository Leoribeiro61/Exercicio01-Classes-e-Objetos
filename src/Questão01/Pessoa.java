
public class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private int idade;

    public Pessoa(){}
    public Pessoa(String cpf, String nome, int idade, String telefone) {
        this();
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }
}
