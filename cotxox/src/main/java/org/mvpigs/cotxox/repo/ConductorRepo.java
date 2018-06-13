package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConductorRepo {

    @Autowired
    private ConductorRepo conductorRepo;
}
