package com.marcin.load;

import com.marcin.model.Users;
import com.marcin.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 18.04.17.
 */
@Component
public class Loaders {

    @Autowired
    public ElasticsearchOperations operations;


    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Users.class);
        System.out.println("Loading Data");
        usersRepository.save(getData());


    }

    private List<Users> getData() {
        List<Users> userses =new ArrayList<>();
        userses.add(new Users("Marcin", 123L,"Accounting", 12000L));
        userses.add(new Users("Marcin", 123L,"Accounting", 12000L));
        userses.add(new Users("Marcin", 123L,"Accounting", 12000L));
        return userses;
    }
}
