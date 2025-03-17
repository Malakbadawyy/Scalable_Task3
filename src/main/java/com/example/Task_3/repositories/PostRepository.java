package com.example.Task_3.repositories;

import com.example.Task_3.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByAuthorId(String authorId); // Custom query method to get posts by author ID
}
