package org.hdev.compteservice.service;

import org.hdev.compteservice.entities.Boutique;
import org.hdev.compteservice.repositories.BoutirqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoutuiqueServiceImpl implements BoutiqueService{
    @Autowired
   private BoutirqueRepository boutirqueRepository ;
    @Override
    public void ajoutBoutique(Boutique boutique) {
        boutirqueRepository.save(boutique);
    }
}
