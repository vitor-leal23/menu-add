public class Buscapalavra {
    public static boolean contemPalavra(String texto, String palavra){
        String[] palavras = texto.toLowerCase().split("\\w+");
        String palavraLower = palavra.toLowerCase();
        for(String p :  palavras){
            if(p.equals(palavraLower)){
                return true;
            }
        }
        return false;
    }
}
