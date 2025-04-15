package retangulo;
public class retangulo {
    double largura,altura,area,perimetro;

    public retangulo(){
        largura=40;
        altura=10;
    }

    public void calcularArea(){
        area=altura*largura;
        System.out.println("A área é: "+area);
    }
    
    public void calcularPerimetro(){
        perimetro=(altura*2)+(largura*2);
        System.out.println("O perímetro é: "+perimetro);
    }

    
}

