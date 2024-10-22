package principal;

import javax.swing.JOptionPane;
import model.CarroPasseio;
import model.Caminhao;

public class Principal {

    public static void main(String[] args) {

        int X = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPSÃO\n 0 => CARRO\n "
                + "1 => CAMINHÃO"));
        if (X > 1) {
            JOptionPane.showMessageDialog(null, "Inválido. Tente novamente.");
        } else {
            switch (X) {
                case 0:
                    JOptionPane.showMessageDialog(null, " Digite as informações do Carro");
                    CarroPasseio carroPasseio = new CarroPasseio();
                    carroPasseio.leituraCarroPasseio();
                    System.out.println("As suas informações do carro de passeio são => " + carroPasseio.mostrarCarroPasseio());
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "Digite as informações do Caminhão");
                    Caminhao caminhao = new Caminhao();
                    caminhao.leituraCaminhao();
                    System.out.println("As suas informações do caminhão são => " + caminhao.mostrarCaminhao());
                    break;

            }
        }
    }
}

