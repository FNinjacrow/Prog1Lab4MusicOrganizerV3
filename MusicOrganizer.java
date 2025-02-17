import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
    
    /**
     * private ArrayList<Tracks> track;
     * track = new ArrayList<>();
     */
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(String filename : files) {
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    
    public void listMatching(String searchString)
    {
        for(String artist : files) {
            if(artist.contains(searchString)) {
            System.out.println(artist);
            player.playSample(artist);
            System.out.println(files);
            }
        }
    }
    
    // Question 30 Answer
    public void multiplesOfFive()
    {
        int value = 10;
        while(value < 90) {
            value = value + 5;
            System.out.println(value);
        }
    }
    
    //Question 31
    public void sum1To10()
    {
        int number1 = 1;
        int number2 = 1;
        int total = 0;
        while(!(total > 20)) {
            total = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" + total);
            number1 = number1 + 1;
            total = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" + total);
            number2 = number2 + 1;
        }
    }
    
    // Question 32 Answer
    public void sum(int a, int b)
    {
        int total = 0;
        while(total == 0) {
            total = a + b;
            System.out.println(total);
        }
    }
    
    public boolean isPrime(int n) {
    if (n > 1) {
        while(n > 2) {   
        if (n % 2 == 0) {
        return false;
    }
        return true;
    }
        return true;
    }
        return false;
    }   
}
