/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_objetos;

/**
 *
 * @author ricar
 */
public class AccesoObjetos {
    
    private String usuario ="TuUsuario";
    private String clave="123";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String Clave) {
        this.clave = Clave;
    }
   
    // metodo para llamar el objeto y devolver el objeto 
    public void accesoLo(AccesoObjetos accesoObjetos){
        if(accesoObjetos.usuario.equals(usuario) && accesoObjetos.clave.equals(clave)){
            System.out.println("Bienvenido al sistema colega");
        }
        
    }
    
    
    public AccesoObjetos getRespuesta(){
        AccesoObjetos accesoObjetos = new AccesoObjetos();
        accesoObjetos.setUsuario(usuario);
        accesoObjetos.setClave(clave);
        return accesoObjetos;
    }
    
    
    
}

