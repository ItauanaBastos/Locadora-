import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    private List<Veiculo> veiculos;

    public Locadora() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
        return null;
    }
    public void alterarVeiculo(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == id) {
                System.out.println("Digite os novos dados para o veículo:");

                System.out.printf("Nova Marca: ");
                String novaMarca = scanner.nextLine();
                veiculo.setMarca(novaMarca);

                System.out.printf("Novo Modelo: ");
                String novoModelo = scanner.nextLine();
                veiculo.setModelo(novoModelo);

                System.out.printf("Novo Ano: ");
                int novoAno = scanner.nextInt();
                veiculo.setAno(novoAno);

                scanner.nextLine(); // Limpar o buffer do teclado

                System.out.printf("Nova Placa: ");
                String novaPlaca = scanner.nextLine();
                veiculo.setPlaca(novaPlaca);

                System.out.printf("Nova Cor: ");
                String novaCor = scanner.nextLine();
                veiculo.setCor(novaCor);

                System.out.printf("Novo Valor da Diária: ");
                int novoValorDiaria = scanner.nextInt();
                veiculo.setValorDiaria(novoValorDiaria);

                // Para Carro específico
                if (veiculo instanceof carro) {
                    carro carro = (carro) veiculo;
                    System.out.printf("Novo Número de Portas: ");
                    int novoNumPortas = scanner.nextInt();
                    carro.setNumPortas(novoNumPortas);
                }

                // Para Moto específico
                if (veiculo instanceof Moto) {
                    Moto moto = (Moto) veiculo;
                    System.out.printf("Nova Cilindrada: ");
                    int novaCilindrada = scanner.nextInt();
                    moto.setCilindradas(novaCilindrada);
                }

                System.out.println("Veículo alterado com sucesso!");
                return;
            }
        }
        System.out.println("Veículo com ID " + id + " não encontrado.");
    }
}

