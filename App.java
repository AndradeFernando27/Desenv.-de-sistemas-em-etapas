import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=-=-= Menu =-=-=");
            System.out.println("\n1) Cadastro de obra");
            System.out.println("2) Buscar obra");
            System.out.println("3) Excluir obra da lista");
            System.out.println("4) Atualizar dados da obra");
            System.out.println("5) Sair e salvar no arquivo");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    cadastrarObra(lista, scanner);
                    break;
                case 2:
                    buscarObra(lista, scanner);
                    break;
                case 3:
                    excluirObra(lista, scanner);
                    break;
                case 4:
                    atualizarObra(lista, scanner);
                    break;
                case 5:
                    
                    System.out.println("Aperte 5 para sair e finalizar");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }lista.salvarTxt(lista.listarObras(), "lista_obras.txt");// so funciona quando o programa é finalizado apertando o case 5
        }
    }

    private static void cadastrarObra(Lista lista, Scanner scanner) {
        System.out.print("Informe o título: ");
        String titulo = scanner.nextLine();
        System.out.print("Informe o artista: ");
        String autor = scanner.nextLine();
        System.out.print("Informe o ano de criação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Tipo de obra (pintura, escultura ou fotografia): ");
        String tipo = scanner.nextLine();
        System.out.print("Local onde se encontra no museu: ");
        String localizacao = scanner.nextLine();

        Obra obra = new Obra(titulo, autor, ano, tipo, localizacao);
        lista.adicionarObra(obra);

        System.out.println("Obra cadastrada:");
        System.out.println(obra);
    }

    private static void buscarObra(Lista lista, Scanner scanner) {
        System.out.print("Digite o título da obra para a busca: ");
        String tituloBusca = scanner.nextLine();
        List<Obra> obrasEncontradas = lista.buscarObra(tituloBusca);

        if (obrasEncontradas.isEmpty()) {
            System.out.println("Nenhuma obra encontrada.");
        } else {
            for (Obra obraEncontrada : obrasEncontradas) {
                System.out.println(obraEncontrada);
            }
        }
    }

    private static void excluirObra(Lista lista, Scanner scanner) {
        System.out.print("Digite o título da obra para exclusão: ");
        String tituloExcluir = scanner.nextLine();
        boolean excluida = lista.removerObra(tituloExcluir);

        if (excluida) {
            System.out.println("Obra removida com sucesso.");
        } else {
            System.out.println("Nenhuma obra encontrada com o título fornecido.");
        }
    }

    private static void atualizarObra(Lista lista, Scanner scanner) {
        System.out.print("Digite o título da obra para atualização: ");
        String tituloAtualizacao = scanner.nextLine();
        System.out.print("Digite o novo título: ");
        String novoTitulo = scanner.nextLine();
        System.out.print("Digite o novo autor: ");
        String novoAutor = scanner.nextLine();
        System.out.print("Digite o novo ano de publicação: ");
        int novoAno = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        boolean atualizada = lista.atualizarObra(tituloAtualizacao, novoTitulo, novoAno, novoAutor);

        if (atualizada) {
            System.out.println("Obra atualizada com sucesso.");
        } else {
            System.out.println("Nenhuma obra encontrada com o título fornecido.");
        }
    }
}
