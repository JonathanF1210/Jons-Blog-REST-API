package my.Jonathan.Blog.REST.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/api/v1/blogs")
    public ResponseEntity<List<Blogs>> getAllBlogs(){
        return new ResponseEntity<List<Blogs>>(blogService.allBlogs(), HttpStatus.OK);
    }

    @PostMapping("/api/v1/newPost")
    public ResponseEntity<String> createBlogPost(@ModelAttribute Blogs post) {
        //saves Post object to Database
        blogService.createPost(post);

        return new ResponseEntity<>("Post was created successfully", HttpStatus.CREATED);
    }
}
