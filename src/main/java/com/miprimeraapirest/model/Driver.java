package com.miprimeraapirest.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverid")
    private Long driverid;

    @Column(unique = true,name = "code")
    private String code;
    private String forename;
    private String surname;
    @JsonProperty("dateofBirth")
    private String dob;
    private String nationality;
    private String url;

}