/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ejb;

import javax.ejb.Remote;

/**
 *
 * @author GustavoCoronel
 */
@Remote
public interface EJBMathRemote {

  int sumar(int num1, int num2);

  int restar(int num1, int num2);
  
}
