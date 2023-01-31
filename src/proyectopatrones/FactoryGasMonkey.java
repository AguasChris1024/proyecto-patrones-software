package proyectopatrones;

import proyectopatronesdediseño.PartesAbstractas.Accesorios;
import proyectopatronesdediseño.PartesAbstractas.Chasis;
import proyectopatronesdediseño.PartesAbstractas.Llantas;
import proyectopatronesdediseño.PartesAbstractas.Motor;
import proyectopatronesdediseño.PartesAbstractas.SistemaDeFrenos;

public interface FactoryGasMonkey {

    public Motor CrearMotor();

    public Chasis CrearChasis();

    public Llantas CrearLlantas();

    public Accesorios CrearAccesorios();

    public SistemaDeFrenos CrearSistemaDeFrenos();

}
