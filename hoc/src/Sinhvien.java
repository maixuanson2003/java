public class Sinhvien {
    private String Hoten;
    private double diem;
    private  String id;
    private  static int id_sv=0;
    public  Sinhvien(){
        this.Hoten=null;
        this.diem=0.0;
    }
    public  Sinhvien(String Hoten,double diem){
        id_sv++;
        this.id="SV"+id_sv;
        this.Hoten=Hoten;
        this.diem=diem;
    }
    public void setHoten(String Hoten){
        this.Hoten=Hoten;
    }
    public void setDiem(double diem){
       if(check(diem)){
           this.diem=diem;
       }else{
           System.out.println("khong thoa man");
       }
    }
    public double dtb(double [] arr){
        double tong=0.0;
        for (double diem: arr){
            tong+=diem;
        }
        return  tong;
    }

    public String getHoten() {
        return Hoten;
    }

    public double getDiem() {
        return diem;
    }
    private boolean check(double diem){
        return diem>4;
    }

    public void hienthithongtin(){
        System.out.print(this.Hoten+":"+this.diem+":"+this.id);
    }
}
