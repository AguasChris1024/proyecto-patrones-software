package FabricaTallerEsp;

import proyectopatrones.FactoryGasMonkey;
import proyectopatronesdediseño.PartesAbstractas.Accesorios;
import proyectopatronesdediseño.PartesAbstractas.Chasis;
import proyectopatronesdediseño.PartesAbstractas.Llantas;
import proyectopatronesdediseño.PartesAbstractas.Motor;
import proyectopatronesdediseño.PartesAbstractas.SistemaDeFrenos;
import proyectopatrones.PartesEspecificas.AccesoriosMichelin;
import proyectopatrones.PartesEspecificas.ChasisAluminioReforzado;
import proyectopatrones.PartesEspecificas.LlantasGoodYear;
import proyectopatrones.PartesEspecificas.MotorBicilindrico;
import proyectopatrones.PartesEspecificas.SistemaDeFrenosTipoTambor;

public class TallerBFactory implements FactoryGasMonkey {

    @Override
    public Motor CrearMotor() {
        Motor bicilindrico = new MotorBicilindrico();
        System.out.println("Implementado En Taller B");
        return bicilindrico;
    }

    @Override
    public Chasis CrearChasis() {
        Chasis aluminio = new ChasisAluminioReforzado();
        System.out.println("Implementado En Taller B");
        return aluminio;
    }

    @Override
    public Llantas CrearLlantas() {
        Llantas goodYear = new LlantasGoodYear();
        System.out.println("Implementado En Taller B");
        return goodYear;
    }

    @Override
    public Accesorios CrearAccesorios() {
        Accesorios Michelin = new AccesoriosMichelin();
        System.out.println("Implementado En Taller B");
        return Michelin;
    }

    @Override
    public SistemaDeFrenos CrearSistemaDeFrenos() {
        SistemaDeFrenos TipoTambor = new SistemaDeFrenosTipoTambor();
        System.out.println("Implementado En Taller B");
        return TipoTambor;
    }

}
