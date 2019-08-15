/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Maintenance {
    private int maintenanceNumber;
    private int apartmentNumber;
    private String maintenanceFault;
    private String maintenanceDate;
    private String maintenanceAction;
    
    public Maintenance(int maintenanceNumber, int apartmentNumber, String maintenanceFault, String maintenanceDate, String maintenanceAction){
        this.maintenanceNumber= maintenanceNumber;
        this.apartmentNumber= apartmentNumber;
        this.maintenanceFault= maintenanceFault;
        this.maintenanceDate= maintenanceDate;
        this.maintenanceAction= maintenanceAction;
    }
    
    public void setMaintenanceNumber(int maintenanceNumber){
        this.maintenanceNumber= maintenanceNumber;
    }
    
    public int getMaintenanceNumber(){
        return maintenanceNumber;
    }
    
    public void setApartmentNumber(int apartmentNumber){
        this.apartmentNumber= apartmentNumber;
    }
    
    public int getApartmentNumber(){
        return apartmentNumber;
    }
    
    public void setMaintenanceFault(String maintenanceFault){
        this.maintenanceFault= maintenanceFault;
    }
    
    public String getMaintenanceFault(){
        return maintenanceFault;
    }
    
    public void setMaintenanceAction(String maintenanceAction){
        this.maintenanceAction= maintenanceAction;
    }
    
    public String getMaintenanceAction(){
        return maintenanceAction;
    }
    
    public void setMaintenanceDate(String maintenanceDate){
        this.maintenanceDate= maintenanceDate;
    }
    
    public String getMaintenanceDate(){
        return maintenanceDate;
    }
}
