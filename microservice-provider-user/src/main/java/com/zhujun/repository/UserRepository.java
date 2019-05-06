package com.zhujun.repository;

import com.zhujun.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * className: UserRepository
 * create by: zhujun
 * create time: 2019/3/12 15:22
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
}
