package lk.ac.vau.Model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
	
	private String courseid;
	private String coursename;
	private int credit;
	
	public Course() {
	}
	
	public Course(String courseid, String coursename, int credit) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.credit = credit;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
	
	
	
}
