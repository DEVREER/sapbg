public interface UserService {
    // Create a new user
    User createUser(User user);

    // Assign a role to a user
    User assignRole(User user, String roleName);

    // Find a user by their username
    User findByUsername(String username);
}
