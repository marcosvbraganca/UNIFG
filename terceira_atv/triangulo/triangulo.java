package triangulo;
public class triangulo {
    double base,altura,area;
    
    public triangulo(){
        base=10;
        altura=5;
    }

    public void calcularTriangulo(){
        area= base*altura/2;
        System.out.println("A área é: "+area);
    }

    
}