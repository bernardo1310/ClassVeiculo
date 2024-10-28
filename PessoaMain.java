
public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Curvello");
		p.setEndereco("Rua Principal");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Rodrigo");
		pf.setEndereco("Rua Nova");
		pf.setCpf("123.456.789-00");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Bernardo");
		pj.setEndereco("Rua gabir");
		pj.setCnpj("42.321.543/0001-21");
		pj.setTipoEmpresa("SA");
		System.out.println(pj);
	}
}
