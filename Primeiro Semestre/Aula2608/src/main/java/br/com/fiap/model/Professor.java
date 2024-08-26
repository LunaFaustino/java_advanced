package br.com.fiap.model;


public class Professor extends Pessoa {

    @Override //sobrescrevendo o método
    @SuppressWarnings("all") //retira os alertas(amarelinho)
    // @Deprecated //define que o método não deve ser utilizado
    public void andar() {
        System.out.println("Professor andando");
        int x = 123;
    }
}
