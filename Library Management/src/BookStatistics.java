import java.io.Serializable;
public class BookStatistics implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String dateOfIssue,dateOfReturn,name;
	public void setDateOfIssue(String x){
		dateOfIssue=x;
	}
	public void setDateOfReturn(String x){
		dateOfReturn=x;
	}
	public void setName(String x){
		name=x;
	}
	public String getDateOfIssue(){
		return dateOfIssue;
	}
	public String getDateOfReturn(){
		return dateOfReturn;
	}
	public String getName(){
		return name;
	}
}
