package interfaces.zad15;

public interface SoundPlayer {
    public abstract String playSound();
    public default String stopSound(){return "Sound Stopped";};
    public static String getDeviceType(){return "Sound Device";};
}
