public class Employee extends Person {

    int Id ;
    int Salary ;
    String designation;
    Address address;


    public Employee(int Id , int Salary , String designation , Address address){
        super(22,300000,5,43);
        
      this.Id = Id ;
      this.Salary = Salary ;
      this.designation = designation ;
      this.address  = address;



    }
    
}
