package Builder;

import FabricaTallerEsp.TallerAFactory;
import proyectopatrones.FactoryGasMonkey;

//CLASE QUE REPRESENTA GRUPO DE MECANICOS QUE ARMA LA MOTO
public class MonosFreeman extends GerenteRowlings {

    @Override
    public void ConstruirAccesorios() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerAFactory();
        accesorios = fabrica.CrearAccesorios();
    }

    @Override
    public void ConstruirChasis() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerAFactory();
        chasis = fabrica.CrearChasis();
    }

    @Override
    public void ConstruirLlantas() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerAFactory();
        llantas = fabrica.CrearLlantas();
    }

    @Override
    public void ConstruirMotor() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerAFactory();
        motor = fabrica.CrearMotor();
    }

    @Override
    public void ConstruirFrenos() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerAFactory();
        frenos = fabrica.CrearSistemaDeFrenos();
    }

    @Override
    public void Crear() {
        System.out.println("Moto Modelo V_strom Creada");
    }

    public String getNombre() {
        Nombre = "MONOS FREMAN";
        return Nombre;
    }

}
