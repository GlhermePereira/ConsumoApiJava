import com.google.gson.Gson;

public class Main {
    public static void main(String[] args){
        // Instancia a classe BuscaEndereco
        BuscaEndereco buscaEndereco = new BuscaEndereco();

        // Chama o método consomeApi() e armazena o resultado
        String resultado = buscaEndereco.consomeApi();
        Gson gson = new Gson();

        var buscaEnd = new BuscaEndereco();
        String json = buscaEnd.consomeApi();
        System.out.printf(json);
        Endereco  enderecoFatec = gson.fromJson(json,Endereco.class);
        System.out.println(enderecoFatec);
        //fazer o usuario digitar o cep
    }
}
