/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_objetos;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Login_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario ="";
        String clave = "";
        int intentos=0;
        AccesoObjetos accesoObjetos = new AccesoObjetos();
        OperacionesMatematicas operacionesmatematicas = new OperacionesMatematicas();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Ingrese el usuario: ");
            usuario = sc.nextLine();
            accesoObjetos.setUsuario(usuario);
            System.out.print("Ingrese la clave: ");
            clave = sc.nextLine();
            accesoObjetos.setClave(clave);
            if(usuario.equals("TuUsuario") && clave.equals("123")){
                accesoObjetos.accesoLo(accesoObjetos);
                break;
            }else{
                System.out.println("Que paso mi master?");
            }
            intentos++;
            
        }while(intentos<3);
        
        
        System.out.println("*****Menu*****");
        System.out.println("1. Operaciones matematicas");
        System.out.println("2. Transacciones.");
        System.out.print("Ingrese una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
                System.out.print("Ingrese el primer numero: ");
                int num1 = sc.nextInt();
                operacionesmatematicas.setNum1(num1);
                System.out.print("Ingrese el segundo numero: ");
                int num2 = sc.nextInt();
                operacionesmatematicas.setNum2(num2);
                System.out.println("****MENU****");
                System.out.println("1. suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.print("Ingrese la opcion: ");
                int opcion2 = sc.nextInt();
                sc.nextLine();
                switch(opcion2){
                    case 1:
                        operacionesmatematicas.setSuma(operacionesmatematicas);
                    break;
                    case 2:
                        operacionesmatematicas.setResta(operacionesmatematicas);
                        break;
                    case 3:
                        operacionesmatematicas.setMulti(operacionesmatematicas);
                        break;
                    case 4:
                        operacionesmatematicas.setDivision(operacionesmatematicas);
                        break;
                    default:
                        System.out.println("No existe la opcion "+opcion2);
                }
                System.out.println("El resultado de la operacion "+opcion2+" es "+operacionesmatematicas.getResultado());
                break;
            case 2:
                System.out.println("XD");
                break;
            default:
        }
        
    }
    
}
