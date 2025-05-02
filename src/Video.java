public class Video {
    public String title; 
    public double duration;
    public String uploader;
    public String description;
    public String format;
    public int views;
    public DateTime uploadTime; 
    //stores relevant data

    public Video(String title, double duration, String uploader, String description, DateTime uploadTime){
      this.title = title;
      this.duration = duration; 
      this.uploader = uploader;
      this.description = description;
      this.uploadTime = uploadTime;
    //constructors 
    }

    public void displayVideoInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Uploader: " + uploader);
        System.out.println("Description: " + description);
        System.out.println("Format: " + format);
        System.out.println("Views: " + views);
        
    }
    // displays video information
    
    public static void main(String[] aStrings){
        Video video1 = new Video("basics of java")
    }
    }

