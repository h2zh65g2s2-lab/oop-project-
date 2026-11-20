public class InovationIdea {
    private String title;
    private String descreption;
    private String status; //submitted or underreview

    public InovationIdea(String title,String descreption){
        this.title=title;
        this.descreption=descreption;
        status="Submitted";
    }

    public InovationIdea(String title,String descreption,String status){
        this.title=title;
        this.descreption=descreption;
        this.status=status;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        if(title==null || title.trim().isEmpty()){
            throw new InvalidInputException("Title cannot be empty");
        }
        this.title=title;
    }
    public String getDescreption(){
        return descreption;
    }
    public void setDescreption(String descreption){
        if(descreption==null || descreption.trim().isEmpty()){
            throw new InvalidInputException("Description cannot be empty");
        }
        this.descreption=descreption;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        if(status==null || status.trim().isEmpty()){
            throw new InvalidInputException("Status cannot be empty");
        }
        this.status=status;
    }

    @Override
    public String toString() {
        return "InovationIdea{" +
                "title='" + title + '\'' +
                ", descreption='" + descreption + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
