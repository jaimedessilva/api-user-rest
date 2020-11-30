package br.com.projeto;

import br.com.projeto.dao.RepositoryDao;

public class M {

	public static void main(String[] args) {
		
		RepositoryDao repository = new RepositoryDao();

//		repository.add(new Usuario("Ted Denson",35));
//		repository.add(new Usuario("Carlton Banks",39));
//		repository.add(new Usuario("Rimory Dor",30));
		
//		repository.add(new Usuario("Tadeu Santos",30));
		
		
		//repository.create(new Usuario("Morais Santos",35));
		
		//repository.update(new Usuario(5,"Romeu",33));
		
		//System.out.println(repository.byId(3));
		//System.out.println(repository.getId(3));
//		
//		int size = repository.listar().size();
//		System.out.println(repository.listar());
		//System.out.println(repository.listar());
		
		//repository.update(new Usuario (5,"Romeu Zema",37));
		
		repository.delete(9);
		
	}

}
