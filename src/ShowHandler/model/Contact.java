
package ShowHandler.model;

import java.util.Scanner;

public class Contact {
    
    private String cellphone;
    private String alternativePhone;
    private String email;
    private String firstName;
    private String lastName;
    
    
    
    public void registerData(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Datos del contacto.");
        System.out.println("Nombre: ");
        this.setFirstName(scanner.next());
        System.out.println("Apellido: ");
        this.setLastName(scanner.next());
        System.out.println("Número celular: ");
        this.setCellphone(scanner.next());
        System.out.println("Número alternativo de telefono: ");
        this.setAlternativePhone(scanner.next());
        System.out.println("E-mail: ");
        this.setEmail(scanner.next());
        
        
    }

    public String getCellphone() {
        return cellphone;
    }

    private void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAlternativePhone() {
        return alternativePhone;
    }

    private void setAlternativePhone(String alternativePhone) {
        this.alternativePhone = alternativePhone;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
}
