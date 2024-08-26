package br.com.fiap.view;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.model.Pessoa;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {

    public static void main(String[] args) {

        // instancia pessoa
        Pessoa pessoa = new Pessoa();

        // pega o nome da classe
        String nomeClasse = pessoa.getClass().getName();
        System.out.println(nomeClasse);

        // pega os métodos da classe
        Method[] metodos = pessoa.getClass().getDeclaredMethods();

        // exibe o nome dos métodos
        for (Method m : metodos){
            System.out.println(m.getName());
        }

        // pega os atributos da classe
        Field[] atributos = pessoa.getClass().getDeclaredFields();

        // exibe o nome e o tipo dos atributos
        for (Field f : atributos){
            System.out.println(f.getName() + " " + f.getType());

            // pega a anotação @Coluna
            Coluna anotacao = f.getAnnotation(Coluna.class);

            //exibe os parametros da anotação
            System.out.println(anotacao.nome() + " " + anotacao.tamanho() + " " + anotacao.obrigatorio());
        }
    }
}
