package org.mvpigs.ComponentsExercici.component;

import org.springframework.stereotype.Component;

@Component
public interface IntegradorCotitzacions {

    public float obteMitjanaDiariaCotitzacions();

    float obteCotitzacio(String empresa);
}
