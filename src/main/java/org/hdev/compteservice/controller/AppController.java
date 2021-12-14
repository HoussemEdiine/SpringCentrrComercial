package org.hdev.compteservice.controller;

import org.hdev.compteservice.entities.Boutique;
import org.hdev.compteservice.entities.CentreComercial;
import org.hdev.compteservice.service.BoutiqueService;
import org.hdev.compteservice.service.CentreComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppController {
    @Autowired
    BoutiqueService boutiqueService ;
    @Autowired
    CentreComercialService centreComercialService;
    @PostMapping("/ajoutboutique")
          public  void  ajouterBoutique(@RequestBody Boutique boutique){

        boutiqueService.ajoutBoutique(boutique);

    }
    @PostMapping("/ajoutcentre")
       public  void  ajoutCentreComercial(@RequestBody CentreComercial centreComercial){
          centreComercialService.ajoutCentre(centreComercial);
    }
}
