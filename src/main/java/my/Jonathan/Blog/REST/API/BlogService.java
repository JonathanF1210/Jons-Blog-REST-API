package my.Jonathan.Blog.REST.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blogs> allBlogs(){
        return blogRepository.findAll();

    }

    public void createPost(Blogs post) {blogRepository.save(post);}
}
