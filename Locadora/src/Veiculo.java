public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int id;
    private int valdiaria;
    private String cor;


    public Veiculo(String marca, String modelo, int ano, String placa, int id, int valdiaria, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.id = id;
        this.valdiaria = valdiaria;
        this.cor = cor;

    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getId() {
        return id;
    }

    public int getValdiaria() {
        return valdiaria;
    }

    public String getCor() {
        return cor;
    }


    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Placa: " + placa + ", ID: " + id + ", Diaría" + valdiaria + ", Cor:" + cor;

    }


public void setMarca(String novaMarca) {
}

public void setModelo(String novoModelo) {
}

public void setAno(int novoAno) {
}

public void setPlaca(String novaPlaca) {
}

public void setCor(String novaCor) {
}

public void setValorDiaria(int novoValorDiaria) {
}
}