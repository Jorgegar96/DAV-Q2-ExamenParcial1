/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserState;

/**
 *
 * @author jorge
 */
public class User {
    
    public void login(){
        System.out.println("Usuario Autenticado");
    }
    
    public void createProduct(){
        System.out.println("Producto creado");
    }
    
    public void modifyProduct(){
        System.out.println("Producto modificado");
    }
    
    public void deleteProduct(){
        System.out.println("Producto eliminado");
    }
    
    public void listProducts(){
        System.out.println("Productos listados");
    }
    
    public void visualizeProduct(){
        System.out.println("Producto visualizado");
    }
    
    public void requestUpgrade(){
        System.out.println("Se ha enviado una solicitud para más acceso");
    }
    
    public void logout(){
        System.out.println("Sesión Cerrada");
    }
    
    public void loginDenied(){
        System.out.println("Usuario deshabilitado, no se puede autenticar");
    }
}
