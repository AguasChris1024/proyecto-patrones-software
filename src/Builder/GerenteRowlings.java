package Builder;

import proyectopatronesdediseño.PartesAbstractas.Accesorios;
import proyectopatronesdediseño.PartesAbstractas.Chasis;
import proyectopatronesdediseño.PartesAbstractas.Llantas;
import proyectopatronesdediseño.PartesAbstractas.Motor;
import proyectopatronesdediseño.PartesAbstractas.SistemaDeFrenos;

public abstract class GerenteRowlings {

    String Nombre;
    public Accesorios accesorios;
    public Chasis chasis;
    public Llantas llantas;
    public Motor motor;
    public SistemaDeFrenos frenos;

    //metodos ue el gerent edefine para crear una moto
    public abstract void ConstruirAccesorios();

    public abstract void ConstruirChasis();

    public abstract void ConstruirLlantas();

    public abstract void ConstruirMotor();

    public abstract void ConstruirFrenos();

    public abstract void Crear();

}
