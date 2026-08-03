package CoreJava.ArchitecturalPatterns;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// Model class representing a simple User entity
class UserModel {
    private StringProperty username = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
}

// ViewModel class that bridges between Model and View
class UserViewModel {
    private UserModel model;

    public UserViewModel(UserModel model) {
        this.model = model;
    }

    public String getUsername() {
        return model.getUsername();
    }

    public void setUsername(String username) {
        model.setUsername(username);
    }

    public String getEmail() {
        return model.getEmail();
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }
}

// Main class to demonstrate MVVM pattern
public class MVVMExample {
    public static void main(String[] args) {
        // Create a UserModel
        UserModel model = new UserModel();

        // Create a UserViewModel and associate it with the UserModel
        UserViewModel viewModel = new UserViewModel(model);

        // Set user details through ViewModel
        viewModel.setUsername("jane_smith");
        viewModel.setEmail("jane.smith@example.com");

        // Display user details directly from the model
        System.out.println("Username: " + model.getUsername()); // Output: Username: jane_smith
        System.out.println("Email: " + model.getEmail()); // Output: Email: jane.smith@example.com
    }
}
