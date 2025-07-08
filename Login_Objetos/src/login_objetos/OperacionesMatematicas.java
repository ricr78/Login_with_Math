/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_objetos;

/**
 *
 * @author ricar
 */
public class OperacionesMatematicas {
    private int num1;
    private int num2;
    private int resultado;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void setSuma(OperacionesMatematicas operacionesmatematicas){
        resultado = operacionesmatematicas.getNum1()+operacionesmatematicas.getNum2();
    }
    
    public void setResta(OperacionesMatematicas operacionesmatematicas){
        resultado = operacionesmatematicas.getNum1()-operacionesmatematicas.getNum2();
    }
    public void setMulti(OperacionesMatematicas operacionesmatematicas){
        resultado = operacionesmatematicas.getNum1()*operacionesmatematicas.getNum2();
    }
    
    public void setDivision(OperacionesMatematicas operacionesmatematicas){
        resultado = operacionesmatematicas.getNum1()/operacionesmatematicas.getNum2();
    }
    
    public OperacionesMatematicas getResultados(){
        OperacionesMatematicas operacionesmatematicas;
        operacionesmatematicas = new OperacionesMatematicas();
        operacionesmatematicas.setResultado(resultado);
        return operacionesmatematicas;
    }
}
