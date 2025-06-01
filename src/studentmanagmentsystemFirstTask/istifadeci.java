package studentmanagmentsystemFirstTask;

public class istifadeci {
	
	private String ad;
	private String soyad;
	private int yas;
	
	public String getAd()
	{
		return ad;
	}
	
	public void setAd(String ad)
	{
		this.ad = ad;
	}
	
	public String getSoyad()
	{
		return soyad;
	}
	public void setSoyad(String soyad)
	{
		this.soyad = soyad;
	}
	
	public int getYas()
	{
		return yas;
	}
	public void setYas(int yas)
	{
		this.yas = yas;
	}
	
	public istifadeci(String ad, String soyad, int yas)
	{
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	public void melumatGoster()
	{
		System.out.println("Ad: " + ad + ", Soyad: " + soyad + ", Yas: " + yas);
	}
	

	public static void main(String[] args) {

	}
}
