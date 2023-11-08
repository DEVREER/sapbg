@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String createUser(@RequestParam String username, @RequestParam String password) {
        try {
            // Create a new user
            User newUser = new User(username, password);
            userService.createUser(newUser);
            return "User successfully created!";
        } catch (IllegalArgumentException e) {
            return "Error creating the user: " + e.getMessage();
        }
    }

    @RequestMapping(value = "/assign-role", method = RequestMethod.POST)
    @ResponseBody
    public String assignRole(@RequestParam String username, @RequestParam String roleName) {
        try {
            // Find the user and assign a role
            User user = userService.findByUsername(username);
            userService.assignRole(user, roleName);
            return "Role assigned successfully!";
        } catch (IllegalArgumentException e) {
            return "Error assigning role: " + e.getMessage();
        }
    }
}
