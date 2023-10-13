package DemoUserMVC;

public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void run(){
        boolean keepRunning = true;

        while (keepRunning){
            view.displayMenu();
            String option = view.getInput("");

            switch (option){
                case "1":
                    createUser();
                    break;
                case "2":
                    consultUser();
                    break;
                case "3":
                    modifyUser();
                    break;
                case "4":
                    deleteUser();
                    break;
                case "5":
                    keepRunning = false;
                    break;
                default:
                    view.showMessage("opción no válida.");
            }
        }
        view.showMessage("Hasta pronto!");
    }

    private void createUser(){
        String username = view.getInput("Introduce el nombre de usuario: ");
        String password = view.getInput("Introduce la contraseña: ");
        String email = view.getInput("Introduce la dirección de correo electrónico: ");

        model.addUser(new User(username, password, email));
        view.showMessage("Usario creado exitosamente.");
    }

    private void consultUser(){
        String username = view.getInput("Introduce el nombre de usuario a consultar: ");
        User user = model.getUserByUsername(username);
        if (user != null){
            view.printUserDetails(user);
        } else {
            view.showMessage("Usario no encontrado.");
        }
    }

    private void modifyUser(){
        String username = view.getInput("Introduce el nombre de usuario a modificar: ");
        User user = model.getUserByUsername(username);
        if (user != null){
            String newEmail = view.getInput("Introduce la nueva dirección de correo electrónico (Actual: "+ user.getEmail() + "): ");
            user.setEmail(newEmail);
            view.showMessage("Usuario modificado exitosamente.");
        }else {
            view.showMessage("Usuario no encontrado.");
        }
    }

    private void deleteUser(){
        String username = view.getInput("Introduce el nombre de usuario a eliminar: ");
        User user = model.getUserByUsername(username);
        if (user != null){
            model.deteleUser(user);
            view.showMessage("Usuario eliminado exitosamente.");
        }else {
            view.showMessage("Usuario no encontrado.");
        }
    }
}
