/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectodni;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {

    static String pedirDNI() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el DNI");
        String dni=sc.nextLine();
        return dni;
    }
    
}
