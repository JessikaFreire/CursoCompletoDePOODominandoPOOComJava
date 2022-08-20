package Projeto02EvoluindoComClasses;

public class Pessoa {
    /**
     * Metodos Acessores
     * 
     * Public: Qualquer um pode acessar o elemento
     * Private: Somente a classe consegue acessar
     * Protected: Somente a classe e seus filhos conseguem acessar
     * Default: Somente a classe, seus filhos e as classes no mesmo package podem
     * acessar
     */

    // Atributos
    private String nome;
    private Integer idade;

    // Getters e Setters
    public void setNome(String nome) {
        // Aqui pode ter validações
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        // Aqui pode ter validações
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }

}