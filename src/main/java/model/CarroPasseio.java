package model;

import javax.swing.JOptionPane;


public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {

        this("", "");
    }

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio(String cor, String modelo, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
        public void leituraCarroPasseio() {
        super.leituraPrincipal();
        setCor(JOptionPane.showInputDialog("Digite a cor"));
        setModelo(JOptionPane.showInputDialog("Digite o modelo"));

    }

    public String mostrarCarroPasseio() {
        super.mostrarVeiculo();
        return "Peso do veiculo: " + getPeso() + "Kg" + ", " + "Velocidade maxima do veiculo: " + getVelocMax() + " Km/h " + ", " + "Preço do veiculo: " + getPreco() +"$ Reais" + ", " + "Cor: " + getCor() + ", " + "Modelo: " + getModelo();
    }
    
    
}
