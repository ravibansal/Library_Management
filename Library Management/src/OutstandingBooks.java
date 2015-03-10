import java.io.Serializable;
public class OutstandingBooks implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String dateOfIssue,dateOfReturn,titleOfBook;
	int flag=0;
	public void setDateOfIssue(String x){
		dateOfIssue=x;
	}
	/*public void setDateOfReturn(String x){
		dateOfReturn=x;
		flag=1;
	}*/
	public void setTitleOfBook(String x){
		titleOfBook=x;
	}
	public boolean isReturned(){
		if(flag==0)
			return false;
		else
			return true;
	}
	public String getTitleOfBook(){
		return titleOfBook;
	}
	public String getDateOfIssue(){
		return dateOfIssue;
	}
	public void display(){
		System.out.printf("Title: %s",getTitleOfBook());
		System.out.printf("Date of Issue: %s",getDateOfIssue());
	}
}
