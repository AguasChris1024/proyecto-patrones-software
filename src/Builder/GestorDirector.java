package Builder;

import Observer.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDirector {

    private static GestorDirector InstaUnica;
    private List<GerenteRowlings> Motos = new ArrayList<GerenteRowlings>();
    private ArrayList<String> notificaciones = new ArrayList<String>();
    CanalDeInformacion canal = new CanalDeInformacion();
    String Mensaje = canal.AñadirNuevaNotificacion(canal);

    private GestorDirector() {
    }

    public static GestorDirector getInstaUnica() {
        if (InstaUnica == null) {
            InstaUnica = new GestorDirector();
        }
        return InstaUnica;
    }

    public boolean agregarMoto(GerenteRowlings moto) {
        if (Motos.add(making(moto))) {
            // implementacion de parte del patorn observer
            if (moto instanceof MonosFreeman) {
                notificaciones.add(" De Tipo V_Storm " + " Por El Grupo: " + ((MonosFreeman) moto).getNombre() + Mensaje);
                return true;
            } else {
                notificaciones.add(" De Tipo V_Virgin " + " Por El Grupo: " + ((MonosLocos) moto).getNombre() + Mensaje);
                return true;
            }
        }
        return false;
    }

    public GerenteRowlings making(GerenteRowlings moto) {
        moto.Crear();
        moto.ConstruirAccesorios();
        moto.ConstruirChasis();
        moto.ConstruirFrenos();
        moto.ConstruirLlantas();
        moto.ConstruirMotor();
        return moto;
    }

    public void MostrarNotificaciones() {
        Object[] Notificaciones = notificaciones.toArray();
        for (int i = 0; i < Notificaciones.length; i++) {
            String tipo;
            System.out.println(" Moto N: " + (i + 1) + Notificaciones[i]);
        }

    }

}
