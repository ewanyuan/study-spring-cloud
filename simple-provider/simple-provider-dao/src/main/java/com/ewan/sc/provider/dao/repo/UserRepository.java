package com.ewan.sc.provider.dao.repo;

import com.ewan.sc.provider.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ewan on 08/01/2018.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
