package Congty;

public class nhanviendica extends Nhanvien{
    protected int ca;
    public nhanviendica(int id,String name,String phone,int ca){
        super(id, name, phone);
        this.ca=ca;
    }
    @Override
    public double tinhluong(){
        return  this.luong*1.05;
    }

}
