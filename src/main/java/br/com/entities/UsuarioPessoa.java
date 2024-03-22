package br.com.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuario_pessoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioPessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sobrenome;
    private String login;
    private String senha;
    private int idade;


}
