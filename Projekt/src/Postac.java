public class Postac {

    String imie;
    int hp;
    int dmg;


    Postac(String imie, int hp, int dmg) {
        this.imie = imie;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void Statystyki() {
        System.out.println("Statystyki " + imie);
        System.out.println("----------");
        System.out.println(" HP - " + hp);
        System.out.println(" DMG - " + dmg);
        System.out.println("----------");
        System.out.println();
    }

    public void atak(Postac cel) {
        System.out.printf("%s atakuje %s za %d punktów obrażeń.\n", imie, cel.imie, dmg);
        cel.otrzymanieObrazen(dmg);
    }

    public void otrzymanieObrazen(int obrazenia) {
        while(hp>=0) {
            hp -= obrazenia;

            if(hp<=0) {
                System.out.printf("%s ma 0 punktów życia.\n",imie);
                System.out.println(imie + " został pokonany");
            } else {
                System.out.printf("%s ma %d punktów życia.\n", imie, hp);
            }
        }




    }

    public boolean isAlive() {
        return hp>0;
    }

}
