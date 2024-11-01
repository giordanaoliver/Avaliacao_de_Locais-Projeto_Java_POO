package classes;

import java.util.ArrayList;
import java.util.List;

public class Local extends Geografia {
    private String nome;

    private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    public Local(String nome, String zona, String cidade, String estado, String pais) {
        super(zona, cidade, estado, pais);
        this.nome = nome;
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

    public List<Avaliacao> getAvaliacoes() { return this.avaliacoes; }
}
