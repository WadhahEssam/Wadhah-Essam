
public class AudioTrack {
	
	protected String title ; 
	protected int duration ; 

	public AudioTrack ( String title , int duration ) {
		this.title = title ; 
		this.duration = duration ; 
	}
	
	public AudioTrack (AudioTrack a) {
		this.title = a.title; 
		this.duration = a.duration ; 
	}
	
	public void print (){
		System.out.println("Title : " + this.title + " Duration " + this.duration );
	}
	public String getTitle () {
		return title ; 
	}
}
