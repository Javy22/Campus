import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.añadirPuerta();
        miCoche.añadirPuerta();
        int resultado = 0;
        resultado = suma ( 8 , 9, 3);
        System.out.println(resultado);
        System.out.println(miCoche.puertas);
    }
public static int suma (int a , int b, int c){
        return a+b+c;
}
}
class coche {
    public int puertas = 0;
public void añadirPuerta ()
{
    this.puertas++;
}
}