
public class CD {
	
	private String name ; 
	private int nbc ; 
	private AudioTrack[] arrAudioTrack ; 
	private int nbAudioTrack ;
	
	public CD (String name , int size) throws NegativeArraySizeException {
		if (size < 1 ) throw new NegativeArraySizeException () ;
		this.name = name ; 
		this.arrAudioTrack = new AudioTrack[size] ; 
		this.nbAudioTrack = 0 ; 
	}
	
	public boolean add ( AudioTrack at ) throws ArrayIndexOutOfBoundsException {
		if (nbAudioTrack >= arrAudioTrack.length ) throw new ArrayIndexOutOfBoundsException() ; 
		arrAudioTrack[nbAudioTrack] = new AudioTrack (at) ; 
		nbAudioTrack++;
		return true ; 
	}
	
	public boolean del ( String tit ) throws NullPointerException {
		if ( tit == null ) throw new NullPointerException() ;
		for ( int i = 0 ; i < nbAudioTrack ; i++ ) {
			if ( arrAudioTrack[i].getTitle().equals(tit)) {
				arrAudioTrack[i] = arrAudioTrack[nbAudioTrack-1] ; 
				arrAudioTrack[nbAudioTrack-1] = null ; 
				nbAudioTrack-- ; 
			}
		}
		return true ; 
	}
}
