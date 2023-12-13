package interfaces.zad15;

public class SoundTester {
    public static void main(String[] args){
        MusicPlayer m = new MusicPlayer();
        Radio r = new Radio();
        System.out.println(SoundPlayer.getDeviceType());
        System.out.println(m.playSound());
        System.out.println(m.stopSound());
        System.out.println(r.playSound());
        System.out.println(r.stopSound());
    }
}
