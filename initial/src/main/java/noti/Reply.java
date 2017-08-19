package noti;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by claireyuan on 8/18/17.
 */
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