package FerroVelho;

import java.time.LocalDate;
import java.util.List;

import FerroVelho.Classes.EnumAutomovel;
import FerroVelho.Classes.EnumQualidade;
import FerroVelho.Classes.EnumTipo;
import FerroVelho.Classes.Peca;
import FerroVelho.Classes.Usuario;
import FerroVelho.Classes.Venda;
import FerroVelho.Dados.RepositorioPeca;
import FerroVelho.Dados.RepositorioUsuario;
import FerroVelho.Dados.RepositorioVenda;
import FerroVelho.Negocio.ControladorUsuario;

public class Testes {
    public static void main(String[] args) {
    //Teste dos Enums
	
     //listar valores das enums
    for(EnumAutomovel a : EnumAutomovel.values())
        System.out.printf("%s%n", a);

    for(EnumTipo b : EnumTipo.values()){
        System.out.printf("%s%n", b);
    }

    for(EnumQualidade c : EnumQualidade.values()){
        System.out.printf("%s%n", c);
    }

    //TESTE REPOSITORIO PECA
    RepositorioPeca repositorio = new RepositorioPeca();

    // Adicionar produtos ao repositório
    Peca a = new Peca("Peça A", LocalDate.now(), "Peça A", EnumTipo.PORTA, EnumQualidade.BOM, EnumAutomovel.KOMBI, 19.99);
    Peca b = new Peca("Peça B", LocalDate.now(), "Peça B", EnumTipo.MOTOR, EnumQualidade.MEDIANO, EnumAutomovel.MAQUINA_DO_MISTERIO, 29.99);
    repositorio.adicionarPeca(a);
    repositorio.adicionarPeca(b);

    // Obter e imprimir todos os produtos
    List<Peca> todosProdutos = repositorio.obterTodasPecas();
    for (Peca peca : todasPecas) {
        System.out.println(peca.getId() + ": " + peca.getNome() + " - R$ " + peca.getPreco());
    }

    // Remover produto com ID 1
    repositorio.removerPeca(1);

    // Obter e imprimir todos os produtos novamente
    todosProdutos = repositorio.obterTodasPecas();
    for (Peca peca : todasPecas) {
        System.out.println(peca.getId() + ": " + peca.getNome() + " - R$ " + peca.getPreco());
        }

    //TESTE REPOSITORIO VENDA
        RepositorioVenda repositorioVenda = new RepositorioVenda();

    // Adicionar vendas ao repositório
    Venda c = new Venda("Produto A", 100.0);
    Venda d = new Venda ("Produto B", 99.0);
    repositorioVenda.adicionarVenda(c);
    repositorioVenda.adicionarVenda(d);

    // Obter e imprimir todas as vendas
    List<Venda> todasVendas = repositorioVenda.obterTodasVendas();
    for (Venda venda : todasVendas) {
       System.out.println("ID: " + venda.getCodVenda() + ", Produto: " + venda.getCarrinho() + ", Valor: R$ " + venda.getValorTotal());
    }

    // Remover venda com ID 1
    repositorioVenda.removerVenda(1);

    // Obter e imprimir todas as vendas novamente
    todasVendas = repositorioVenda.obterTodasVendas();
    for (Venda venda : todasVendas) {
        System.out.println("ID: " + venda.getCodVenda() + ", Produto: " + venda.getCarrinho() + ", Valor: R$ " + venda.getValorTotal());
    }

    //TESTE REPOSITORIO USUARIO

    RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
    ControladorUsuario controladorUsuario = new ControladorUsuario(repositorioUsuario);

    // Registrar usuários
    controladorUsuario.registrarUsuarioNormal("Usuário Normal", "normal@email.com", "normal_user", "123456");
    controladorUsuario.registrarUsuarioAdmin("Admin", "admin@email.com", "admin_user", "admin123");

    // Autenticar usuários
    Usuario usuarioNormalAutenticado = controladorUsuario.autenticarUsuario("normal_user", "123456");
    Usuario usuarioAdminAutenticado = controladorUsuario.autenticarUsuario("admin_user", "admin123");

    if (usuarioNormalAutenticado != null) {
        System.out.println("Usuário Normal autenticado: " + usuarioNormalAutenticado.getNome() + " (" + usuarioNormalAutenticado.getTipoUsuario() + ")");
    } 
    else {
        System.out.println("Falha na autenticação do Usuário Normal.");
    }

    if (usuarioAdminAutenticado != null) {
        System.out.println("Usuário Admin autenticado: " + usuarioAdminAutenticado.getNome() + " (" + usuarioAdminAutenticado.getTipoUsuario() + ")");
    } 
    else {
        System.out.println("Falha na autenticação do Usuário Admin.");
    }

    // Obter e imprimir todos os usuários
    List<Usuario> todosUsuarios = controladorUsuario.obterTodosUsuarios();
    System.out.println("\nTodos os usuários registrados:");
    for (Usuario usuario : todosUsuarios) {
        System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Tipo: " + usuario.getTipoUsuario());
    }
}
}
