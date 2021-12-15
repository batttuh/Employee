/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Employee {
    private int id;
    private String name;
    private double hours_worked;

    public Employee(int id, String name, double hours_worked) {
        this.id = id;
        this.name = name;
        this.hours_worked = hours_worked;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", hours_worked=" + hours_worked;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hours_worked
     */
    public double getHours_worked() {
        return hours_worked;
    }

    /**
     * @param hours_worked the hours_worked to set
     */
    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }
    
}
