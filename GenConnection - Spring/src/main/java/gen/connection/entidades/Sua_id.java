package gen.connection.entidades;

public enum Sua_id {
	
	    Aluno("aluno", "1") ,
	    Professor("professor", "2"),
	    Pais("pais", "3");
	
	
	
	private String user;
	private String opcao;
	

	Sua_id(String user, String opcao) {
		this.user = user;
        this.opcao = opcao;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getOpcao() {
		return opcao;
	}


	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	
}
