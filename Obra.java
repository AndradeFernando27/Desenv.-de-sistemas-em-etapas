
public class Obra {
    private String titulo;
    private String autor;
    private int ano;
    private String localizacao;
    private String tipo;

    public Obra(String titulo, String autor, int ano, String localizacao, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.localizacao = localizacao;
        this.tipo = tipo;
    }
    public String getNome() {
        return titulo;
    }
    public void setNome(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Obra(String nome, String autor, int ano, String localizacao, String titulo, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.localizacao = localizacao;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Título=" + titulo + ", Autor=" + autor + ", Ano de criação=" + ano + ", Tipo de Obra="
                + tipo + ", Local no Museu=" + localizacao;
    }
}
