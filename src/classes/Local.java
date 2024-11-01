package classes;

import java.util.ArrayList;
import java.util.List;

public class Local {
    private String nome;
    private String zona;
    private String cidade;
    private String estado;
    private String pais;

    private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    public Local(String nome, String zona, String cidade, String estado, String pais) {
        this.nome = nome;
        this.zona = zona;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public void criarAvaliacao(int estrelas, String comentario) {
        if (estrelas >= 1 && estrelas <= 5) {
            Avaliacao avaliacao = new Avaliacao(estrelas, comentario);
            this.avaliacoes.add(avaliacao);
        }
        return;
    }
    
    // acessos
    public String getNome() { return this.nome; }
    public String getZona() { return this.zona; }
    public String getCidade() { return this.cidade; }
    public String getEstado() { return this.estado; }
    public String getPais() { return this.pais; }

    public List<Avaliacao> getAvaliacoes() { return this.avaliacoes; }
}
