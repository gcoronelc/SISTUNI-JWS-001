/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author GustavoCoronel
 */
@Stateless
public class EJBMath implements EJBMathLocal {

  @Override
  public int sumar(int num1, int num2) {
    int suma;
    suma = num1 + num2;
    return suma;
  }

    // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")
  @Override
  public int restar(int num1, int num2) {
    int resta;
    resta = num1 - num2;
    return resta;
  }
}
