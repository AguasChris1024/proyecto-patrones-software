package Observer;
//Interface Que Representa 
//La Observacion Del Canal De Youtube

public interface Observable {

    //esta funcion se llamara cada ves que suba un nuevo video
    //esta funcion llamar al update de todos los subcritores o observers
    public String notificacion();

}
