/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.*;
import Vista.*;

public class Main {


    public static void main(String[] args) {
        Login login= new Login();   
        controlador_login cl = new controlador_login(login);
    }
    
}
