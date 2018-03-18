import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

            File bmw = new File("bmwsound.wav");
            File seat = new File("seatsound.wav");
            File fiat= new File("fiatsound.wav");
            File ford= new File("fordsound.wav");
    public void which_sound(int p){
        switch(p){
            case 0: Playsound(bmw); break;
            case 1: Playsound(ford);break;
            case 2: Playsound(fiat);break;
            case 3: Playsound(seat);break;
        }
    };
    public void Playsound(File sound){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {
            ;
        }
    }
}
