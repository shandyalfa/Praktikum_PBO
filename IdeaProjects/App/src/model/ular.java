package model;

public class ular {
    String jenis;
    int umur;

    public ular(String jenis, int umur){
        this.jenis =  jenis;
        this.umur = umur;
        merayap();
    }

    public void merayap(){
        System.out.println("Ular" + jenis + " sedang merayap");
    }
}
