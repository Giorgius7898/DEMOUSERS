package DemoUserMVC;
import java.util.Scanner;
public class UserView {
    public void printUserDetails(User user){
        System.out.println("\nDetalles del usuario:");
        System.out.println("nombre de usuario: "+user.getUsername());
        System.out.println("Contraseña: "+user.getPassword());
        System.out.println("Dirección de correo electrónico: "+user.getEmail());
    }

    public String getInput(String message){
        System.out.println((message));
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void displayMenu(){
        System.out.println("\nMenú:");
        System.out.println("1. Crear usuario");
        System.out.println("2. Consultar usuario");
        System.out.println("3. Modificiar usuario");
        System.out.println("4. Eliminar usuario");
        System.out.println("5. Salir");
        System.out.print("Elige una opción:");
    }
}
