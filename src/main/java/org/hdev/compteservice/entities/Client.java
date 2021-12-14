package org.hdev.compteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hdev.compteservice.enums.Genre;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name ;
    @Enumerated(EnumType.STRING)
    private Genre genre ;
    @ManyToMany(mappedBy = "client")
    Set<Boutique> boutique ;
}
