import java.util.*;
abstract class JobRole { String role; JobRole(String r){role=r;} public String toString(){return role;} }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){super("Software Engineer");} }
class DataScientist extends JobRole { DataScientist(){super("Data Scientist");} }
class ProductManager extends JobRole { ProductManager(){super("Product Manager");} }
class Resume<T extends JobRole> {
    T role;
    Resume(T role){ this.role=role; }
    static void processResumes(List<? extends JobRole> roles){
        for(JobRole r:roles) System.out.println("Processing: "+r);
    }
    public static void main(String[] args){
        List<SoftwareEngineer> se = Arrays.asList(new SoftwareEngineer());
        List<DataScientist> ds = Arrays.asList(new DataScientist());
        processResumes(se);
        processResumes(ds);
    }
}