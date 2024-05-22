import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Obra> obras;

    public Lista(){
        obras = new ArrayList<>();
    }

    public void adicionarObra(Obra obra){ //adicina uma nova obra na lista
        obras.add(obra);
    }

    public List<Obra> buscarObra( String titulo){ //busca uma obra dentro da lista
        List<Obra> result = new ArrayList<>();
        for (Obra obra : obras){
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                result.add(obra);
            }
        }
        return result;
    }
    public List<Obra> listarObras() {// mostra a lista de obras
        return new ArrayList<>(obras); 
    }
    public boolean removerObra(String titulo) { //excluir uma obra da lista
        for (Obra obra : obras) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                obras.remove(obra);
                return true; 
            }
        }
        return false; 
    }
    public boolean atualizarObra(String titulo, String novoTitulo, int novoAno, String novoAutor) {
        for (Obra obra : obras) {
            if (obra.getTitulo().equalsIgnoreCase(titulo)) {
                
                obra.setAno(novoAno);
                obra.setTitulo(novoTitulo);
                obra.setAutor(novoAutor);
                return true;
            }
        }
        return false;
    } 
public void salvarTxt(List<Obra> obras, String nomeArquivo) {
        try (FileWriter fw = new FileWriter(nomeArquivo);
             BufferedWriter writer = new BufferedWriter(fw)) {
            for (Obra obra : obras) {
                writer.write("Título: " + obra.getTitulo());
                writer.newLine();
                writer.write("Artista: " + obra.getAutor());
                writer.newLine();
                writer.write("Ano: " + obra.getAno());
                writer.newLine();
            
                writer.newLine(); // "quebra de linha"
            }
            System.out.println("Lista de obras salva com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar a lista de obras: " + e.getMessage());
        }}}
    

