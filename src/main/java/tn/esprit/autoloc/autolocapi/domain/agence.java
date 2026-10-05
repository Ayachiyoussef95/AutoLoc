package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String ville;

    @Column(length = 255)
    private String adresse;

    @Column(length = 20)
    private String telephone;

    // Association : Agence 1 ---- N Employes
    @OneToMany(mappedBy = "agence")
    private List<employe> employes;

    // Association : Agence 1 ---- N Vehicules
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}