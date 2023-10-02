package view;

import controller.TelefoneController;
import model.Queue;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue<String> fila = new Queue<>();
        String menu;
        TelefoneController t = new TelefoneController();

        do {
            menu = JOptionPane.showInputDialog("Chamadas Perdidas\n1- Insere\n2- Consulta\n9- Fim");
            try {
                switch (menu) {
                    case "1" -> {
                        String numTel = JOptionPane.showInputDialog("Informe um num de telefone");
                        t.insereLigacao(fila, numTel);
                    }
                    case "2" -> t.consultaLigacao(fila);
                    case "9" -> System.exit(1);
                    default -> JOptionPane.showMessageDialog(null, "Entrada inválida!\nTente novamente.");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);

    }
}
