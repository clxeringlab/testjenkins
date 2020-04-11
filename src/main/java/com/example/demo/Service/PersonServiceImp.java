package com.example.demo.Service;


import com.example.demo.dao.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonSercive {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> selectAll() {
        return personMapper.selectAll();
    }
}
