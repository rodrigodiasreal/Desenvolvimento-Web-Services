/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagem;

import servicos.ServicoAereo_Service;

/**
 *
 * @author rodri
 */
public class AgenciaViagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicoAereo_Service servico = new ServicoAereo_Service();
        float preco;
        preco = servico.getServicoAereoPort().getPrecoViagem("Campinas");
        System.out.println("Preço do destino: " + preco);
    }
    
}
