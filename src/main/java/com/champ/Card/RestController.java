package com.champ.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class RestController {
    @Autowired
    private Dao dao;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) {
        return (dao.findById(id).get());
    }

}
