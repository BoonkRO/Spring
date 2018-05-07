package org.mvpigs.setmana_1_practica.component;

import java.util.Collection;

public interface RepositoriAlumnes {

    String obteAlumne(int id);

    void altaAlumne(int id, String nom);

    Collection<String> llistaAlumnes();
}
