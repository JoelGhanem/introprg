//En aquest exercici li posarem un picarol al gat Renat

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

/** Fa sonar el picarol.
 * En cas que no sigui possible per qualsevol
 * motiu (ex. el fitxer no estigui disponible, o no contingui un
 * format reconegut), el procediment falla silenciosament.
 */



public class Picarol {
    private int cops = 0;
    public void sona() {
        //String posicio
        System.out.println("clink-clink");
        this.cops = this.cops + 1;
        try {
            File fitxer = new File("picarol.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(fitxer);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            Thread.sleep(600);
        } catch (IOException e) {
        } catch (InterruptedException e) {
        } catch (UnsupportedAudioFileException e) {
        } catch (LineUnavailableException e) {}

    }
    public int quantsCops() {
        return this.cops;
    }
}
