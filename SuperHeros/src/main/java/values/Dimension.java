
package values;




public class Dimension {
    double high; //alto 
    double wide; //ancho 
    double deep; //profundo 
    
    
    
    
    
    public Dimension(){  //constructor sin parametros 
        high=0;
        wide=0;
        deep=0;
    }
    
    public Dimension (double high, double wide, double deep){   //constructor con parametros 
        this.high=high;
        this.wide=wide;
        this.deep=deep; 
    }
    
    public double getVolumen(){
        return high*wide*deep; 
    }

    @Override
    public String toString() {
        return "Dimension{" + "high=" + high + ", wide=" + wide + ", deep=" + deep + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public double getHigh() {
        return high;
    }

    public double getWide() {
        return wide;
    }

    public double getDeep() {
        return deep;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public void setDeep(double deep) {
        this.deep = deep;
    }
    
    
    
    
    
}
