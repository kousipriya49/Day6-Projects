package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.StudentDemo;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {


@Autowired
StudentService s;

@PutMapping("/updateDetails")
public StudentDemo  updateInfo(@RequestBody StudentDemo st1)
{
return s.updatedetails(st1);
}

@DeleteMapping("/delete/{id}")
public String deleteInfo(@PathVariable("id") int id)
{
s.deleteDetails(id);
return "Deleted details";
}

@GetMapping("/get")
public List<StudentDemo> showDetails() {
return s.getDetails();

}

@PostMapping("/post")
public String addDetails(@RequestBody StudentDemo m) {
s.add(m);
return "Added product " + m.getId();

}

//sorting
@GetMapping("/product/{field}")
public List<StudentDemo> getWithSort(@PathVariable String field) {
return s.getSorted(field);
}

// pagination
@GetMapping("/product/{offset}/{pageSize}")
public List<StudentDemo> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
return s.getWithPagination(offset, pageSize);
}
}
