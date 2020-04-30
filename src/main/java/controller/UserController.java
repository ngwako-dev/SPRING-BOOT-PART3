package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springbootpart3.User;
import springbootpart3.UserService;

import javax.lang.model.element.Name;

@RestController
@RequestMapping("api")

public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getUser")
    public String getUser(@PathVariable long ID){
        return userService.getUser(ID);
    }

    @DeleteMapping("/delete")
    public String removeUser(@PathVariable long ID){
        return userService.removeUser(ID);
    }


    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user.getId(),user.getName(),user.getSurname());
    }


}
