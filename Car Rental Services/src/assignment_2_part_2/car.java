/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_part_2;

/**
 *
 * @author ravibansal
 */
import java.io.*;
public class car implements Serializable{
    String name,edrdd,edrmm,edryy,edrh,edrm;
    int id,pkc,phc,type,state,expense=0,milemeter1,milemeter2,advance,t1,t2;
    public void setName(String x){
        name=x;
    }
    public void setType(int x){
        type=x;
    }
    public int getType(){
        return type;
    }
    public void setPkc(int x){
        pkc=x;
    }
    public void setPhc(int x){
        phc=x;
    }
    public void setId(int x){
        id=x;
    }
    public String getName(){
        return name;
    }
    public boolean isAc(){
        if(type==1)
            return true;
        else
            return false;
    }
    public int getPkc(){
        return pkc;
    }
    public int getPhc(){
        return phc;
    }
    public int getId(){
        return id;
    }
    public void setState(int x){
        state=x;
    }
    public int getState(){
        return state;
    }
    public void setExpense(int x){
        expense+=x;
    }
    public void setMilemeter1(int x){
        milemeter1=x;
    }
    public void setMilemeter2(int x){
        milemeter2=x;
    }
    public void setAdvance(int x){
        advance =x;
    }
    public int getMilemeter1(){
        return milemeter1;
    }
    public int getMilemeter2(){
        return milemeter2;
    }
    public int getAdvance(){
        return advance;
    }
    public void setEDR(String x,String y,String z,String w,String p){
        edrdd=x;
        edrmm=y;
        edryy=z;
        edrh=w;
        edrm=p;
    }
    public void setTime1(int x){
        t1=x;
    }
    public void setTime2(int x){
        t2=x;
    }
    public int getTime1(){
        return t1;
    }
    public int getTime2(){
        return t2;
    }
}
