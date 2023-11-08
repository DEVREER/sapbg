public interface RoleRepository extends JpaRepository<Role, Long> {
    // Find a role by its name
    Role findByName(String name);
}
