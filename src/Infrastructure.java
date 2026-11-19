import java.util.*;
public abstract class Infrastructure {
    private String name;
    private String location;
    private int condition; // condition 1 to 10

    private boolean  maintenanceScheduled;

    public Infrastructure(String name,String location,int condition){
        this.name=name;
        this.location=location;
        this.condition=condition;
        this.maintenanceScheduled=false;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        if(name ==null || name.trim().isEmpty()){
            throw new InvalidInputException("Name cannot be empty");
        }
        this.name=name.trim();
    }
public String getlocation(){
        return location;
}
public void setlocation(String location){
        if(location == null || location.trim().isEmpty()){
            throw new InvalidInputException("Location cannot be empty");
        }
        this.location=location.trim();
}
public int getCondition(){
        return condition;
}
public void setCondition(int condition){
        if(condition<1||condition>10){
            throw new new InvalidInputException("number must be between 1 and 10");
        }
        this.condition=condition;
}

@Override
  public void scheduleMaintenance(){
        maintenanceScheduled=true;
}
@Override
    public boolean isMaintainaceschedueled(){
        return maintenanceScheduled
}
    public abstract double calculateMaintenanceCost();



}
