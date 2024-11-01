package classes;

public class Avaliacao {
    private int estrelas;
    private String comentario;

    public Avaliacao(int estrelas, String comentario) {
        this.estrelas = estrelas;
        this.comentario = comentario;
    }

    // acessos
    public int getEstrelas() { return this.estrelas; }
    public String getComentario() { return this.comentario; }
}
