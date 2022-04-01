package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.UserService.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/add")
    public String addPage() {
        return "/addPage";
    }

    @PostMapping(value = "/add")
    public String addNewUser(@RequestParam(value = "name") String name,
                             @RequestParam(value = "lastName") String lastName
                             ) {
        userService.addUser(new User(name, lastName));
        return "redirect:/users";
    }

    @GetMapping("/users")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap){
        modelMap.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping("/users")
    public String getAllUsers(ModelMap modelMap){
        modelMap.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping(value = "users/edit")
    public String editUser(@ModelAttribute User user) {
        userService.editUser(user);
        return "redirect:/users";
    }

    @GetMapping(value = "users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
