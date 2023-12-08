
public class Pet {
    private String especie;
    private String raca;
    private int idade;

    public Pet(){}
    public Pet(String especie, String raca, int idade){
        this();
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }
}
