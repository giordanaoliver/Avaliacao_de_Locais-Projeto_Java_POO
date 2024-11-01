package classes;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private List<Local> locais = new ArrayList<Local>();

    public App() {
        this.inicializarLocais();
    }

    public String registrarUsuario(String nome, String email) {
        Usuario usuario = new Usuario(nome, email);
        this.usuarios.add(usuario);

        return "Usuário criado com sucesso.";
    }

    private void inicializarLocais() {
        this.locais.add(new Local("Teatro Amazonas", "CentroSul", "Manaus", "Amazonas", "Brasil"));
        this.locais.add(new Local("Praia de Copacabana", "Zona Sul", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Museu do Ipiranga", "Ipiranga", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Catedral da Sé", "Centro", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Parque Ibirapuera", "Vila Mariana", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Castelo de Gramado", "Centro", "Gramado", "Rio Grande do Sul", "Brasil"));
        this.locais.add(new Local("Teatro Municipal", "Centro", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Pão de Açúcar", "Urca", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Igreja de São Francisco", "Pelourinho", "Salvador", "Bahia", "Brasil"));
        this.locais.add(new Local("Jardim Botânico", "Botafogo", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Praça da Liberdade", "Liberdade", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Parque Nacional da Tijuca", "Tijuca", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Ilha do Cardoso", "Cardoso", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Museu de Arte Moderna", "Centro", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Beco do Batman", "Vila Madalena", "São Paulo", "São Paulo", "Brasil"));
        this.locais.add(new Local("Forte de Copacabana", "Copacabana", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Teatro Guaíra", "Centro", "Curitiba", "Paraná", "Brasil"));
        this.locais.add(new Local("Cataratas do Iguaçu", null, "Foz do Iguaçu", "Paraná", "Brasil"));
        this.locais.add(new Local("Sambódromo", "Sambadrome", "Rio de Janeiro", "Rio de Janeiro", "Brasil"));
        this.locais.add(new Local("Parque Nacional da Chapada dos Veadeiros", null, "Cavalcante", "Goiás", "Brasil"));
        this.locais.add(new Local("Centro Histórico de Ouro Preto", null, "Ouro Preto", "Minas Gerais", "Brasil"));
    }

    // acessos Usuarios
    public List<Usuario> getUsuarios() { return this.usuarios; }
    public Usuario getUsuario(String email) {
        for (Usuario usuario : this.usuarios)
        if (usuario.getEmail().equals(email)) return usuario;
        return null;
    }

    // acessos Locais
    public List<Local> getLocais() { return this.locais; }
    public Local getLocal(String nome) {
        for (Local local : this.locais)
            if (local.getNome().equals(nome)) return local;
        return null;
    }
    public List<Local> filtrarPorZona(String zona) {
        List<Local> locaisZona = new ArrayList<>();
        for (Local local : this.locais)
            if (local.getZona().equals(zona)) locaisZona.add(local);
        return locaisZona;
    }
    public List<Local> filtrarPorCidade(String cidade) {
        List<Local> locaisCidade = new ArrayList<>();
        for (Local local : this.locais)
            if (local.getZona().equals(cidade)) locaisCidade.add(local);
        return locaisCidade;
    }
    public List<Local> filtrarPorEstado(String estado) {
        List<Local> locaisEstado = new ArrayList<>();
        for (Local local : this.locais)
            if (local.getZona().equals(estado)) locaisEstado.add(local);
        return locaisEstado;
    }
    public List<Local> filtrarPorPais(String pais) {
        List<Local> locaisPais = new ArrayList<>();
        for (Local local : this.locais)
            if (local.getZona().equals(pais)) locaisPais.add(local);
        return locaisPais;
    }
}
