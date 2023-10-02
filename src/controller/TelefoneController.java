package controller;

import model.Queue;

public class TelefoneController {
    public TelefoneController() {
        super();
    }

    public void insereLigacao(Queue<String> fila, String numeroTelefone){
        fila.insert(numeroTelefone);
    }

    public void consultaLigacao(Queue<String> fila) throws Exception{
        while (fila != null) {
            System.out.println(fila.remove());
        }
    }
}
