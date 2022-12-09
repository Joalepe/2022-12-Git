
public class GitTehtava1 {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Fiat", "Ducato");
		
		auto1.naytaTiedot();
		auto2.naytaTiedot();
		auto2.kiihdyta();
		auto2.tankkaus=1;
		auto2.tankkaa();

		
	}

}
class Auto {
	
	public String merkki;
	
	public String malli;
	
	public int bensanMaara;
	
	public int tankkaus;
	
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
	
	
	
	public void jarruta()
	{
		System.out.println("Auto jarruttaa.");
	}
	
	
	
	public void kiihdyta()
	{
		if (bensanMaara == 0)
		{
		System.out.println("Bensa loppu, tankkaa auto");
		}
		else {
		
		System.out.println("Auto kiihtyy.");
		bensanMaara = (bensanMaara -1);
		}
	}
	
	
	public void tankkaa()
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + tankkaus);
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara+tankkaus));
		bensanMaara = (bensanMaara + tankkaus);
	}
	
}