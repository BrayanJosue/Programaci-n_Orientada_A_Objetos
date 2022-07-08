
public class Recursos {

    public void mensaje() {
        System.out.println("Programación orientada a objeto 2021");
    }

    public void mayorEdad() {
        int edad = 40;
        if (edad >= 21) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

    }

    public int multiplicacion(int x, int y) {
        return x * y;

    }

    void listaNumeros(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Recursos objeto = new Recursos();
        objeto.mensaje();
        objeto.mayorEdad();
        objeto.multiplicacion(2, 3);
        objeto.listaNumeros(5);
        

    }

}
