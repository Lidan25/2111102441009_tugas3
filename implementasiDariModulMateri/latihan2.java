package Java_test;

public class latihan2 {
  public static void main(String[] args){

  }
}


interface InterfaceMobil {
  void nyalakanMesin();
  void matikanMesin();
  void tambahGerigi();
  void turunkanGerigi();
  void tekanGas();
  void tekanRem();
}

interface InterfaceSirine{
  void nyalakanSirine();
  void matikanSirine();
  void gantiSuaraSirine(int jenis);
}

class Mobil implements InterfaceMobil{
  boolean mesin = false;
  public void nyalakanMesin(){
    System.out.println("Nyalakan");
  }

  public void matikanMesin(){
    System.out.println("Matikan");
  }

  public void tambahGerigi(){
    System.out.println("Tambah");
  }

  public void turunkanGerigi(){
    System.out.println("Turunkan");
  }

  public void tekanGas(){
    System.out.println("Gas");
  }

  public void tekanRem(){
    System.out.println("Rem");
  }
}

class MobilTransportasi extends Mobil{
  int jmlKursi;
  public void TambahPenumpang(){
    System.out.println("Tambahan Penumpang");
  }
}

class MobilPribadi extends Mobil {
  public void nyalakanTape(){
    System.out.println("Tape ON");
  }

  public void nyalakanTv(){
    System.out.println("TV ON");
  }

  public void nyalakanAC(){
    System.out.println("AC ON");
  }
}

class MobilNegara extends Mobil {
  public void nyalakanTape(){
    System.out.println("Tape ON");
  }

  public void nyalakanTV(){
    System.out.println("TV ON");
  }

  public void nyalakanAc(){
    System.out.println("AC ON");
  }
}

class Bus extends MobilTransportasi{
   public void nyalakanTape(){
    System.out.println("Tape ON");
  }

  public void nyalakanTv(){
    System.out.println("TV ON");
  }

  public void nyalakanAC(){
    System.out.println("AC ON");
  }
}

class Ambulance extends MobilNegara{
  public void gantiSirine(int jenis){
    System.out.println("Suara sirine di ganti ke nomor " + jenis);
  }
}

class MobilPolisi extends MobilNegara{
  public void gantiSirine(int jenis){
    System.out.println("Suara sirine di ganti ke nomor " + jenis);
  }

  public void nyalakanRadioHt(){
    System.out.println("Radio HT ON");
  }

  public void matikanRadioHt(){
    System.out.println("Radio HT OFF");
  }
}