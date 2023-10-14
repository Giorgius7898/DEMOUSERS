package DemoUserMVC;
import javax.swing.*;
import java.util.Scanner;
public class UserView {
    public void printUserDetails(User user){
        System.out.println("\nDetalles del usuario:");
        String message ="";
        message += "Username: " + user.getUsername()+"\n";
        message += "Password: " + user.getPassword()+"\n";
        message += "Email: " +user.getEmail()+"\n";
        JOptionPane.showMessageDialog(null, message);
    }

    public String getInput(String message){
        return JOptionPane.showInputDialog(null, message);
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public String displayMenu(){
        String message = "";
        message += "\nMenú:\n";
        message +="\n";
        message +="1. Crear usuario \n";
        message +="2. Consultar usuario \n";
        message +="3. Modificiar usuario\n";
        message +="4. Eliminar usuario\n";
        message +="5. Salir\n";
        message +="\n";
        message +="Elige una opción:\n";
        message +="\n";
        return JOptionPane.showInputDialog(null,message);
    }
}
