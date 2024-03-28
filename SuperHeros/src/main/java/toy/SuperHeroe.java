
package toy;


public class SuperHeroe {
    String name;
    String description; 
    Boolean capa; 
    
    public SuperHeroe(String name){
        this.description="";
        this.capa=false; 
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return "SuperHeroe{" + "name=" + name + ", description=" + description + ", capa=" + capa + '}';
    }
    
   
    

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCapa() {
        return capa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapa(Boolean capa) {
        this.capa = capa;
    }
    
    
    
    

    
    
    
    

    
    
}





