public class Array{

    private Object []data;
    private int base;

    public Array (int tam, int lim){
        this.data = new Object[tam];
        this.base = lim;
    }

    public Array(){
        this(0,0); 
    }
    
    public Array(int tam){
        this(tam, 0);
    }

    public void assign (Array a){
        if (a != this){
            if (data.length != a.data.length)
              data = new Object[a.data.length] ;
            for (int i=0; i<data.length; i++)
                 data[i] = a.data[i];
            base = a.base;
        }
    }

    public Object getData(){
        return data; 
    }

    public int getBase(){
        return base; 
    }

    public int getLength(){
        return data.length; 
    }

    public Object getElemento(int posicao){     
        return data[posicao-base];
    }

    public void setElemento(int posicao, Object o){
        data [posicao - base] = o;
    }
    
    
    public void setBase(int b){     
        base = b; 
    }
        
    public void setLength(int newTam){
        if(data.length != newTam){
            Object []newData = new Object [newTam];
            int min = data.length < newTam ? data.length : newTam;
            for (int i=0; i < min; i++)
                newData[i] = data[i];
            data = newData;
            }
        }
    
}
