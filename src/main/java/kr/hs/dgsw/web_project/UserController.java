package kr.hs.dgsw.web_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<User> list(){
        return this.userService.list();
    }

    @GetMapping("/user/{pid}")
    @ResponseBody
    public User view(@PathVariable String pid) {
        return this.userService.view(pid);
    }

    @PostMapping("/user")
    @ResponseBody
    public boolean add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @PutMapping("/user")
    @ResponseBody
    public User update(@RequestBody User user){
        return this.userService.update(user);
    }

    @DeleteMapping("/user/{pid}")
    @ResponseBody
    public boolean delete(@PathVariable String pid){
        return this.userService.delete(pid);
    }
}
