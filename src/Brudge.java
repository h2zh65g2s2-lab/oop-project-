public class Bridge extends Infrastructure{
private double spanMeters;

public Bridge(String name,String location,int condition,double spanMeters){
    super(name,location,condition);
    this.spanMeters=spanMeters;
}

public double getSpanMeters(){
    return spanMeters;
}
public void setSpanMeters(double spanMeters){
    if(spanMeters<=0){
        throw new InvalidInputException("Span meters must be greater than 0");
    }
    this.spanMeters=spanMeters;
}
    @Override
    public double calculateMaintenanceCost() {
        return spanMeters * 800 * (11 - getCondition());
    }

    @Override
    public String getType() {
        return "Bridge";
    }

    @Override
    public String getDetails() {
        return "Span: " + spanMeters + " m";
    }

    @Override
    public String getExtraData() {
        return String.valueOf(spanMeters);
    }
}
