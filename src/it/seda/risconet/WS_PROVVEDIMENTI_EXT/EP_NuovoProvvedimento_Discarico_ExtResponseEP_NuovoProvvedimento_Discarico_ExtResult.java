/**
 * EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.WS_PROVVEDIMENTI_EXT;

public class EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType, org.apache.axis.encoding.MixedContentType {
    private org.apache.axis.message.MessageElement [] _any;

    public EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult() {
    }

    public EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult(
           org.apache.axis.message.MessageElement [] _any) {
           this._any = _any;
    }


    /**
     * Gets the _any value for this EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult)) return false;
        EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult other = (EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_ExtResponse>EP_NuovoProvvedimento_Discarico_ExtResult"));
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
