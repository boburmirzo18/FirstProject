import java.sql.SQLOutput;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class Person {
  private String surname;
  private String firstName;
  private String street;
  private String zipCode;
  private String city;

  public void initialize(){
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter your surname: ");
      surname=scanner.nextLine();
      System.out.println("Enter your first name:");
      firstName=scanner.nextLine();
      System.out.println("Enter your street:");
      street=scanner.nextLine();
      System.out.println("Enter your zip code:");
      zipCode=scanner.nextLine();
      System.out.println("Enter your city:");
      city=scanner.nextLine();


    }

    public void print(){
        System.out.println("Your surname is:"+surname);
        System.out.println("Your first name is:"+firstName);
        System.out.println("Your street is:" +street);
        System.out.println("Your zip code is" +zipCode);
        System.out.println("Your city is:"+city);

    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }


}


class Staff extends Person{
    private  String education;
    private String position;

    public void initialize1(){
        initialize();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your education:");
        education=scanner.nextLine();
        System.out.println("Enter your position:");
        position=scanner.nextLine();

    }

    public void print1(){
        print();
        System.out.println("Your education is:"+education);
        System.out.println("Your postion is:"+position);



    }



    public class Main{
        public static void main(String[] args) {
            Staff staffMember=new Staff();
            staffMember.initialize1();
            staffMember.print1();
            staffMember.initialize();

            Person person = new Person();
            person.initialize();


        }
    }




}