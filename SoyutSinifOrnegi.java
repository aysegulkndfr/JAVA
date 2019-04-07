abstract class sekil{
    public String isim;
    public void isimBelirle(String isim){
        this.isim = isim;
    }
    public String isimGetir(){
        return isim;
    }
    public abstract double alanHesap();
}
class ucgen extends sekil{
    public double h,t;
    public ucgen(double h,double t){
        isimBelirle("ucgen");
        this.h = h;
        this.t = t;
    }
    public double alanHesap(){
        return(h*t)/2;        
    }   
}
public class SoyutSinifOrnegi{
    public static void main(String args[]){
        ucgen u = new ucgen(3.0,5.0);
        System.out.println("isim: "+ u.isimGetir());
        System.out.println("alan: "+ u.alanHesap());
    }
}
