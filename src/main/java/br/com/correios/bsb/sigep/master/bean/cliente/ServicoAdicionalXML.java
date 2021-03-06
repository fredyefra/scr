/**
 * ServicoAdicionalXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ServicoAdicionalXML  implements java.io.Serializable {
    private java.lang.String categoria;

    private java.lang.String codigo;

    private java.lang.String descricao;

    private java.lang.Double maximoValorDeclarado;

    private java.lang.Double minimoValorDeclarado;

    private java.lang.String sigla;

    public ServicoAdicionalXML() {
    }

    public ServicoAdicionalXML(
           java.lang.String categoria,
           java.lang.String codigo,
           java.lang.String descricao,
           java.lang.Double maximoValorDeclarado,
           java.lang.Double minimoValorDeclarado,
           java.lang.String sigla) {
           this.categoria = categoria;
           this.codigo = codigo;
           this.descricao = descricao;
           this.maximoValorDeclarado = maximoValorDeclarado;
           this.minimoValorDeclarado = minimoValorDeclarado;
           this.sigla = sigla;
    }


    /**
     * Gets the categoria value for this ServicoAdicionalXML.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ServicoAdicionalXML.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the codigo value for this ServicoAdicionalXML.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ServicoAdicionalXML.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descricao value for this ServicoAdicionalXML.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ServicoAdicionalXML.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the maximoValorDeclarado value for this ServicoAdicionalXML.
     * 
     * @return maximoValorDeclarado
     */
    public java.lang.Double getMaximoValorDeclarado() {
        return maximoValorDeclarado;
    }


    /**
     * Sets the maximoValorDeclarado value for this ServicoAdicionalXML.
     * 
     * @param maximoValorDeclarado
     */
    public void setMaximoValorDeclarado(java.lang.Double maximoValorDeclarado) {
        this.maximoValorDeclarado = maximoValorDeclarado;
    }


    /**
     * Gets the minimoValorDeclarado value for this ServicoAdicionalXML.
     * 
     * @return minimoValorDeclarado
     */
    public java.lang.Double getMinimoValorDeclarado() {
        return minimoValorDeclarado;
    }


    /**
     * Sets the minimoValorDeclarado value for this ServicoAdicionalXML.
     * 
     * @param minimoValorDeclarado
     */
    public void setMinimoValorDeclarado(java.lang.Double minimoValorDeclarado) {
        this.minimoValorDeclarado = minimoValorDeclarado;
    }


    /**
     * Gets the sigla value for this ServicoAdicionalXML.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this ServicoAdicionalXML.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicoAdicionalXML)) return false;
        ServicoAdicionalXML other = (ServicoAdicionalXML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.maximoValorDeclarado==null && other.getMaximoValorDeclarado()==null) || 
             (this.maximoValorDeclarado!=null &&
              this.maximoValorDeclarado.equals(other.getMaximoValorDeclarado()))) &&
            ((this.minimoValorDeclarado==null && other.getMinimoValorDeclarado()==null) || 
             (this.minimoValorDeclarado!=null &&
              this.minimoValorDeclarado.equals(other.getMinimoValorDeclarado()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getMaximoValorDeclarado() != null) {
            _hashCode += getMaximoValorDeclarado().hashCode();
        }
        if (getMinimoValorDeclarado() != null) {
            _hashCode += getMinimoValorDeclarado().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicoAdicionalXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximoValorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximoValorDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimoValorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimoValorDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
