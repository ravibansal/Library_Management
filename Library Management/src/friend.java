import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class friend implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
List<OutstandingBooks> Books= new ArrayList<OutstandingBooks>();
String name,address,landlineNumber,mobileNumber;
	public void setName(String x){
		name=x;
	}
	public void setAddress(String x){
		address=x;
	}
	public void setlandlineNumber(String x){
		landlineNumber=x;
	}
	public void setmobileNumber(String x){
		mobileNumber=x;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getlandlineNumber(){
		return landlineNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	/*public void setBooklist(ArrayList<OutstandingBooks>Books){
		this.Books=Books;
	}*/
	public void setBook(String x,String y){
		OutstandingBooks Obook=new OutstandingBooks();
		Obook.setDateOfIssue(y);
		Obook.setTitleOfBook(x);
		Books.add(Obook);
	}
	public void returnBook(String x,String y){
		Iterator<OutstandingBooks> ob= Books.iterator();
		while(ob.hasNext()){
			OutstandingBooks user=ob.next();
			if(user.getTitleOfBook().equalsIgnoreCase(x)){
				ob.remove();
				break;
			}
		}
	}
}
