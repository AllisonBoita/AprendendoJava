package java_curso;

// Classe
public class _Carro {

    String modelo;
    String cor;

    public static void main(String[] args){
        System.out.println("Teste");
    }

    public _Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

    protected String acelerar(){
        System.out.println("O carro " + this.cor + ", modelo " + this.modelo + " está acelerando...");
        return ("Oi");
    }

    public String frear(){
        System.out.println("O carro " + this.cor + ", modelo " + this.modelo + " está freando...");
        return ("Oi");
    }

    public String rodas() {
        System.out.println("O carro " + this.cor + ", modelo " + this.modelo + " tem rodas...");
        return ("Oi");
    }
}


