import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class UserAPI {

    // Implementando as operações CRUD básicas

    @PostMapping
    public String createUser(@RequestBody User user) {
        // Lógica para criar um novo usuário
        return "User created successfully";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // Lógica para recuperar um usuário pelo ID
        return new User(); // Retornar um usuário de exemplo
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        // Lógica para atualizar um usuário pelo ID
        return "User updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Lógica para excluir um usuário pelo ID
        return "User deleted successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserAPI.class, args);
    }
}

class User {
    // Definindo os campos de um usuário
    private Long id;
    private String name;
    private String email;

    // Getters e Setters
}