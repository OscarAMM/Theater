package ShowHandler.model;


import java.util.Scanner;
import java.util.Date;
import java.util.LinkedList;

public class Show {

    private String name;
    private String description;
    private String mainActors;
    private String relevantData; //Useful for publicity
    private int duration; //In minutes 
    private Contact contact;
    private LinkedList<Function> functions;//dataBase implementation
    
    public void registerData(){
        //Sensitive method to changes
        System.out.println("Registro de Obra.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        this.setName(scanner.next());
        System.out.println("Descripción: ");
        this.setDescription(scanner.next());
        System.out.println("Actores principales: ");
        this.setMainActors(scanner.next());
        System.out.println("Información relevante: ");
        this.setRelevantData(scanner.next());
        System.out.println("Duración(minutos): ");
        this.setDuration(scanner.nextInt());
        
        contact = new Contact();
        contact.registerData();
    }
    //Duda
    public void addFunction(Date date, String startTime, String endTime){
        
        functions.add(new Function(date, startTime, endTime));
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getMainActors() {
        return mainActors;
    }

    private void setMainActors(String mainActors) {
        this.mainActors = mainActors;
    }

    public String getRelevantData() {
        return relevantData;
    }

    private void setRelevantData(String relevantData) {
        this.relevantData = relevantData;
    }

    public int getDuration() {
        return duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
