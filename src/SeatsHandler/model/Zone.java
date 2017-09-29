package SeatsHandler.model;

public class Zone {

    int idZone; //There r five zones: Broad, Copper, Silver, Gold, Diamond
    String zoneType;
    
    
    
    public void setZoneBroad(){
        zoneType = "Broad";
    }
    
    public void setZoneCopper(){
        zoneType = "Copper";
    }
    
    public void setZoneSilver(){
        zoneType = "Silver";
    }
    
    public void setZoneGold(){
        zoneType = "Gold";
    }
    
    public void setZoneDiamond(){
        zoneType = "Diamond";
    }
}
