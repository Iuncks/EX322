package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {

    private int toneladas;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao() {
    this(0,0,0); 
    
    }

    public Caminhao(int toneladas, int alturaMaxima, int comprimento) {
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Caminhao(int toneladas, int alturaMaxima, int comprimento, int peso, int velocMax, float preco) {
        super(peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public int getToneladas() {
        return toneladas;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
            public void leituraCaminhao() {
        super.leituraPrincipal();
        setToneladas(Integer.parseInt(JOptionPane.showInputDialog("Digite as toneladas")));
        setAlturaMaxima(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura maxima")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento")));

    }

    public String mostrarCaminhao() {
        super.mostrarVeiculo();
        return "Peso do veiculo: " + getPeso() + "Kg" + ", " + "Velocidade maxima do veiculo: " + getVelocMax() + " Km/h " + ", " + "Preço do veiculo: " + getPreco() +"$ Reais" + ", " + "Toneladas:" + getToneladas() + ", " + "Altura maxima:" + getAlturaMaxima() + ", " + "Comprimento:" + getComprimento() + ".";
    }
}
