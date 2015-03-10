import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class IssueBook extends Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String bookTitle, yearofpublication, dop, price, publisher,borrower,dateOfIssue;
	int id,flag,issued=0;
	int countissued=0;
	public void setTitle(String name) {
		bookTitle = name;
	}
	public void setYearOfPublication(String yop) {
		yearofpublication = yop;
	}
	public void setDop(String date) {
		dop = date;
	}
	public void setPrice(String x) {
		price = x;
	}
	public void setPublisher(String x) {
		publisher = x;
	}
	public String getTitle() {
		return bookTitle;
	}
	public String getYearOfPublication() {
		return yearofpublication;
	}
	public String getDop() {
		return dop;
	}
	public String getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setId(int x) {
		id=x;
	}
	public int getId() {
		return id;
	}
	public void setType(int x) {
		flag=x;
	}
	public int getType() {
		return flag;
	}
	public boolean ifissueable(){
		if(flag==0)
			return true;
		else
			return false;
	}
	public void setBorrower(String x){
		borrower=x;
		countissued++;
		issued=1;
	}
	public void setDateOfIssue(String x){
		dateOfIssue=x;
	}
	public String getDateOfIssue(){
		return dateOfIssue;
	}
	public String getBorrower(){
		return borrower;
	}
	public boolean ifIssued(){
		if(issued==1)
			return true;
		else
			return false;
	}
	public int getCountIssued(){
		return countissued;
	}
	List<BookStatistics> Books= new ArrayList<BookStatistics>();
	public void setStatistics(String x){
		BookStatistics Object=new BookStatistics();
		Object.setName(getBorrower());
		Object.setDateOfIssue(getDateOfIssue());
		Object.setDateOfReturn(x);
		Books.add(Object);
		issued=0;
	}
	/*public void display() {
		System.out.printf("Book Id: %d\n",getId());
		System.out.printf("Book Title: %s\n",getTitle());
		System.out.printf("Year Of Publication: %s\n",getYearOfPublication());
		System.out.printf("Date Of Purchase: %s\n",getDop());
		System.out.printf("Price : %s\n",getPrice());
		System.out.printf("Publisher : %s\n",getPublisher());
		System.out.println("#########");
	}*/
	
}
