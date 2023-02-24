import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop hp_pailion_g6 = new Laptop(); 
        Brand brandHp = new Brand("HP", "USA", "AmericaLanguage");
        hp_pailion_g6.addBrand(brandHp); 
        Laptop hp_galaxy_x64 = new Laptop();
        hp_galaxy_x64.addBrand(brandHp);
        Laptop samsung_a52 = new Laptop();
        Brand brandSamsung = new Brand("Samsung", "China", "ChinaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Laptop samsung_m31s = new Laptop();
        samsung_m31s.addBrand(brandSamsung);
        Laptop lenovo_gtx76 = new Laptop();
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        Laptop macbook_14pro = new Laptop();
        Brand brandMacbook = new Brand("Apple", "USA", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Laptop asus_x515 = new Laptop();
        Brand brandAsus = new Brand("Asus", "USA", "AmericaLanguage");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air5 = new Laptop();
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Laptop acer_air6 = new Laptop();
        acer_air6.addBrand(brandAcer);
        Laptop acer_a313 = new Laptop();
        acer_a313.addBrand(brandAcer);
        
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(hp_pailion_g6);      
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);

        Laptop FilterLaptop = new Laptop();


        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
