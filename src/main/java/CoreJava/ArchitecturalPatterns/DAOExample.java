package CoreJava.ArchitecturalPatterns;

import java.util.List;

// Model class representing a simple User entity
class User1 {
    private int id;
    private String username;
    private String email;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

// Data Access Object interface for User operations
interface UserDAO {
    void insert(User1 user);
    void update(User1 user);
    void delete(User1 user);
    User1 getById(int id);
    List<User1> getAll();
}

// Concrete implementation of UserDAO using a specific data storage (e.g., database)
class UserDAOImpl implements UserDAO {
    // Implement methods to interact with a database or other persistence mechanism

    @Override
    public void insert(User1 user) {
        // Implementation to insert user into database
    }

    @Override
    public void update(User1 user) {
        // Implementation to update user in database
    }

    @Override
    public void delete(User1 user) {
        // Implementation to delete user from database
    }

    @Override
    public User1 getById(int id) {
        // Implementation to retrieve user by id from database
        return null;
    }

    @Override
    public List<User1> getAll() {
        // Implementation to retrieve all users from database
        return null;
    }
}

// Main class to demonstrate DAO pattern
public class DAOExample {
    public static void main(String[] args) {
        // Example usage of DAO pattern
        UserDAO userDao = new UserDAOImpl();

        // Insert new user
        User1 newUser = new User1();
        newUser.setUsername("new_user");
        newUser.setEmail("new.user@example.com");
        userDao.insert(newUser);

        // Retrieve user by id
        User1 retrievedUser = userDao.getById(1);
        if (retrievedUser != null) {
            System.out.println("Retrieved User: " + retrievedUser.getUsername());
        }
    }
}