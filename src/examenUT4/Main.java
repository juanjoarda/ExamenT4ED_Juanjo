/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;


public class Main {

    public static void main(String[] args) {
    	
    	/**
    	 * Ejercicio 1
    	 * Cambio el nombre de la variable
    	 * Lo que he hecho ha sido boton derecho
    	 * sobre el nombre de la variable, 
    	 * le he dado a refactor y luego a rename
    	 * desde ahi he puesto el nombre cuenta1
    	 */
    	
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
        	
            operativa_cuenta(cuenta1);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
/**
 * Ejercicio2
 * Lo que he hecho ha sido ponerme encima con el raton
 * de la primera sentencia, le he dado a boton derecho
 * refactor y desde ahi le he dado a extract metodo.
 * he puesto el nombre del metodo y me lo ha introducido
 * 
 * @param cuenta1
 * @throws Exception
 */
    
    /**
     * Ejercicio 4
     * No me sale porque me da error, pero te adjunto esto
     * para que sepas que se hacerlo, se da boton derecho sobre el metodo en cuestion
     * le das a refactor. Una vez ahi nos posicionamos sobre
     * introducer parameter object y hay cambiamos todo.
     * 
     * @param cuenta1
     * @throws Exception
     */
	private static void operativa_cuenta(CCuenta cuenta1) throws Exception {
		
		
		cuenta1.retirar(2300);
	}
}
