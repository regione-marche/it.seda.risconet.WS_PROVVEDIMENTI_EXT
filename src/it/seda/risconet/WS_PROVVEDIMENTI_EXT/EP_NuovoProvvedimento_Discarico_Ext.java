/**
 * EP_NuovoProvvedimento_Discarico_Ext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.WS_PROVVEDIMENTI_EXT;

public class EP_NuovoProvvedimento_Discarico_Ext  implements java.io.Serializable {
    private it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml xml;

    public EP_NuovoProvvedimento_Discarico_Ext() {
    }

    public EP_NuovoProvvedimento_Discarico_Ext(
           it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml xml) {
           this.xml = xml;
    }


    /**
     * Gets the xml value for this EP_NuovoProvvedimento_Discarico_Ext.
     * 
     * @return xml
     */
    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml getXml() {
        return xml;
    }


    /**
     * Sets the xml value for this EP_NuovoProvvedimento_Discarico_Ext.
     * 
     * @param xml
     */
    public void setXml(it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml xml) {
        this.xml = xml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EP_NuovoProvvedimento_Discarico_Ext)) return false;
        EP_NuovoProvvedimento_Discarico_Ext other = (EP_NuovoProvvedimento_Discarico_Ext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xml==null && other.getXml()==null) || 
             (this.xml!=null &&
              this.xml.equals(other.getXml())));
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
        if (getXml() != null) {
            _hashCode += getXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EP_NuovoProvvedimento_Discarico_Ext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">EP_NuovoProvvedimento_Discarico_Ext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "xml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_Ext>xml"));
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
