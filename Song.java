import java.util.ArrayList;

public class Song {
    


    String movieName;
    String SongName;
    void play(){
        System.out.println(movieName+" movie playing a song "+SongName);
    }
    public static void main(String[] args){
        Song movie1=new Song();
        movie1.movieName="race";
        movie1.SongName="lat lag gee";
        movie1.play();
        Song movie2=new Song();
        movie2.movieName="dosti";
        movie2.SongName="subh hone na de";
        movie2.play();

       
       
            private ArrayList<String> songs;
        
            public void Playlist() {
                this.songs = new ArrayList<>();
            }
        
            public void addSong(String song) {
                this.songs.add(song);
            }
        
            public void removeSong(String song) {
                this.songs.remove(song);
            }
        
            public void printSongs() {
                for (String song: this.songs) {
                    System.out.println(song);
                }
            }
        
        Playlist list = new Playlist();
list.addSong("saam oo shar");
list.addSong("aaj jine nhi ");
list.printSongs();

