package com.techblog.repository;

import com.techblog.model.Post;
import com.techblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepoitory extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);
}
