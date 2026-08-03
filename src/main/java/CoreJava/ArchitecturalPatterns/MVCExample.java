package CoreJava.ArchitecturalPatterns;

// Model class representing a simple User entity
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

// View class responsible for displaying user information
class UserView {
    public void displayUserDetails(String username, String email) {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

// Controller class that acts as an intermediary between Model and View
class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayUserDetails(model.getUsername(), model.getEmail());
    }
}

// Main class to demonstrate MVC pattern
public class MVCExample {
    public static void main(String[] args) {
        // Create a User model
        User user = new User("john_doe", "john.doe@example.com");

        // Create a UserView
        UserView view = new UserView();

        // Create a UserController and associate it with the User model and UserView
        UserController controller = new UserController(user, view);

        // Update and display user details
        controller.updateView();
        // Output:
        // Username: john_doe
        // Email: john.doe@example.com
    }
}