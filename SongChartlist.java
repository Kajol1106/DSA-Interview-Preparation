import java.util.Arrays;
import java.util.Comparator;

class song{
  // complete the class as mentioned in the problem statement above
    int duration; 
    String name;
    int popularity;
    
    public song(int duration, String name,  int popularity) {
        this.duration = duration;
        this.name = name;
        this.popularity = popularity;
    }
    
}

class chartlist{
  // complete the class as mentioned in the problem statement above
    int n;
    song[] songs;
    
    public chartlist(int n, song[] songs) {
        this.n = n;
        this.songs = songs;
    }
    
    // This gives a string array of song names of the 5 most popular songs
    String[] top_five() {
        return Arrays.stream(songs)
                .sorted(Comparator.comparingInt(s -> s.popularity)) //popularity depend on smallest to largest
                .limit(5)
                .map(s -> s.name)
                .toArray(String[]::new);
    }
    
    // This gives a string, indicating the name of the least popular song
    String leastPopular() {
        return Arrays.stream(songs)
                .max(Comparator.comparingInt(s -> s.popularity))
                .map(s -> s.name)
                .orElse(null);
    }

    
    // This gives a string, indicating the name of the most popular song
    String mostPopular() {
        return Arrays.stream(songs)
                .min(Comparator.comparingInt(s -> s.popularity))
                .map(s -> s.name)
                .orElse(null);
    }

    
    // This gives a string, indicating the name of the longest song
    String longestSong() {
        return Arrays.stream(songs)
                .max(Comparator.comparingInt(s -> s.duration))
                .map(s -> s.name)
                .orElse(null);
    }
    
    // This gives a string, indicating the name of the shortest song
    String shortestSong() {
        return Arrays.stream(songs)
                .min(Comparator.comparingInt(s -> s.duration))
                .map(s -> s.name)
                .orElse(null);
    }
}
