public class Song {

    static Song[] songs = new Song[10];
    static int countSongs = 0;

    String title;
    Singer singer;
    String url;

    public Song(String title, Singer singer, String url) {
        this.title = title;
        this.singer = singer;
        this.url = url;
        songs[countSongs] = this;
        countSongs++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public Singer getSinger() {
        return singer;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {
        return "[title="+this.title+", "+this.singer.toString()+", id="+this.url+"]";
    }

}
