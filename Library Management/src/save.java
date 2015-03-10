/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravibansal
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class save implements Serializable{
    private static final long serialVersionUID = 1L;
	List<IssueBook> BookList= new ArrayList<IssueBook>();
	List<friend> FriendList= new ArrayList<friend>();
	List<BorrowBook> BorrowList= new ArrayList<BorrowBook>();
        int counter=0;
	IssueBook BookObject=new IssueBook();
   public static void main(String args[])throws IOException
   {
   }
}
        
   
  
