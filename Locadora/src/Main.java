import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;


public class Main {
    private static Locadora locadora = new Locadora();

    public static void main(String[] args) {
        exibirMenu();

    }

    private static void exibirMenu() {
        String[] opcoes = {"Adicionar Veículo", "Listar Veículos", "Alterar Veículo", "Sair"};


        while (true) {
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Sistema de Cadastro de Veículos",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == null) {
                encerrarPrograma();
                break;
            }

            switch (escolha) {
                case "Adicionar Veículo":
                    adicionarVeiculo();
                    break;
                case "Listar Veículos":
                    listarVeiculos();
                    break;
                case "Alterar Veículo":
                    alterarVeiculo();
                    break;
                case "Sair":
                    encerrarPrograma();
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void adicionarVeiculo() {
        String[] tipos = {"Carro", "Moto"};
        String tipoVeiculo = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de veículo:", "Adicionar Veículo",
                JOptionPane.PLAIN_MESSAGE, null, tipos, tipos[0]);

        if (tipoVeiculo == null) {
            return; // Cancelado pelo usuário
        }

        String modelo = JOptionPane.showInputDialog(null, " Modelo:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Marca:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        String anoStr = JOptionPane.showInputDialog(null, " Ano:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        int ano = Integer.parseInt(anoStr);
        String cor = JOptionPane.showInputDialog(null, " Cor:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        String placa = JOptionPane.showInputDialog(null, " Placa:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        String idStr = JOptionPane.showInputDialog(null, " ID:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        int id = Integer.parseInt(idStr);
        String valDiariaStr = JOptionPane.showInputDialog(null, " Valor da Diária:", "Adicionar " + tipoVeiculo, JOptionPane.PLAIN_MESSAGE);
        int valDiaria = Integer.parseInt(valDiariaStr);

        if (tipoVeiculo.equals("Carro")) {
            String numPortasStr = JOptionPane.showInputDialog(null, " Número de Portas:", "Adicionar Carro", JOptionPane.PLAIN_MESSAGE);
            int numPortas = Integer.parseInt(numPortasStr);
            //String marca, String modelo, int ano, String placa, int numportas, int valdiaria, String cor
            carro carro = new carro(marca, modelo, ano, placa, numPortas, valDiaria, cor);
            locadora.adicionarVeiculo(carro);
        } else if (tipoVeiculo.equals("Moto")) {
            String cilindradasStr = JOptionPane.showInputDialog(null, "Cilindradas:", "Adicionar Moto", JOptionPane.PLAIN_MESSAGE);
            int cilindradas = Integer.parseInt(cilindradasStr);
            //(String marca, String modelo, int ano, String placa, int cilindradas, int id, int valdiaria, String cor)
            Moto moto = new Moto(marca, modelo, ano, placa, cilindradas, id, valDiaria, cor);
        }

        JOptionPane.showMessageDialog(null, "Veículo adicionado com sucesso!", "Adicionar Veículo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void listarVeiculos() {
        StringBuilder sb = new StringBuilder();
        locadora.listarVeiculos();
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Veículos", JOptionPane.PLAIN_MESSAGE);
    }

    private static void alterarVeiculo() {
        String idStr = JOptionPane.showInputDialog(null, "Digite o ID do veículo que deseja alterar:", "Alterar Veículo", JOptionPane.PLAIN_MESSAGE);
        if (idStr == null) {
            return; // Cancelado pelo usuário
        }
        int id = Integer.parseInt(idStr);

        locadora.alterarVeiculo(id);

        JOptionPane.showMessageDialog(null, "Veículo alterado com sucesso!", "Alterar Veículo", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void encerrarPrograma() {
        JOptionPane.showMessageDialog(null, "Saindo do sistema...", "Sistema de Cadastro de Veículos", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
