package org.hdev.compteservice.service;

import org.hdev.compteservice.entities.CentreComercial;
import org.hdev.compteservice.repositories.CentreComercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentreComercialImpl implements CentreComercialService {
    @Autowired
    private CentreComercialRepository centreComercialRepository ;


    @Override
    public void ajoutCentre(CentreComercial centreComercial) {

        centreComercialRepository.save(centreComercial);
    }
}
