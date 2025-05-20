// Classe
public class Carro {

    public static void main(String[] args){
        // Objetos
        CarroNovo meuCarro = new CarroNovo("Fiat", "Branco");
        CarroNovo meuCarro1 = new CarroNovo("BMW", "Preto");
        CarroNovo meuCarro2 = new CarroNovo("Fusca", "Azul");

        meuCarro1.acelerar();
        meuCarro.frear();
    }
}


class CarroNovo {
    String modelo;
    String cor;

    // Construtor
    public CarroNovo(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

    // Metodo
    public void acelerar(){
        System.out.println("O carro " + this.cor + ", modelo " + this.modelo + " está acelerando...");
    }

    public void frear(){
        System.out.println("O carro " + this.cor + ", modelo " + this.modelo + " está freando...");
    }
}
