
public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void imprimirInfo(){
        System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nNúmero de páginas: "+numPaginas);
    }


}
