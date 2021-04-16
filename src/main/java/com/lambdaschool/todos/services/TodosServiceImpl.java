package com.lambdaschool.todos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    private TodosService todosService;

    @Override
    public void markComplete(long todoid) {
        
    }
}
