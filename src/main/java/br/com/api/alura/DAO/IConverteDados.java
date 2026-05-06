package br.com.api.alura.DAO;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
