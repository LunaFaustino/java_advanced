package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

    // Atributo estático que armazena a única instância
    private static EntityManagerFactory unico;

    // Construtor privado
    private EntityManagerFactorySingleton() {}

    // Método estático que cria e retorna a instância se necessário
    public static EntityManagerFactory getInstance() {
        if (unico == null) {
            unico = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
        }
        return unico;
    }
}
