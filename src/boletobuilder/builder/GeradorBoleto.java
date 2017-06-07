/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletobuilder.builder;

import java.util.Calendar;

/**
 *
 * @author Rodrigo Gregori
 */
public class GeradorBoleto {
    private final BoletoBuilder boletoBuilder;
    
    public GeradorBoleto(BoletoBuilder boletoBuilder) {
        this.boletoBuilder = boletoBuilder;
    }
    
    public Boleto geraBoleto() {
        this.boletoBuilder.buildSacado("Rodrigo Gregori");
        this.boletoBuilder.buildCedente("Catolica SC");
        this.boletoBuilder.buildValor(1200.00);
        
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        this.boletoBuilder.buildVencimento(vencimento);
        
        this.boletoBuilder.buildNossoNumero(123456);
        
        Boleto boleto = boletoBuilder.getBoleto();
        return boleto;
    }
}
