package microServico.ententies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIO")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String primeroNome;
    @Column(name = "SEBRENOME", nullable = false, unique = false)
    private String ultimoNome;
    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;
    @Column(name = "METRICULA", nullable = false, unique = true)
    private String matricula;
    @Column(name = "ATIVIDADE", nullable = false, unique = false)
    private String atividade;
    @Column(name = "DATA_DE_NASCIMENTO", nullable = false, unique = false)
    private String dataDeNascimento;
    @OneToMany
    @JoinTable(name = "PROJETO_USUARIO")
    @JoinColumn(name = "USUARIO_id")
    private Projeto projeto;


}
