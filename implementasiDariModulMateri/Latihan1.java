package Java_test;

public class Latihan1 {
    public static void main(String[] args) {
        Radio myobj = new Radio();
        myobj.on();
        myobj.off();
        myobj.gantiChannel(10);
        myobj.perbesarVolume(50);
        myobj.perkecilVolume(25);

        Televisi tv = new Televisi("Samsung");
        tv.on();
        tv.off();
        tv.gantiChannel(15);
    }

}

interface InterfacElektronik {
    void on();
    void off();
}

interface InterfaceChannel {
    void gantiChannel(int channel);
}

interface InterfaceChannelRadio{
  void gantiChannel(int channel);
}

class Radio implements InterfacElektronik, InterfaceChannel {
    boolean mesin;
    int volume;

    public void on() {
        System.out.println("on");
    }
    
    public void off() {
        System.out.println("off");
    }

    public void gantiChannel(int channel) {
        System.out.println("ganti channel " + channel);
    }

    public void perbesarVolume(int volume) {
        this.volume += volume;
        System.out.println("perbesar volume " + this.volume);
    }

    public void perkecilVolume(int volume) {
        this.volume -= volume;
        System.out.println("perkecil volume " + this.volume);
    }
}

class Televisi implements InterfacElektronik, InterfaceChannelRadio{
  boolean mesin;
  String merk;
  boolean listrik;
  
  public Televisi(String merk){
    this.merk = merk;
    System.out.println(merk);
  }

  public void on(){
    System.out.println("on");
  }

  public void off(){
    System.out.println("off");
  }

  public void gantiChannel(int channel){
    System.out.println("ganti channel " + channel);
  }
}

