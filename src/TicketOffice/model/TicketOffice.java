package TicketOffice.model;

import ShowHandler.model.Show;


public class TicketOffice {

    int showsCounter = 0;
    Show[] shows = new Show[10];

    public static void main(String[] args) {
        TicketOffice test = new TicketOffice();
        
    }
    
    public void addShows(){
        shows[showsCounter].registerData();
        showsCounter++;
    }
    
   
}
