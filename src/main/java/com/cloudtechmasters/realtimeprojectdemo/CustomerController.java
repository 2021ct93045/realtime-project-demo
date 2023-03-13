package com.cloudtechmasters.realtimeprojectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@Slf4
public class CustomerController {
    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){    
        log.info("good  code check SonarQube");
        Customer customer1=new Customer(100,"sachin");
        Customer customer2=new Customer(200,"ashish");
        return Arrays.asList(customer1,customer2);
    }
}
