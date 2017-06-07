/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletobuilder;

import boletobuilder.builder.BBBoletoBuilder;
import boletobuilder.builder.Boleto;
import boletobuilder.builder.BoletoBuilder;
import boletobuilder.builder.GeradorBoleto;

/**
 *
 * @author Rodrigo Gregori
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BoletoBuilder boletoBuilder = new BBBoletoBuilder();
        GeradorBoleto geradorBoleto = new GeradorBoleto(boletoBuilder);
        Boleto boleto = geradorBoleto.geraBoleto();
        System.out.println(boleto);
    }
    
}
