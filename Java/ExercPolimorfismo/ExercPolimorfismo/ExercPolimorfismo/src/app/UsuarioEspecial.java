package app;

public class UsuarioEspecial extends Usuario {

    public UsuarioEspecial(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf, -1, 5);
    }

}