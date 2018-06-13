package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class CarreraService {

    @PersistenceContext
    private EntityManager em;


    public void crearCarrera(Conductor tarjetaCredito, String origen, String destino, int tiempoEsperado, int tiempoCarrera){
        Carrera nuevaCarrera = new Carrera();
        nuevaCarrera.setConductor(tarjetaCredito);
        nuevaCarrera.setOrigen(origen);
        nuevaCarrera.setDestino(destino);
        nuevaCarrera.setTiempoEsperado(tiempoEsperado);
        nuevaCarrera.setTiempoCarrera(tiempoCarrera);
        em.persist(nuevaCarrera);
    }

    public Carrera recuperaCarrera(Conductor tarjetaCredito, Long id){
        return em.find(Carrera.class, id);
    }

}
