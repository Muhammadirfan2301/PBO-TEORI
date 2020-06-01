/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper_dan_final;

/**
 *
 * @author IRFAN
 */
public class WrapperClass {
     public static void main(String[] args){
        
        /* Menginstansi Objek Dari Wrapper Class Dan
         * Menggunakan Argumen Dari Tipe Data Primitif
         */
        
        Character objChar = new Character('W');
        Byte objByte = new Byte("12");
        Short objShort = new Short("100");
        Integer objInt = new Integer(523);
        Long objLong = new Long(7689);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(82.89f);
        Double objDouble = new Double(34.67);
        
        //Menampilkan Output dari Class Wrapper
        System.out.println("Character: "+objChar);
        System.out.println("Byte: "+objByte);
        System.out.println("Short: "+objShort);
        System.out.println("Integer: "+objInt);
        System.out.println("Long: "+objLong);
        System.out.println("Boolean: "+objBoolean);
        System.out.println("Float: "+objFloat);
        System.out.println("Double: "+objDouble);
    }
}

