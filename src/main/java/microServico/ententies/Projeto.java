package microServico.ententies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PROJETO")
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "PROJETO", nullable = false, unique = true)
    private String nomeDoProjeto;
    @OneToMany
    @JoinTable(name = "USUARIO_PROJETO")
    @JoinColumn(name = "PROJETO_id")
    private List<Usuario> usuarios = new ArrayList<>();
    @Column(name = "DATA_INICIAL", nullable = false, unique = true)
    private String dataInicial;
    @Column(name = "DATA_FINAL", nullable = false, unique = true)
    private String dataFinal;





}
