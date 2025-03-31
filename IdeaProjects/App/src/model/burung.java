package model;

public class burung {
    public String jenis;
    int umur;

    public burung(String jenis, int umur){
        this.jenis =  jenis;
        this.umur = umur;
        terbang();
    }

    public void terbang(){
        System.out.println("Burung" + jenis + " sedang terbang");
    }
}
