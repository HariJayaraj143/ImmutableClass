import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public final class Student{
    final String name;
    final String id;
    final Date dateOfjoining;
    final List<Address>address;
    public Student(String name,String id,Date dateOfjoining,List<Address>address){
        if(name==null||id==null||dateOfjoining==null||address==null){
            throw new IllegalArgumentException("fields cannot be null");
        }
        this.name=name;
        this.id=id;
        this.dateOfjoining=new Date(dateOfjoining.getTime());
        this.address=new ArrayList<>(address);
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public Date getDateOfjoining(){
        return new Date(dateOfjoining.getTime());
    }
    public List<Address> getAddress(){
        return Collections.unmodifiableList(address);
    }
    @Override
    public String toString(){
        return "Student{"+"name='"+name+'\''+",id='"+id+'\''+",dateOfjoining='"+dateOfjoining+",address='"+address+'}';
    }
}
class address{
    final String street;
    final String city;
    final String state;
    final String pincode;
    public Address(String street,String city,String state,String pincode){
        if(street==null||city==null||state==null||pincode==null){
            throw new IllegalArgumentException(" addressfields cannot be null");
        }
        this.street=street;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getPincode(){
        return pincode;
    }
    @Override
    public String toString(){
        return "Address{"+"street='"+street+'\''+",city='"+city+'\''+",state='"+state+",pincode='"+pincode+'}';
    }
    
}