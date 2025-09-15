import java.util.ArrayList;
import java.util.List;

public class Buscapalavra {

    public static List<String> buscarPorCidade(List<String> enderecoAluno, String procuraEndereco) {
        List<String> resultadosEndereco = new ArrayList<>();

        for (String endereco : enderecoAluno) {
            if (contemPalavra(endereco, procuraEndereco)) {
                resultadosEndereco.add(endereco);
            }
        }

        return resultadosEndereco;
    }

    private static boolean contemPalavra(String texto, String palavra) {
        String[] palavras = texto.toLowerCase().split("\\W+");
        String palavraLower = palavra.toLowerCase();

        for (String p : palavras) {
            if (p.equals(palavraLower)) {
                return true;
            }
        }
        return false;
    }
}
