package conta_bancaria;
public class contabancaria {
    String numConta;
    double saldo,novo_saldo;

    public contabancaria(){
        numConta ="1123323";
        saldo=0;
    }

    public void depositar(double valor){
        saldo = saldo+valor;
    }
    public void sacar (double valor){
        if (saldo>0 && saldo>valor) {
            saldo=saldo-valor;
            System.out.println("O novo saldo é"+saldo);

        }
        else{
            System.out.println("O saldo é menor que o valor que deseja ser sacado");
        }

}

public static void main(String[] args) {
    contabancaria contabancaria = new contabancaria();
    contabancaria.depositar(7000);
    contabancaria.sacar(8000);
}

}

