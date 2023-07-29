package Task3;

public class Player implements Playable,Recordable{
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void record() {
        System.out.println(" recording in process");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
