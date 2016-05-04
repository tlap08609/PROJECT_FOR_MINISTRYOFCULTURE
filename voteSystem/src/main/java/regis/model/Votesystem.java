package regis.model;

public class Votesystem {
	private long no;
	String coName;
	String plNo;
    String time;
    String plName;
    String plClass;
    Integer score;
    String comment;
    
    
	public Votesystem() {
		super();
	}
	public Votesystem(long no,String coName,String plNo,String time,  String plName, String plClass
			) {
		super();
		this.no = no;
		this.coName = coName;
		this.plNo = plNo;
		this.time = time;
		this.plClass = plClass;
		this.plName = plName;
	}

	public Votesystem(long no,String coName,String plNo,String time,  String plName, String plClass, 
			int score, String comment) {
		super();
		this.no = no;
		this.coName = coName;
		this.plNo = plNo;
		this.time = time;
		this.plName = plName;
		this.plClass = plClass;
		this.score = score;
		this.comment = comment;
	}
	
	public Votesystem(long no,String coName,String plNo,String time,  String plName, 
			int score, String comment) {
		super();
		this.no = no;
		this.coName = coName;
		this.plNo = plNo;
		this.time = time;
		this.plName = plName;
		this.score = score;
		this.comment = comment;
	}
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	
	public String getplNo() {
		return plNo;
	}
	public void setplNo(String plNo) {
		this.plNo = plNo;
	}
	
	
	public void setTime(String time) {
		this.time = time;
	}

	
	public String getTime() {
		return time;
	}
		
	
	public String getPlClass() {
		return plClass;
	}


	public void setPlClass(String plClass) {
		this.plClass = plClass;
	}


	public String getPlName() {
		return plName;
	}


	public void setPlName(String plName) {
		this.plName = plName;
	}


	public Integer getScore() {
		return score;
	}


	public void setScore(Integer score) {
		this.score = score;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	/*public Votesystem(long key) {
		id = key;
	}
	
	public Votesystem(String memberName, String memberPs, String memberEmail) {
		super();
		this.memberName = memberName;
		this.memberPs = memberPs;
		this.memberEmail = memberEmail;

	}
	
	public Votesystem(long id, String memberName, String memberPs, String memberEmail) {
		super();
		this.id = id;
		this.memberName = memberName;
		this.memberPs = memberPs;
		this.memberEmail = memberEmail;

	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getmemberPs() {
		return memberPs;
	}
	public void setmemberPs(String memberPs) {
		this.memberPs = memberPs;
	}
	public String getmemberEmail() {
		return memberEmail;
	}
	public void setmemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}*/

    
}
