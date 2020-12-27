package br.com.scr.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-12-24T17:01:52.929-0300")
@StaticMetamodel(Pedido.class)
public class Pedido_ {
	public static volatile SingularAttribute<Pedido, Long> pedido_identificador;
	public static volatile SingularAttribute<Pedido, String> observacao;
	public static volatile SingularAttribute<Pedido, Cliente> cliente;
}
