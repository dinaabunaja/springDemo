package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping (path="api/user")
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Users> listuser = userService.listAll();
        model.addAttribute("liststudent", listuser);
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("User", new Users());
        return "new";
    }


    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Users usr = userService.get(id);
        mav.addObject("student", usr);
        return mav;

    }

    @DeleteMapping (path= "/delete/{id}")
    public String deleteuser(@PathVariable(name = "id")Integer id){
        userService.delete(id);
        return "redirect:/";

    }
}
