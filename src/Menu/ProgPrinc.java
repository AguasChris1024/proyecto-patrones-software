package Menu;

import Builder.GestorDirector;

public class ProgPrinc {

    public static void main(String[] args) {
        GestorDirector gestorE = GestorDirector.getInstaUnica();
        Menu.menugeneral(gestorE);
    }

}
