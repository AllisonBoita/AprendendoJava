package java_curso;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*String meuNome = "Allison";

        if(meuNome.equals("Allison")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if(meuNome.equals("Allison")) {
            System.out.println("Verdadeiro");
        } else if (meuNome.isBlank()){
            System.out.println("O nome é vazio");
        } else {
            System.out.println("Falso");
        }

        String[] frutas = {"Maça", "Banana", "Uva", "Melancia"};
        System.out.println(frutas[0]);

        String[] meusNomes = new String[10];
        meusNomes = new String[] {"Allison", "Marcio", "Cleber", "Juca"};
        System.out.println(meusNomes[3]);

        ArrayList<String> novaLista = new ArrayList<>();
        novaLista.add("Allison Boita");
        novaLista.add("Marcio Marcio");
        novaLista.add("Marcio Uva");
        novaLista.add("Marcio Limao");
        novaLista.add("Marcio Canela");
        System.out.println(novaLista);
        System.out.println(novaLista.get(1));

        for (int i = 0; i < novaLista.size(); i++){
            System.out.println(novaLista.get(i));
        }

        for (int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }

        for (String nome : meusNomes){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador <= 10){
            System.out.println("Estou no while");
            contador++;
        }

        double resultado = 1.5;
        int resultadoInt = (int)resultado;
        System.out.println(resultadoInt);

        int meuInt = 10;
        double meuDouble = meuInt;
        System.out.println(meuDouble);

        String meuString = "20";
        int meuInt2 = Integer.parseInt(meuString);
        System.out.println(meuInt2);*/

        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro1 = new Carro("Fiat");
        Carro meuCarro2 = new Carro("Wolks");

        String result = meuCarro2.acelerar();
        meuCarro.frear();
        meuCarro1.frear();

        System.out.println(result);

    }
}