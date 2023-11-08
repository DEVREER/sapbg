@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User data is required.");
        }
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username is required.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw an IllegalArgumentException("Password is required.");
        }
        if (!user.getUsername().matches("^[a-zA-Z0-9]*$")) {
            throw new IllegalArgumentException("Username can only contain letters and numbers.");
        }
        if (user.getUsername().length() < 4 || user.getUsername().length() > 20) {
            throw new IllegalArgumentException("Username must be between 4 and 20 characters.");
        }
        if (user.getPassword().length() < 12) {
            throw new IllegalArgumentException("Password must be at least 12 characters.");
        }
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("Username is already taken.");
        }

        return userRepository.save(user);
    }


    @Override
    public User assignRole(User user, String roleName) {
        if (user == null) {
            throw new IllegalArgumentException("User is required.");
        }
        if (roleName == null || roleName.isEmpty()) {
            throw new IllegalArgumentException("Role name is required.");
        }

        Role role = roleRepository.findByName(roleName);

        if (role == null) {
            throw new IllegalArgumentException("Role not found: " + roleName);
        }
        if (user.getRoles().contains(role)) {
            throw new IllegalArgumentException("User already has the role: " + roleName);
        }

        // Validation: Check if the user already has the "Admin" role before assigning other roles.
        if (roleName.equals("Admin") && !user.getRoles().stream().anyMatch(r -> r.getName().equals("Admin"))) {
            throw new IllegalArgumentException("User must have the 'Admin' role to assign other roles.");
        }

        // We can add more custom validations.

        user.getRoles().add(role);
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username is required.");
        }
        if (username.length() < 4 || username.length() > 20) {
            throw new IllegalArgumentException("Username must be between 4 and 20 characters.");
        }

        // We can add more custom validations.

        return user;
    }
}
