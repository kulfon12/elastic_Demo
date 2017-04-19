package com.marcin.repository;

import com.marcin.model.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by abc on 19.04.17.
 */
public interface UsersRepository  extends ElasticsearchRepository<Users, Long>{




}
