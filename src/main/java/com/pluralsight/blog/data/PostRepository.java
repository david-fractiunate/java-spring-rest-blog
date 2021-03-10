package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pluralsight.blog.model.Post;


public interface PostRepository extends JpaRepository<Post, Long> {
	@RestResource(rel="contains-title", path="containstitle")
	public List<Post> findByTitleContaining(String title);
	
}



//@Component
//public class PostRepository {
//    public List<Post> findAll() {
//        return new ArrayList<>();
//    }
//
//    public List<Post> saveAll(List<Post> posts) {
//        return new ArrayList<>();
//    }
//
//    public Post save(Post post) {
//        return null;
//    }
//
//    public Optional<Post> findById(Long id) {
//        return null;
//    }
//}