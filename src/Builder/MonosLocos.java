package Builder;

import FabricaTallerEsp.TallerBFactory;
import proyectopatrones.FactoryGasMonkey;

//CLASE QUE REPRESENTA GRUPO DE MECANICOS QUE ARMA LA MOTO
public class MonosLocos extends GerenteRowlings {

    @Override
    public void ConstruirAccesorios() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerBFactory();
        accesorios = fabrica.CrearAccesorios();
    }

    @Override
    public void ConstruirChasis() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerBFactory();
        chasis = fabrica.CrearChasis();
    }

    @Override
    public void ConstruirLlantas() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerBFactory();
        llantas = fabrica.CrearLlantas();
    }

    @Override
    public void ConstruirMotor() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerBFactory();
        motor = fabrica.CrearMotor();
    }

    @Override
    public void ConstruirFrenos() {
        FactoryGasMonkey fabrica;
        fabrica = new TallerBFactory();
        frenos = fabrica.CrearSistemaDeFrenos();
    }

    @Override
    public void Crear() {
        System.out.println("Moto Modelo V_Virgin Creada");
    }

    public String getNombre() {
        Nombre = "MONOS LOCOS";
        return Nombre;
    }

}
