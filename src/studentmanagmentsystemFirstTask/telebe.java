package studentmanagmentsystemFirstTask;

public class telebe extends istifadeci {
	
	private int telebeNo;
	private String fenn;
	
	
	public telebe(String ad, String soyad, int yas,int telebeNo, String fenn) {
		super(ad, soyad, yas);
		this.telebeNo = telebeNo;
		this.fenn = fenn;
	}

	
	@Override
	public void melumatGoster() {
		super.melumatGoster();
		System.out.println("Telebe No: " + getTelebeNo() + ", Fenn: " + fenn);
	}
	
	public static void main(String[] args) {
	
	}


	public int getTelebeNo() {
		return telebeNo;
	}


	public void setTelebeNo(int telebeNo) {
		this.telebeNo = telebeNo;
	}
}
