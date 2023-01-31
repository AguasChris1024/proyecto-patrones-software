package FabricaTallerEsp;

import proyectopatrones.FactoryGasMonkey;
import proyectopatronesdediseño.PartesAbstractas.Accesorios;
import proyectopatronesdediseño.PartesAbstractas.Chasis;
import proyectopatronesdediseño.PartesAbstractas.Llantas;
import proyectopatronesdediseño.PartesAbstractas.Motor;
import proyectopatronesdediseño.PartesAbstractas.SistemaDeFrenos;
import proyectopatrones.PartesEspecificas.AccesoriosMomo;
import proyectopatrones.PartesEspecificas.ChasisFibraCarbono;
import proyectopatrones.PartesEspecificas.LlantasContinental;
import proyectopatrones.PartesEspecificas.MotorMonocilindrico;
import proyectopatrones.PartesEspecificas.SistemaDeFrenosABS;

public class TallerAFactory implements FactoryGasMonkey {

    @Override
    public Motor CrearMotor() {
        Motor Mono = new MotorMonocilindrico();
        System.out.println("Implementado En Taller A");
        return Mono;
    }

    @Override
    public Chasis CrearChasis() {
        Chasis fibra = new ChasisFibraCarbono();
        System.out.println("Implementado En Taller A");
        return fibra;
    }

    @Override
    public Llantas CrearLlantas() {
        Llantas Continental = new LlantasContinental();
        System.out.println("Implementado En Taller A");
        return Continental;
    }

    @Override
    public Accesorios CrearAccesorios() {
        Accesorios Momo = new AccesoriosMomo();
        System.out.println("Implementado En Taller A");
        return Momo;
    }

    @Override
    public SistemaDeFrenos CrearSistemaDeFrenos() {
        SistemaDeFrenos ABS = new SistemaDeFrenosABS();
        System.out.println("Implementado En Taller A");
        return ABS;
    }

}
