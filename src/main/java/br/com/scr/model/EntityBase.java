package br.com.scr.model;

/**EntityBase sera o contrato das entidades da aplicacao 
 * que precisam utilizar recursos do SGBD qualquer entidade 
 * que trabalhe com persistencia de dados devera assinar este contrato. 
 **/
public interface EntityBase {

	//public  Long getId();	
	//public Boolean isExcluido();

	public Long getIdentificador();
	
}