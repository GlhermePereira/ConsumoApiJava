import com.google.gson.annotations.SerializedName;

public class Endereco {
    public String cep;
    @SerializedName("logradouro")
    //@Serial(value = "email", alternate = "email"`)
    //public String logradouro;
    public String bairro;
    public String localidade;
    public String uf;

    public String toString() {
        return "endereco {" + "cep= '" + cep + '\'' + '}';
        
    }

}
