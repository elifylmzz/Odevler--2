
public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca ()
	{
		int[] sayılar = new int [] {1,2,5,7,9,0};
        int aranacak=5;
        boolean varMı=false;

        for(int sayi:sayılar )
        {
            if(sayi==aranacak)
            {
                varMı=true;
                break;
            }
        }
        String mesaj= "";
        if(varMı)
        {
            mesaj="Sayı mevcuttur: " + aranacak;
            mesajVer(mesaj);
        }
        else
        {
        	 mesaj="Sayı mevcut değildir: " + aranacak;
             mesajVer(mesaj);
        }

	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
