package studentmanagmentsystemFirstTask;


public class muellim extends istifadeci {
	

	private String ixtisas;
	private String tecrube; 
	
	public muellim(String ad, String soyad, int yas, String ixtisas, String tecrube) {
		super(ad, soyad, yas);
		this.ixtisas = ixtisas;
		this.tecrube = tecrube;
	}

	
	@Override
	public void melumatGoster() {
		super.melumatGoster();
		System.out.println("Ixtisas: " + ixtisas + ", Tecrube: " + tecrube);
	}
	
	public static void main(String[] args) {
	
	}
}