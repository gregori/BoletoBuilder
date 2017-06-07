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
public interface Boleto {
   String getSacado();
   String getCedente();
   double getValor();
   Calendar getVencimento();
   int getNossoNumero();
   String toString();
}
