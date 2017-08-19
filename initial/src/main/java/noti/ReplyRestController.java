package noti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by claireyuan on 8/18/17.
 */
@RestController
@RequestMapping("/{post_id}/reply")
public class ReplyRestController {

    private final PostRepository _postRepository;

    @Autowired
    public ReplyRestController(PostRepository postRepository) {
        _postRepository = postRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Reply> getReplies(@PathVariable String postId) {
        return _postRepository.findPostById(postId).getReplies();
    }

    @RequestMapping(method = RequestMethod.POST)
    Post createReply(@PathVariable String postId, @RequestBody Reply reply) {
        Post post =  _postRepository.findPostById(postId);
        List<Reply> replies = _postRepository.findPostById(postId).getReplies();
        replies.add(reply);
        post.setReplies(replies);
        return _postRepository.save(post);
    }


}
