public class Main {
    public static void main(String[] args) {

        MiTeleferico m = new MiTeleferico();

        Linea roja = m.getLinea("Rojo");

        roja.agregarCabina(1);
        roja.agregarCabina(2);

        roja.agregarPersona(new Persona("Luis", 20, 60));
        roja.agregarPersona(new Persona("Ana", 30, 70));
        roja.agregarPersona(new Persona("Pedro", 65, 80));

        roja.agregarPersonaCabina(1);
        roja.agregarPersonaCabina(1);
        roja.agregarPersonaCabina(2);

        System.out.println("Ingreso Rojo: " + roja.calcularIngreso());

        m.lineaMayorIngreso();
    }
}
