//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(6, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(7, 8, 9);

        System.out.println("¿Son Perpendiculares? " + a.esPerpendicular(b));
        System.out.println("¿ SonParalelos? " + a.esParalelo(b));
        System.out.println("La Proyección de a sobre b es: " + a.proyeccion(b));
        System.out.println("El Componente de a en b es: " + a.componente(b));
    }
}