package noti;

import com.sun.org.apache.regexp.internal.REProgram;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by claireyuan on 8/18/17.
 */
@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "reply", path = "reply")
public interface ReplyRepository extends MongoRepository<Reply, String> {

    List<Post> findByReplyId(@Param("id") String id);

}
