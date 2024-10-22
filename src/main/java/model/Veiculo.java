package model;

import javax.swing.JOptionPane;

public class Veiculo {
    
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {

        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }



    public void leituraPrincipal() {

        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do veiculo")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade maxima do veiculo")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do veiculo")));

    }

    public String mostrarVeiculo() {
        return "Peso do veiculo: " + getPeso() + "Kg" + ", " + "Velocidade maxima do veiculo: " + getVelocMax() + " Km/h " + ", " + "Preço do veiculo: " + getPreco() + "$ Reais";
    }
}
