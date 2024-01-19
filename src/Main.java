public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto(1200, "AB123CD", "Fiat", "Panda");

        auto.setCilindrata(1400);
        auto.setTarga("DE456FG");
        auto.setMarca("Lancia");
        auto.setModello("Ypsilon");

        System.out.println("Cilindrata: " + auto.getCilindrata());
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
    }
}