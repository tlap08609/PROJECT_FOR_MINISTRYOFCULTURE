package co_name.model;

public class Coname {
	private long no;
    String coName;
    
    
	public Coname() {
		super();
	}
	public Coname(long no, String coName) {
		super();
		this.no = no;
		this.coName = coName;
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


    
}
