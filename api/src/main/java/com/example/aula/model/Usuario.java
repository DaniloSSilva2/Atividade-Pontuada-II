package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
// Removidas as importações de @Email e @Size, pois não são mais necessárias para email e senha

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    // Atributos email e senha foram removidos

    private String sexo; // Pode ser "Masculino", "Feminino", "Outro" ou um Enum

    @NotNull(message = "Idade é obrigatória.")
    @Min(value = 0, message = "Idade não pode ser negativa.")
    private Integer idade;

    @NotNull(message = "Altura é obrigatória.")
    @Min(value = 0, message = "Altura deve ser um valor positivo.")
    private Double altura; // em metros, ex: 1.75

    @NotNull(message = "Peso é obrigatório.")
    @Min(value = 0, message = "Peso deve ser um valor positivo.")
    private Double peso; // em kg, ex: 70.5

    private String posicao; // Ex: "Atacante", "Defensor", etc.

    @NotNull(message = "Número da camisa é obrigatório.")
    @Min(value = 0, message = "Número da camisa não pode ser negativo.")
    private Integer numeroCamisa;

    public Usuario() {
    }

    // Construtor atualizado sem email e senha
    public Usuario(Long id, String nome, String sexo, Integer idade, Double altura, Double peso, String posicao, Integer numeroCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    // Getters e Setters para email e senha foram removidos

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public @NotNull(message = "Idade é obrigatória.") @Min(value = 0, message = "Idade não pode ser negativa.") Integer getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "Idade é obrigatória.") @Min(value = 0, message = "Idade não pode ser negativa.") Integer idade) {
        this.idade = idade;
    }

    public @NotNull(message = "Altura é obrigatória.") @Min(value = 0, message = "Altura deve ser um valor positivo.") Double getAltura() {
        return altura;
    }

    public void setAltura(@NotNull(message = "Altura é obrigatória.") @Min(value = 0, message = "Altura deve ser um valor positivo.") Double altura) {
        this.altura = altura;
    }

    public @NotNull(message = "Peso é obrigatório.") @Min(value = 0, message = "Peso deve ser um valor positivo.") Double getPeso() {
        return peso;
    }

    public void setPeso(@NotNull(message = "Peso é obrigatório.") @Min(value = 0, message = "Peso deve ser um valor positivo.") Double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public @NotNull(message = "Número da camisa é obrigatório.") @Min(value = 0, message = "Número da camisa não pode ser negativo.") Integer getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(@NotNull(message = "Número da camisa é obrigatório.") @Min(value = 0, message = "Número da camisa não pode ser negativo.") Integer numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
