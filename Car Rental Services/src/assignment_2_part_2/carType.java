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
public class carType implements Serializable{
String name;
int expense=0,fuel=0,kilometer=0,revenue=0,demand=0,pkc,phc,ac=0,nonac=0,tac=0,tnonac=0,price;
     public void setName(String x){
        name=x;
    }
      public void setExpense(int x){
        expense+=x;
    }
      public void setFuel(int x){
          fuel+=x;
      }
      public void setKilometer(int x){
          kilometer+=x;
      }
      public void setRevenue(int x){
          revenue+=x;
      }
      public void setDemand(){
          demand++;
      }
      public String getName(){
          return name;
      }
      public int getKilometer(){
          return kilometer;
      }
      public int getExpenses(){
          return expense;
      }
      public int getFuel(){
          return fuel;
      }
      public int getRevenue(){
          return revenue;
      }
      public int getDemand(){
          return  demand;
      }
      public int getAvail(){
          return (ac+nonac);
      }
      public void setAc(){
          ac++;
      }
      public void setNonAc(){
          nonac++;
      }
      public void getAc(){
          ac--;
      }
      public void getNonAc(){
          nonac--;
      }
      public int getPkc(){
          return pkc;
      }
      public void setPkc(int x){
          pkc=x;
      }
      public void setPhc(int x){
          phc=x;
      }
      public int getPhc(){
          return phc;
      }
      public int getNoofac(){
          return ac;
      }
      public int getNoofnonac(){
          return nonac;
      }
      public void addAc(){
          tac++;
      }
      public void addnonAc(){
          tnonac++;
      }
      public int getTotalAc(){
          return tac;
      }
      public int getTotalNonAc(){
          return tnonac;
      }
      public int getPrice(){
          return price;
      }
      public void setPrice(int x){
          price=x;
      }
}
