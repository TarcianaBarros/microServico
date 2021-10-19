package microServico;

import microServico.ententies.Usuario;
import microServico.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServicoTest implements CommandLineRunner{

    @Autowired
    UsuarioServices usuarioServices;

    public static void main(String[] args) {
        SpringBootApplication.run(MicroServicoTest.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inicio da execução");

        Usuario usuario1 = new Usuario();
        usuario1.setPrimeroNome("Tarciana");
        usuario1.setCpf("011.588.474-24");
    }
}
