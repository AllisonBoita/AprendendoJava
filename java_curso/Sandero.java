package java_curso;

public class Sandero implements Carro{

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Freando...");
    }

    @Override
    public void estacionar() {
        System.out.println("Parando...");
    }
}
