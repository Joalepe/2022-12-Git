
public class GitTehtava1 {

	public static void main(String[] args) {



		
	}

}
class Auto {
	
	public String merkki;
	
	public String malli;
	
	public int bensanMaara;
	
	public Auto()
	{
		merkki="";
		malli="";
		bensanMaara=0;
	}
	
	public Auto(String autonMerkki, String autonMalli)
	{
		merkki=autonMerkki;
		malli=autonMalli;
		bensanMaara=0;
	}
	

	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Tankissa bensaa: " + bensanMaara);
	}
}