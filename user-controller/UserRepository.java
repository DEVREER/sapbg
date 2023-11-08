public interface UserRepository extends JpaRepository<User, Long> {
    // Find a user by their username
    User findByUsername(String username);
}
