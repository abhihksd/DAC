package entites;

public class Comment {
 int cid;
 String text,uid;
 int topicid;
 
 
public Comment() {

}

public Comment(int cid, String text, int topicid, String uid) {
	super();
	this.cid = cid;
	this.text = text;
	this.uid = uid;
	this.topicid = topicid;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String getUid() {
	return uid;
}

public void setUid(String uid) {
	this.uid = uid;
}

public int getTopicid() {
	return topicid;
}

public void setTopicid(int topicid) {
	this.topicid = topicid;
}

 
 
}
