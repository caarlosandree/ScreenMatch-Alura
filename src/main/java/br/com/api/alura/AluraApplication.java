package br.com.api.alura;

import br.com.api.alura.service.ConsumoAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AluraApplication implements CommandLineRunner {

    @Value("${api.key}")
    private String apiKey;

    static void main(String[] args) {
        SpringApplication.run(AluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?apikey=" + apiKey + "&t=Breaking+Bad&Season=1");
        System.out.println(json);
    }
}
