package studentmanagmentsystemFirstTask;
import java.util.ArrayList;

public class telebeidaresistemi {
	
	ArrayList<telebe> telebeList = new ArrayList<>();
	
	public void telebeElaveEt(telebe t)
	{
		telebeList.add(t);
	}
	
	public void telebeListiniGoster()
	{
		for (telebe t : telebeList)
		{
			t.melumatGoster();
		}
	}
	
	public  void telebeSil(int telebeNo)
	{
		telebeList.removeIf(t -> t.getTelebeNo() == telebeNo);
	}
	
	
	public static void main(String[] args) {
		
		telebeidaresistemi idareSistemi = new telebeidaresistemi();
		
		telebe t1 = new telebe("Ali", "Veli", 21, 101, "Informatika");
		telebe t2 = new telebe("Cemal", "Yılmaz", 22, 102, "Kimya");
	
		idareSistemi.telebeElaveEt(t1);
		idareSistemi.telebeElaveEt(t2);
		
		
		// Bütün məlumatları göstəririk
		System.out.println("Başlanğıc Məlumatları:");
		idareSistemi.telebeListiniGoster();
				
		// Bir tələbəni silirik
		idareSistemi.telebeSil(101);
				
		// Qalan tələbələri yenidən göstəririk
		System.out.println("\nSilindikdən Sonra Məlumatlar:");
		idareSistemi.telebeListiniGoster();
	}
}
