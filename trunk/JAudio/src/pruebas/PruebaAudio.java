/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import cl.jaudio.basico.AudioFile;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Pato Pérez
 */
public class PruebaAudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
//        AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
//
//        // y los sacamos por pantalla
//        for (AudioFileFormat.Type tipo : tipos) {
//            System.out.println(tipo.getExtension());
//        }
//        Clip sonido = AudioSystem.getClip();
//        sonido.open(AudioSystem.getAudioInputStream(new File("1.wav")));
//        sonido.start();
//        while (sonido.isRunning()) {
//            System.out.println("hola");
//            Thread.sleep(1000);
//        }
//        AudioClip s = JApplet.newAudioClip(new File("trippygaia1.mid").toURI().toURL());
//        s.play();
//        Thread.sleep(5000);
        
        AudioFile a = new AudioFile("audios/02 Liberate.mp3");
        a.play(true);
    }
}
