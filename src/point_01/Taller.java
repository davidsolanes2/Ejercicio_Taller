package point_01;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Created by dsg on 3/10/16.
 */
public class Taller {
    private Map<Persona, Coche>reparaciones = new TreeMap<>(Comparator.comparing(Persona::getSegsocial));

    public void registrarReparacion(Persona persona, Coche coche) {
        reparaciones.put(persona, coche);
    }

    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes() {
        return reparaciones.keySet();
    }
}
