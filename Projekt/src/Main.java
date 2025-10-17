public class Main {

    public static void main(String[] args) {

        Postac gracz = new Postac("Geralt", 100, 25);
        Postac goblin = new Postac("goblin", 45, 10);

        gracz.Statystyki();
        goblin.Statystyki();

        while(goblin.isAlive()) {
            gracz.atak(goblin);
            goblin.otrzymanieObrazen(goblin.hp);
        }



    }

}

