public  class Road extends Infrastructure{
    private double lengthKm;

    public Road(String name,String location,int condition,double lengthKm){
        super(name,location,condition);
        this.lengthKm=lengthKm;
    }

    public double getLengthKm(){
        return lengthKm;
    }
    public void setLengthKm(double lengthKm){
        if(lengthKm<=0){
            throw new InvalidInputException("Length must be graeter than 0");
        }
        this.lengthKm=lengthKm;
    }
    @Override
    public double calculateMaintenanceCost() {
        return lengthKm * 5000 * (11 - getCondition());
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public String getDetails() {
        return "Length: " + lengthKm + " km";
    }

    @Override
    public String getExtraData() {
        return String.valueOf(lengthKm);
    }

}
