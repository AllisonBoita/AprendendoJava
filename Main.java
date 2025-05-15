public class Main {

    public static void main(String[] args) {

        String meuNome = "Allison";

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
    }
}