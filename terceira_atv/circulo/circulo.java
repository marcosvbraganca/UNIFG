package circulo;
public class circulo {
    double raio,area,circunferencia;

    public circulo(){
        raio=10;
    }

    public void calcularArea(){
        area=Math.PI* Math.pow(raio,2);
        System.out.println("A área é: "+ area);
    }

    public void calcularCircunferencia(){
        circunferencia=Math.PI*raio*2;
        System.out.println("A circunferência é: "+ circunferencia);
    }




}
