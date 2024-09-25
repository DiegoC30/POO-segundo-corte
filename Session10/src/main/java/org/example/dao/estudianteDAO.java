package org.example.dao;

import org.example.interfaces.operacion;
import org.example.model.estudiante;

import java.util.ArrayList;

public class estudianteDAO implements operacion {
    private ArrayList<estudiante> listado = new ArrayList();
    /**
     * Agrega un estudiante
     * @param object
     */

    @Override
    public void create(Object object) {
        try {
            estudiante estudiante = (estudiante) object;
            listado.add(estudiante);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     *
     * @param object
     */
    @Override
    public void read(Object object) {

    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Object> read() {
        ArrayList<Object> list = new ArrayList();
        list = (ArrayList<Object>) listado.clone();
        return list;

    }

    /**
     *
     * @param object
     */
    @Override
    public void update(Object object) {
        //actualizar estudiante
        estudiante est = (estudiante) object;
        for(estudiante estudiante : listado) {
            if(estudiante.getCif().equals(est.getCif())) {
                estudiante.setCif(est.getNombres());
                estudiante.setApellidos(est.getApellidos());
                estudiante.setEmail(est.getEmail());
                estudiante.setNombres(est.getNombres());
                return;
            }
        }

    }

    /**
     *
     * @param object
     */
    @Override
    public void delete(String id) {}
    //
    for(estudiante estudiante: listado){
        if (estudiante.getCif().equals(id))
            listado.remove(estudiante);
        return;

    }

    /**
     *
     * @param id
     * @return
     */
    /**@Override
    public Object search(String id) {
        return null;
    }

    /**
     *
     * @param name
     * @return
     */

    @Override
    public Object search(String value) {
        for(estudiante estudiante: listado){
            if(estudiante.getCif().equals(value)) || estudiante.getNombres().equals(value);
                    return estudiante;
        }
    }

}
