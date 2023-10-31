package Controlador;

import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador_login implements ActionListener { //
    
    private Login login;
    
    public controlador_login(Login login){  //conexion del controlador con la interfaz Login
        this.login=login;
        this.login.btnEntrar.addActionListener(this); //se detecta el boton para ejecutar las acciones correspondientes
        this.login.btnSalir.addActionListener(this);
        login.setLocationRelativeTo(null);//la ventana queda centralizada
        login.setVisible(true);//se hace visble la ventana
    }
    
    @Override
    public void actionPerformed(ActionEvent l){
        String user = login.txtUsuario.getText(); //ingreso del usuario
        String pass = login.txtClave.getText();//ingresa la contraseña
        if(l.getSource()==login.btnEntrar){ //se debe obtener los datos para entrar
            if(user.isEmpty() || pass.isEmpty()){ //si los campos de usuario y contraseñas estan vacios
                JOptionPane.showMessageDialog(null,"Ingrese usuario y contraseña");// Ventana emergente login
            }
            else{
                if(user.equals("admin") && pass.equals("admin")){ //Usuario y contraseña
                    login.dispose();
                    TablaPrincipal tabla = new TablaPrincipal();                      
                    tabla.setLocationRelativeTo(null);  //centraliza tabla principal
                    tabla.setVisible(true); //se hace visible la tabla principal
                    Agregar agregar = new Agregar(); 
                    agregar.setLocationRelativeTo(null); // se centraliza la ventana que agrega al trabajador
                    System.out.println("Se ingresó como administrador");
                    controlador_tabla ca=  new controlador_tabla(agregar,tabla); 
                       
                }
                else{
                   JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos"); //venatana emergente de contraseña incorrecta
                }
            }
        }
        if(l.getSource()==login.btnSalir){
            login.dispose();
            System.exit(0);              //finalizacion del programa usando el boton salir
            System.out.println("Fin aplicación");
        }
        
    }
}
