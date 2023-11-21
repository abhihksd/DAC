package collection_framework_II.mails;

import java.time.LocalDateTime;

public class Mail {
	private long mailid;
	private String sub;
	private String body;
	private LocalDateTime time;
	public Mail()
	{
		mailid=0l;
		sub="NA";
		body="NA";
		time=LocalDateTime.now();
		
	}
	public Mail(long mailid, String sub, String body, LocalDateTime time) {
		this.mailid = mailid;
		this.sub = sub;
		this.body = body;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Mail [mailid=" + mailid + ", sub=" + sub + ", body=" + body + ", time=" + time + "]";
	}
	
	

}
