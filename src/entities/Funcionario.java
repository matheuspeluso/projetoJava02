package entities;
//classe de modelo de dados de entidade

import java.util.Date;

import enums.TipoContratacao;

public class Funcionario extends Pessoa { // funcionario herda pessoa
	private String matricula;
	private Date dataAdmissao;
	private TipoContratacao tipoContratacao;

	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}


}
