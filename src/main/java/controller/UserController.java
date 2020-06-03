package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import model.User;
import springbootpart3.UserService;


@RestController
@RequestMapping("api")
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user.getId(),user.getName(),user.getSurname());
    }

    @GetMapping("/getUser/{ID}")
    public String getUser(@PathVariable long ID){
        return userService.getUser(1);
    }

    @DeleteMapping("/deleteUser/{ID}")
    public String removeUser(@PathVariable long ID){
        return userService.removeUser(1);
    }

}
