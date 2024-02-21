package com.antobevi.SpringBootPetsWebApp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String species;
    private String gender; // sexo o genero
    private LocalDate birthDate; // solo trabaja con la fecha
    @ManyToOne
    private Vet vet;

}
