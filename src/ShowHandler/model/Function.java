package ShowHandler.model;

import java.util.Date;

public class Function {
    
    private Date date;
    private String startTime;
    private String endTime;
    
    public Function(Date date, String startTime, String endTime){
        this.setDate(date);
        this.setEndTime(endTime);
        this.setStartTime(startTime);
    }
    
    
    public void verifyDisponibility(){
        //Implements later
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
}
