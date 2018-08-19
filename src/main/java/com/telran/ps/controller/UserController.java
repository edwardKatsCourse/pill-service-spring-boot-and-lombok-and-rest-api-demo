package com.telran.ps.controller;

import com.telran.ps.model.User;
import com.telran.ps.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

//    @PutMapping("/{id}")
//    public User update(@RequestBody User user, @PathVariable("id") Long id) {
//
//    }

//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") Long id) {
//
//    }























    @SneakyThrows
    public static void test() {

        User user = User
                .builder()
                .firstName("David")
                .lastName("Smith")
                .age(99)
                .id(1L)
//                .favouriteMusic("AC/DC")
//                .favouriteMusic("Deep Purple")
//                .favouriteMusic("Boney M")
                .build();

        System.out.println(user.toString());

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        fileInputStream.read();
        new URL("google.com").openConnection();
        Thread.sleep(1000);

    }

    public static void main(String[] args) {
        test();
    }
}
