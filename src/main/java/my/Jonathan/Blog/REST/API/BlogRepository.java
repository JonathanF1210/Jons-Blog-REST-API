package my.Jonathan.Blog.REST.API;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<Blogs, ObjectId> {
    Blogs findByTitle(String title);
}