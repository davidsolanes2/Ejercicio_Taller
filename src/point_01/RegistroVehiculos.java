package point_01;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Created by dsg on 3/10/16.
 */
public class RegistroVehiculos {

    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    public Optional<Coche>obtenerVehiculo(String matricula){
        return coches.stream().filter(coche -> coche.getMatricula().equals(matricula)).findFirst();
        //devuelve la entidad coche y busca en la cadena filtrando la entidad coche devolviendo la matricula que hemos pasado
        //en el String seleccionando la primera
    }

    public void eliminarVehiculo(String matricula) {
        coches.remove(matricula);
    }

    public Optional<Coche>obtenerVehiculoPrecioMax() {

        return coches.stream().max(Comparator.comparing(Coche::getPrecio));
    }

    public List<Coche>obtenerVehiculosMarca(String marca) {

        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public List<Coche>obtenerTodos(){

        return coches.stream().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "RegistroVehiculos{" +
                "coches=" + coches +
                '}';
    }
}
