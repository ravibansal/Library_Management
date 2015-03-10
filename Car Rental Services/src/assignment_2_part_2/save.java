/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2_part_2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ravibansal
 */
public class save implements Serializable{
    private static final long serialVersionUID = 1L;
    int counter=0;
    int id=0;
    @SuppressWarnings("Convert2Diamond")
    List<car> CarList= new ArrayList<car>();
    @SuppressWarnings("Convert2Diamond")
    List<carType> TypeList= new ArrayList<carType>();
    public static void main(String args[])
    {
        
    }
}
