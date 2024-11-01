package classes;

public abstract class Geografia {
    private String zona;
    private String cidade;
    private String estado;
    private String pais;

    public Geografia(String zona, String cidade, String estado, String pais) {
        this.zona = zona;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    // acessos
    public String getZona() { return this.zona; }
    public String getCidade() { return this.cidade; }
    public String getEstado() { return this.estado; }
    public String getPais() { return this.pais; }
}
