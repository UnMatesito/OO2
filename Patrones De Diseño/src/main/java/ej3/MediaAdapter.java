package ej3;

public class MediaAdapter extends Media {
    private VideoStream videoStream;

    public MediaAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    public void play(){
        videoStream.reproduce();
    }
}
