import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class BuscaEndereco {

public  String consomeApi(){
    //CLient, Request , Response.
        HttpClient client = HttpClient.newHttpClient();
        // Client, Request, Response.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/01001000/json/"))
                .build();

            HttpResponse<String> response;

    {
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
            return response.body();


}
}
