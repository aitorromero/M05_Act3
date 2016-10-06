package m05_act3;

public class M05_Act3 {

    public static void main(String[] args) { 
        
    }
    public int calculauf(int uf){
        int n;
        if(uf<=0){
            n=0;
        }else if(uf>0 && uf<12){
            n=uf*30;
        }else{
            n=380;
        }
        
        return n;
    }
    
}
