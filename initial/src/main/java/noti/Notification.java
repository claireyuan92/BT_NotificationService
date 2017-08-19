package noti;

import org.springframework.data.annotation.Id;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Notification {

    public Notification() throws MalformedURLException {
    }

    public String getExpirationTime() {
        return expirationTime == null ? new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(Long.MAX_VALUE)) : expirationTime;
    }

    public void setExpirationTime(String userInputexpirationTime) {
        this.expirationTime = userInputexpirationTime == null ? new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(Long.MAX_VALUE)) : userInputexpirationTime;
    }

    // {
//     “_id”: ObjectId(),
//     “courseId”: reference,
//     “courseName”: reference,
//     “userId”: string,
//     “userName”: string,
//     “priority”: string,
//     “subject”: string,
//     “content”: string,
//     “timestamp”: datetime,
//     “link”: url,
//     “readers”: [
//     {
//     “studentId”: reference,
//     “studentName”: string,
//     “hasRead”: boolean, default false
// }
// ]
// }
    class Reader {
        String _studentId;
        String _studentName;
        boolean _hasRead = false;

        public void setHasRead(boolean hasRead) {
            _hasRead = hasRead;
        }

        public boolean getHasread() {
            return _hasRead;
        }
    }

    @Id
    private String id;

    private String courseId;
    private String courseName;
    private String userId;
    private String userName;
    private String priority;
    private String subject;
    private String content;
    private String timestamp;
    private String expirationTime;
    private String link = "";
    private List<Reader> readers = new ArrayList<>();

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public String getTimestamp() {

        return timestamp == null ? new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) : timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) throws MalformedURLException {
        if (link == null) {
            this.link = "";
        }
        this.link = link;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        if (readers == null) {
            this.readers = new ArrayList<>();
        }
        this.readers = readers;
    }


}
