/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author docente
 */
public class Operations {
    public int num1;
    public int num2;
    
    public boolean sumEven(){
        Sum suma = new Sum();
        int result = suma.suma(this.num1,this.num2);
        
        return result % 2 == 0;
    }
    
}
