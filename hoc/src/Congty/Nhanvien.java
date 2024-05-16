package Congty;

public abstract class Nhanvien {
    protected int id;
    protected String name;
    protected String phone;
    protected double luong=850;
    public  Nhanvien(){
        this.id=0;
        this.name=null;
        this.phone=null;
        this.luong=0.0;

    }
    public Nhanvien(int id,String name,String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;

    }
    public int getId(){
        return this.id;
    }
    public abstract double tinhluong();



}
