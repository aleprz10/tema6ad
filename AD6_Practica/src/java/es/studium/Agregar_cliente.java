/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.studium;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Alejandro
 */
public class Agregar_cliente extends ActionSupport{//Clase Agregar_cliente que realiza la acción extendiendo de ActionSupport

private String Identificador;
private String Contrasena;

    public String getIdentificador() {
        return Identificador;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }


public Agregar_cliente(){

}
@Override
public String execute() throws Exception{
return SUCCESS;
}
}
