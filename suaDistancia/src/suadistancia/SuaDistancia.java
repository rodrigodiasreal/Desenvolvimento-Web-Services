/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suadistancia;

import mapa.Distancia_Service;

/**
 *
 * @author rodri
 */
public class SuaDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distancia_Service mapa = new Distancia_Service();
        float longe;
        longe = mapa.getDistanciaPort().getKm("Sao Paulo Campinas");
        System.out.println("A distância entre as cidades é: " + longe);
    }
    
}
