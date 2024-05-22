import java.io.Console;

public class Cadastro {
    public static void main(String[] args) throws Exception{
        String titulo = Leitor.lerString("Informe o título");
        String autor = Leitor.lerString("Informe o artista");
        int ano = Leitor.lerInt("Informe o ano de criação");
        String tipo = Leitor.lerString("Tipo de obra (pintura, escultura ou fotografia)");
        String localizacao = Leitor.lerString("Local onde se encontra no museu");

        Obra obra = new Obra(titulo, autor, ano, localizacao, tipo, localizacao);

        System.out.println("\n" + //
                        "Obra cadastrada!");
                        System.out.println(obra);
    }
    
}
// \n