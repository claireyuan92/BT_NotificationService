package noti;

import org.springframework.data.annotation.Id;

import java.net.URL;
import java.util.List;

public class Notification {

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

        public void setHasRead(boolean hasRead){
            _hasRead = hasRead;
        }
        public boolean getHasread() {
            return _hasRead;
        }
    }

    @Id private String id;

    private String courseId;
    private String courseName;
    private String userId;
    private String userName;
    private String priority;
    private String subject;
    private String content;
    private String timestamp;
    private URL link;
    private List<Reader> readers;

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
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }


}
