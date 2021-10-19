package microServico.services;

import microServico.Util.CpfUtil;
import microServico.dao.UsuarioDao;
import microServico.ententies.Usuario;
import microServico.exceptions.UsuarioInvalidoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioDao usuarioDao;

    public void salvar(Usuario usuario) {
        if(CpfUtil.isCPF(usuario.getCpf())){
            throw new UsuarioInvalidoException("Erro ao cadastrar usuario" + usuario + "CPF inválido");
        }
        try {
            usuarioDao.save(usuario);

        }catch (DataIntegrityViolationException e){
            usuario.setId(usuarioDao.findById(usuario.getCpf()).getId());
        }

    }


}
