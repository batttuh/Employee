
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Emp {
    static ArrayList<Employee> arr;
    static ArrayList getArrayList(){
        return arr;
    }
    static void setArrayList(ArrayList<Employee> arr1){
        arr=arr1;
    }
    static boolean checkEntry(int id){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }
}
