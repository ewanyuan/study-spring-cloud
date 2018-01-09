package com.ewan.sc.consumer.controller;

import com.ewan.sc.consumer.ms.ProviderClient;
import com.ewan.sc.consumer.ms.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ewan on 08/01/2018.
 */

@RestController
public class MovieController {@Autowired
    private ProviderClient providerClient;

    @GetMapping("/user/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return providerClient.findById(id);
    }
}
