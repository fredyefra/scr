/**
 * AtendeClienteServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class AtendeClienteServiceSoapBindingSkeleton implements br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente, org.apache.axis.wsdl.Skeleton {
    private br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaServicosAdicionaisAtivos", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalXML"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosAdicionaisAtivos"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaServicosAdicionaisAtivos") == null) {
            _myOperations.put("buscaServicosAdicionaisAtivos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaServicosAdicionaisAtivos")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "faixaEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fechaPlp", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fechaPlp") == null) {
            _myOperations.put("fechaPlp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fechaPlp")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diretoria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unidadePostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servicosAdicionais"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validaPlp", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaPlp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validaPlp") == null) {
            _myOperations.put("validaPlp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validaPlp")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepOrigem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "peso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codFormato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comprimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "altura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "largura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codMaoPropria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valorDeclarado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAvisoRecebimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calculaTarifaServico", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "calculaTarifaServico"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calculaTarifaServico") == null) {
            _myOperations.put("calculaTarifaServico", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calculaTarifaServico")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal"), br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verificaSeTodosObjetosCancelados", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "VerificaSeTodosObjetosCancelados"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verificaSeTodosObjetosCancelados") == null) {
            _myOperations.put("verificaSeTodosObjetosCancelados", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verificaSeTodosObjetosCancelados")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cancelarObjeto", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarObjeto"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cancelarObjeto") == null) {
            _myOperations.put("cancelarObjeto", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cancelarObjeto")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "prefix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pesquisarParametrosPorDescricao", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "dimensaoTO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarParametrosPorDescricao"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pesquisarParametrosPorDescricao") == null) {
            _myOperations.put("pesquisarParametrosPorDescricao", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pesquisarParametrosPorDescricao")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("atualizaPagamentoNaEntrega", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaPagamentoNaEntrega"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("atualizaPagamentoNaEntrega") == null) {
            _myOperations.put("atualizaPagamentoNaEntrega", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("atualizaPagamentoNaEntrega")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cnpjCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obterClienteAtualizacao", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterClienteAtualizacao"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obterClienteAtualizacao") == null) {
            _myOperations.put("obterClienteAtualizacao", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obterClienteAtualizacao")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepOrigem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verificaDisponibilidadeServico", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaDisponibilidadeServico"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verificaDisponibilidadeServico") == null) {
            _myOperations.put("verificaDisponibilidadeServico", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verificaDisponibilidadeServico")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fechaPlpVariosServicos", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "fechaPlpVariosServicos"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fechaPlpVariosServicos") == null) {
            _myOperations.put("fechaPlpVariosServicos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fechaPlpVariosServicos")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("geraDigitoVerificadorEtiquetas", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "geraDigitoVerificadorEtiquetas"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("geraDigitoVerificadorEtiquetas") == null) {
            _myOperations.put("geraDigitoVerificadorEtiquetas", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("geraDigitoVerificadorEtiquetas")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("obterEmbalagemLRS", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "embalagemLRSMaster"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterEmbalagemLRS"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obterEmbalagemLRS") == null) {
            _myOperations.put("obterEmbalagemLRS", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obterEmbalagemLRS")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validaEtiquetaPLP", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validaEtiquetaPLP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validaEtiquetaPLP") == null) {
            _myOperations.put("validaEtiquetaPLP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validaEtiquetaPLP")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaServicosValorDeclarado", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosValorDeclarado"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaServicosValorDeclarado") == null) {
            _myOperations.put("buscaServicosValorDeclarado", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaServicosValorDeclarado")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultaCEP", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "enderecoERP"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultaCEP") == null) {
            _myOperations.put("consultaCEP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultaCEP")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("integrarUsuarioScol", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "integrarUsuarioScol"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("integrarUsuarioScol") == null) {
            _myOperations.put("integrarUsuarioScol", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("integrarUsuarioScol")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "embalagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pesquisarDimensoesServico", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "dimensaoTO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarDimensoesServico"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pesquisarDimensoesServico") == null) {
            _myOperations.put("pesquisarDimensoesServico", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pesquisarDimensoesServico")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pesquisarEmbalagensPorServico", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoEmbalagem"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarEmbalagensPorServico"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pesquisarEmbalagensPorServico") == null) {
            _myOperations.put("pesquisarEmbalagensPorServico", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pesquisarEmbalagensPorServico")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("atualizaRemessaAgrupada", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "atualizaRemessaAgrupada"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("atualizaRemessaAgrupada") == null) {
            _myOperations.put("atualizaRemessaAgrupada", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("atualizaRemessaAgrupada")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpMaster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("solicitaPLP", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaPLP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("solicitaPLP") == null) {
            _myOperations.put("solicitaPLP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("solicitaPLP")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStatusCartaoPostagem", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusCartao"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusCartaoPostagem"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStatusCartaoPostagem") == null) {
            _myOperations.put("getStatusCartaoPostagem", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStatusCartaoPostagem")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepOrigem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verificaModalTransporte", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "verificaModalTransporte"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verificaModalTransporte") == null) {
            _myOperations.put("verificaModalTransporte", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verificaModalTransporte")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaDataAtual", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaDataAtual"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaDataAtual") == null) {
            _myOperations.put("buscaDataAtual", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaDataAtual")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepOrigem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "peso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codFormato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "comprimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "altura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "largura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valorDeclarado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), java.lang.Double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "servicoAdicional"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaTarifaVale", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "valePostal"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaTarifaVale"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaTarifaVale") == null) {
            _myOperations.put("buscaTarifaVale", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaTarifaVale")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "coleta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaSimultanea"), br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validarPostagemSimultanea", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemSimultanea"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validarPostagemSimultanea") == null) {
            _myOperations.put("validarPostagemSimultanea", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validarPostagemSimultanea")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal"), br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStatusPLP", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusPlp"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "getStatusPLP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStatusPLP") == null) {
            _myOperations.put("getStatusPLP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStatusPLP")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pesquisarServicosAdicionais", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalTO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "pesquisarServicosAdicionais"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pesquisarServicosAdicionais") == null) {
            _myOperations.put("pesquisarServicosAdicionais", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pesquisarServicosAdicionais")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaServicosXServicosAdicionais", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicosXServicosAdicionais"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaServicosXServicosAdicionais") == null) {
            _myOperations.put("buscaServicosXServicosAdicionais", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaServicosXServicosAdicionais")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SQLException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SQLException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SQLException"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cancelarPedidoScol", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retornoCancelamento"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cancelarPedidoScol"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cancelarPedidoScol") == null) {
            _myOperations.put("cancelarPedidoScol", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cancelarPedidoScol")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroEtiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoBloqueio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoBloqueio"), br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "acao"), br.com.correios.bsb.sigep.master.bean.cliente.Acao.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bloquearObjeto", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "bloquearObjeto"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bloquearObjeto") == null) {
            _myOperations.put("bloquearObjeto", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bloquearObjeto")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numero"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "diretoria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaContrato", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERP"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaContrato"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaContrato") == null) {
            _myOperations.put("buscaContrato", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaContrato")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "identificador"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qtdEtiquetas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("solicitaEtiquetas", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaEtiquetas"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("solicitaEtiquetas") == null) {
            _myOperations.put("solicitaEtiquetas", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("solicitaEtiquetas")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPlpMaster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("solicitaXmlPlp", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitaXmlPlp"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("solicitaXmlPlp") == null) {
            _myOperations.put("solicitaXmlPlp", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("solicitaXmlPlp")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoServico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepDestinatario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "coleta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coletaReversa"), br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validarPostagemReversa", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "validarPostagemReversa"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validarPostagemReversa") == null) {
            _myOperations.put("validarPostagemReversa", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validarPostagemReversa")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idContrato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaCliente", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaCliente"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaCliente") == null) {
            _myOperations.put("buscaCliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaCliente")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contrato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataFim"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etiqueta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaPagamentoEntrega", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaPagamentoEntrega"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaPagamentoEntrega") == null) {
            _myOperations.put("buscaPagamentoEntrega", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaPagamentoEntrega")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("ErroMontagemRelatorio");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "ErroMontagemRelatorio"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio");
        _fault.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "ErroMontagemRelatorio"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codAdministrativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("solicitarPostagemScol", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "solicitarPostagemScol"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("solicitarPostagemScol") == null) {
            _myOperations.put("solicitarPostagemScol", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("solicitarPostagemScol")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idContrato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCartaoPostagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaServicos", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoERP"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaServicos"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaServicos") == null) {
            _myOperations.put("buscaServicos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaServicos")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("AutenticacaoException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obterMensagemParametrizada", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "mensagemParametrizadaTO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "obterMensagemParametrizada"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obterMensagemParametrizada") == null) {
            _myOperations.put("obterMensagemParametrizada", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obterMensagemParametrizada")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaObjetos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipoResultado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaOpcoes", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "buscaOpcoes"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaOpcoes") == null) {
            _myOperations.put("buscaOpcoes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaOpcoes")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("SigepClienteException");
        _fault.setQName(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException"));
        _fault.setClassName("br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
    }

    public AtendeClienteServiceSoapBindingSkeleton() {
        this.impl = new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceSoapBindingImpl();
    }

    public AtendeClienteServiceSoapBindingSkeleton(br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente impl) {
        this.impl = impl;
    }
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] buscaServicosAdicionaisAtivos(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] ret = impl.buscaServicosAdicionaisAtivos(usuario, senha);
        return ret;
    }

    public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.Long ret = impl.fechaPlp(xml, idPlpCliente, cartaoPostagem, faixaEtiquetas, usuario, senha);
        return ret;
    }

    public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.lang.String[] servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        boolean ret = impl.validaPlp(cliente, numero, diretoria, cartao, unidadePostagem, servico, servicosAdicionais, usuario, senha);
        return ret;
    }

    public java.lang.String calculaTarifaServico(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double diametro, java.lang.String codMaoPropria, java.lang.Double valorDeclarado, java.lang.String codAvisoRecebimento) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception
    {
        java.lang.String ret = impl.calculaTarifaServico(codAdministrativo, usuario, senha, codServico, cepOrigem, cepDestino, peso, codFormato, comprimento, altura, largura, diametro, codMaoPropria, valorDeclarado, codAvisoRecebimento);
        return ret;
    }

    public boolean verificaSeTodosObjetosCancelados(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        boolean ret = impl.verificaSeTodosObjetosCancelados(arg0);
        return ret;
    }

    public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception
    {
        java.lang.Boolean ret = impl.cancelarObjeto(idPlp, numeroEtiqueta, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarParametrosPorDescricao(java.lang.String prefix) throws java.rmi.RemoteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO ret = impl.pesquisarParametrosPorDescricao(prefix);
        return ret;
    }

    public java.lang.String atualizaPagamentoNaEntrega(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.atualizaPagamentoNaEntrega(usuario, senha);
        return ret;
    }

    public java.util.Calendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.util.Calendar ret = impl.obterClienteAtualizacao(cnpjCliente, usuario, senha);
        return ret;
    }

    public java.lang.String verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.verificaDisponibilidadeServico(codAdministrativo, numeroServico, cepOrigem, cepDestino, usuario, senha);
        return ret;
    }

    public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String[] listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.Long ret = impl.fechaPlpVariosServicos(xml, idPlpCliente, cartaoPostagem, listaEtiquetas, usuario, senha);
        return ret;
    }

    public int[] geraDigitoVerificadorEtiquetas(java.lang.String[] etiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        int[] ret = impl.geraDigitoVerificadorEtiquetas(etiquetas, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[] obterEmbalagemLRS() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[] ret = impl.obterEmbalagemLRS();
        return ret;
    }

    public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        boolean ret = impl.validaEtiquetaPLP(numeroEtiqueta, idPlp, usuario, senha);
        return ret;
    }

    public java.lang.String[] buscaServicosValorDeclarado(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String[] ret = impl.buscaServicosValorDeclarado(usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP ret = impl.consultaCEP(cep);
        return ret;
    }

    public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.Boolean ret = impl.integrarUsuarioScol(codAdministrativo, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarDimensoesServico(java.lang.String codigo, java.lang.String embalagem) throws java.rmi.RemoteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO ret = impl.pesquisarDimensoesServico(codigo, embalagem);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] pesquisarEmbalagensPorServico(java.lang.String codigo) throws java.rmi.RemoteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] ret = impl.pesquisarEmbalagensPorServico(codigo);
        return ret;
    }

    public java.lang.String atualizaRemessaAgrupada(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.atualizaRemessaAgrupada(usuario, senha);
        return ret;
    }

    public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.solicitaPLP(idPlpMaster, numEtiqueta, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao ret = impl.getStatusCartaoPostagem(numeroCartaoPostagem, usuario, senha);
        return ret;
    }

    public java.lang.String verificaModalTransporte(java.lang.String codigoServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.verificaModalTransporte(codigoServico, cepOrigem, cepDestino, usuario, senha);
        return ret;
    }

    public java.util.Calendar buscaDataAtual() throws java.rmi.RemoteException
    {
        java.util.Calendar ret = impl.buscaDataAtual();
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ValePostal buscaTarifaVale(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double valorDeclarado, java.lang.String servicoAdicional) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ValePostal ret = impl.buscaTarifaVale(codAdministrativo, usuario, senha, codServico, cepOrigem, cepDestino, peso, codFormato, comprimento, altura, largura, valorDeclarado, servicoAdicional);
        return ret;
    }

    public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String idCartaoPostagem, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.Boolean ret = impl.validarPostagemSimultanea(codAdministrativo, codigoServico, idCartaoPostagem, cepDestinatario, coleta, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp ret = impl.getStatusPLP(arg0, arg1);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO[] pesquisarServicosAdicionais(java.lang.String codigo) throws java.rmi.RemoteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO[] ret = impl.pesquisarServicosAdicionais(codigo);
        return ret;
    }

    public java.lang.String[] buscaServicosXServicosAdicionais(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String[] ret = impl.buscaServicosXServicosAdicionais(usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento cancelarPedidoScol(java.lang.String codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento ret = impl.cancelarPedidoScol(codAdministrativo, idPostagem, tipo, usuario, senha);
        return ret;
    }

    public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.bloquearObjeto(numeroEtiqueta, idPlp, tipoBloqueio, acao, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP ret = impl.buscaContrato(numero, diretoria, usuario, senha);
        return ret;
    }

    public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.solicitaEtiquetas(tipoDestinatario, identificador, idServico, qtdEtiquetas, usuario, senha);
        return ret;
    }

    public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.solicitaXmlPlp(idPlpMaster, usuario, senha);
        return ret;
    }

    public java.lang.Boolean validarPostagemReversa(java.lang.String codAdministrativo, java.lang.String codigoServico, java.lang.String cepDestinatario, java.lang.String idCartaoPostagem, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.Boolean ret = impl.validarPostagemReversa(codAdministrativo, codigoServico, cepDestinatario, idCartaoPostagem, coleta, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP ret = impl.buscaCliente(idContrato, idCartaoPostagem, usuario, senha);
        return ret;
    }

    public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha, java.lang.String contrato, java.lang.String dataInicio, java.lang.String dataFim, java.lang.String etiqueta) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.buscaPagamentoEntrega(usuario, senha, contrato, dataInicio, dataFim, etiqueta);
        return ret;
    }

    public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.solicitarPostagemScol(codAdministrativo, xml, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] ret = impl.buscaServicos(idContrato, idCartaoPostagem, usuario, senha);
        return ret;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO obterMensagemParametrizada(java.lang.Short id) throws java.rmi.RemoteException
    {
        br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO ret = impl.obterMensagemParametrizada(id);
        return ret;
    }

    public java.lang.String buscaOpcoes(java.lang.String[] listaObjetos, java.lang.String tipoResultado, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException
    {
        java.lang.String ret = impl.buscaOpcoes(listaObjetos, tipoResultado, usuario, senha);
        return ret;
    }

}
