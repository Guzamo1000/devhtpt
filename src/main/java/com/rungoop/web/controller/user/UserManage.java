package com.rungoop.web.controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.rungoop.web.entity.Account;
import com.rungoop.web.entity.Branch;
import com.rungoop.web.entity.User;
import com.rungoop.web.service.BranchService;
import com.rungoop.web.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/managerUser")
public class UserManage {
    @Autowired
    private UserService userService;
    @Autowired
    private BranchService branchService;

    @GetMapping(value="/user")
    public String allUser(Model model,HttpSession session) {
        List<User> listUser=userService.getAllUser();
        
            model.addAttribute("listUser", listUser);
            return "user/userManage";
        

    }
    @GetMapping("/createUser")
    public String createUser(Model model,HttpSession session){
        // User currentUser=(User)session.getAttribute("currentUser");
            User user=new User();
            model.addAttribute("user", user);
            List<Branch> listBranch=branchService.getAllBranch();
            model.addAttribute("listBranch", listBranch);
            return "/user/userCreate";
    }
    @GetMapping("/editUser/{id}")
    public String editUser(@PathVariable long id, Model model,HttpSession session){
        // User currentUser=(User)session.getAttribute("currentUser");
        // if(currentUser.getRole()=="2"){
            User user=userService.getUserById(id);
            model.addAttribute("user", user);
            List<Branch> listBranch=branchService.getAllBranch();
            model.addAttribute("listBranch", listBranch);
            return "user/userEdit";
        // }
        // else{
        //     Account accountNew=new Account();
        //     model.addAttribute("account", accountNew);
        //     return "redirect:/login";
        // }
        

    }
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable long id,HttpSession session){
        userService.deleteUser(id);
        return "redirect:/managerUser/user";
    }
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, HttpSession session){
        userService.saveUser(user);
        return "redirect:/managerUser/user";
    }
    @PostMapping("/editUser/{id}")
    public String editUser(@ModelAttribute("user") User user, @PathVariable long id, Model model, HttpSession session)
    {
        User userUpdate=userService.getUserById(id);
        userUpdate.setId(id);
        userUpdate.setFullName(user.getFullName());
        userUpdate.setAccount(user.getAccount());
        // userUpdate.setPassword(user.getAccount());
        userUpdate.setRole(user.getRole());
        userUpdate.setPhoneNumber(user.getPhoneNumber());
        userUpdate.setBranchId(user.getBranchId());
        userService.saveUser(userUpdate);
        return "redirect:/managerUser/user";
    }
}
