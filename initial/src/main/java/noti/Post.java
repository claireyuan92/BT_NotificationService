package noti;

import org.springframework.data.annotation.Id;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        if (replies == null) {
            this.replies = new ArrayList<>();
        }
        this.replies = replies;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

//    {
//	“_id”: ObjectId(),
//	“courseId”: reference,
//“tags”: [],
//“subject”: string,
//“content”: string,
//“userId”: reference,
//“userName”: string,
//“publishedTime”: datetime,
//“updatedTime”: datetime,
//“replies”: [
//        {
//	“replyId”: ObjectId(),
//	“content”: string,
//	“userId”: reference,
//	“userName”: string,
//	“Timestamp”: datetime
//        }
//]
//    }


    class Reply {
        @Id private String replyId;
        private String content;
        private String userId;
        private String userName;
        private String timestamp;


        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getReplyId() {
            return replyId;
        }

        public void setReplyId(String replyId) {
            this.replyId = replyId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = this.timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());;
        }
    }

    @Id private String id;

    private String courseId;
    private String courseName;
    private List<String> tags = new ArrayList<>();
    private String subject;
    private String content;
    private String userId;
    private String userName;
    private String publishedTime;
    private String updatedTime;
    private List<Reply> replies = new ArrayList<>();


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {

        this.publishedTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }


}
