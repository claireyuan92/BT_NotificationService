package noti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by claireyuan on 8/18/17.
 */
@RestController
@RequestMapping("post/{postId}/reply")
public class ReplyRestController {

    private final PostRepository _postRepository;
    private final ReplyRepository _replyRepository;

    @Autowired
    public ReplyRestController(PostRepository postRepository, ReplyRepository replyRepository) {
        _postRepository = postRepository;
        _replyRepository = replyRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Reply> getReplies(@PathVariable String postId) {
        return _postRepository.findPostById(postId).getReplies();
    }

    @RequestMapping(method = RequestMethod.POST)
    Post createReply(@PathVariable String postId, @RequestBody Reply inputReply) {
        Reply reply = _replyRepository.save(inputReply);
        Post post = _postRepository.findPostById(postId);

        List<Reply> replies = _postRepository.findPostById(postId).getReplies();
        replies.add(reply);
        post.setReplies(replies);
        post.setReplyCount(post.getReplyCount() + 1);
        return _postRepository.save(post);
    }


}
