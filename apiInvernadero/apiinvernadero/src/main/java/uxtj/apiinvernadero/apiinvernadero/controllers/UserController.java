package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.User;
import uxtj.apiinvernadero.apiinvernadero.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/invernadero/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Método GET para obtener todos los usuarios
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Método POST para agregar un nuevo usuario
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Método PUT para actualizar un usuario existente
    @PutMapping("/{id_user}")
    public User updateUser(@PathVariable Long id_user, @RequestBody User updatedUser) {
        return userService.updateUser(id_user, updatedUser);
    }

    // Método DELETE para eliminar un usuario por su ID
    @DeleteMapping("/{id_user}")
    public void deleteUser(@PathVariable Long id_user) {
        userService.deleteUser(id_user);
    }
}
