package Observer;

public class SubscritoDeLaInfo implements Observer {

    private Observable canalObservableSubscrito = null;

    public SubscritoDeLaInfo(Observable canalObservableSubscrito) {
        this.canalObservableSubscrito = canalObservableSubscrito;
    }

    @Override
    public String update() {
        return (" Moto Creada ");

    }

}
