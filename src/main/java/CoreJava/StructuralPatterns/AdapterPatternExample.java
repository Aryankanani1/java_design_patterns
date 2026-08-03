package CoreJava.StructuralPatterns;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee class
class AdvancedMediaPlayer {
    void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

// Adapter class
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

// Concrete implementation of the Target interface
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Playing mp3 music files by default
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // MediaAdapter provides support to play other file formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

// Main class to test the Adapter pattern
public class AdapterPatternExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3"); // Output: Playing mp3 file. Name: beyond the horizon.mp3
        audioPlayer.play("mp4", "alone.mp4"); // Output: Playing mp4 file. Name: alone.mp4
        audioPlayer.play("vlc", "far far away.vlc"); // Output: Playing vlc file. Name: far far away.vlc
        audioPlayer.play("avi", "mind me.avi"); // Output: Invalid media. avi format not supported
    }
}
