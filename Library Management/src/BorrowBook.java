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
public class BorrowBook implements Serializable{
    String bookTitle,dateOfBorrow,dateOfReturn,fnd;
    int issued=0;
    public void setIssued(){
        issued=1;
    }
    public boolean isIssued(){
        if(issued==1)
            return true;
        else
            return false;
    }
    public void setTitle(String name) {
        bookTitle = name;
    }
    public void setFriend(String name){
        fnd=name;
    }
    public void setdob(String name){
        dateOfBorrow=name;
    }
    public void returnBook(String name){
        dateOfReturn=name;
        issued=0;
    }
    public String getTitle(){
        return bookTitle;
    }
    public String getFriend(){
        return fnd;
    }
    public String getdob(){
        return dateOfBorrow;
    }
    public String getdor(){
        return dateOfReturn;
}
}
