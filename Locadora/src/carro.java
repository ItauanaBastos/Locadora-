
public class carro extends Veiculo {
    private int numportas;

    public carro(String marca, String modelo, int ano, String placa, int numportas, int valdiaria, String cor) {
        super(marca, modelo, ano, placa, numportas, valdiaria, cor);
        this.numportas= numportas;

    }


    public int getnumportas() {
        return numportas;
    }

    public void setNumPortas(int novoNumPortas) {
    }


    @Override
    public String toString() {
        return super.toString() + ", Numero de portas: " + numportas;
    }
}

