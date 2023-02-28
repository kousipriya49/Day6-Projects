package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.Entity.StudentDemo;
import com.example.demo.Repository.StudentRepo;



@Service
public class StudentService {
@Autowired
StudentRepo r;

public StudentDemo updatedetails(StudentDemo e1)
{
return r.saveAndFlush(e1);
}

public void deleteDetails(int id)
{
r.deleteById(id);
}

public String add(StudentDemo m) {
r.save(m);
return "Added";
}

public List<StudentDemo> getDetails() {
return r.findAll();
}

public List<StudentDemo> getSorted(String field) {
return r.findAll(Sort.by(Sort.Direction.ASC,field));
}

public List<StudentDemo> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
Page<StudentDemo> page =r.findAll(PageRequest.of(offset, pageSize));
return page.getContent();
}

}