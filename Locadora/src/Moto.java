public class Moto extends Veiculo {
    private int cilindradas;
    private int Id;

    public Moto(String marca, String modelo, int ano, String placa, int cilindradas, int id, int valdiaria, String cor) {
        super(marca, modelo, ano, placa, id, valdiaria, cor );
        this.cilindradas = cilindradas;
        this.Id = this.Id;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getId() {
        return Id;
    }

    public void setCilindradas(int novaCilindrada) {
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}