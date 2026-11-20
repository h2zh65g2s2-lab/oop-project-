public class Factory extends Infrastructure {
private int machineCount;

public Factory(String name,String location,int condition,int machineCount){
    super(name,location,condition);
    this.machineCount=machineCount;
}

    public int getMachineCount() {
        return machineCount;
    }
    public void setMachineCount(int machineCount){
    if(machineCount<=0){
        throw new InvalidInputException("Machine count must be greater than 1");
    }
    this.machineCount=machineCount;
    }

@Override
    public double calculateMaintenanceCost(){
    return machineCount * 2000 * (11 - getCondition());
}
@Override
    public String getType(){
    return "Factory";
}
@Override
    public String getDetails(){
    return "machines"+machineCount;
}
@Override
    public String getExtraData(){
    return String.valueOf(machineCount);
}

}
