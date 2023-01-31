package Observer;

public class CanalDeInformacion implements Observable {

    Observable canal;

    @Override
    public String notificacion() {
        SubscritoDeLaInfo S1 = new SubscritoDeLaInfo(canal);
        return S1.update();
    }

    public String AñadirNuevaNotificacion(Observable canal) {
        this.canal = canal;
        String N = this.notificacion();
        return N + ("Y Añadida Al Garage De Gas Monkey ");
    }

}
