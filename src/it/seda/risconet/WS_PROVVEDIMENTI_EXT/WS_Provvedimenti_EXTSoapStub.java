/**
 * WS_Provvedimenti_EXTSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.WS_PROVVEDIMENTI_EXT;

public class WS_Provvedimenti_EXTSoapStub extends org.apache.axis.client.Stub implements it.seda.risconet.WS_PROVVEDIMENTI_EXT.WS_Provvedimenti_EXTSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteRequest_NEW");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest_NEW>xml"), it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWXml.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest_NEWResponse>ExecuteRequest_NEWResult"));
        oper.setReturnClass(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteRequest_NEWResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteOperation>xml"), it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationXml.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteOperationResponse>ExecuteOperationResult"));
        oper.setReturnClass(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteOperationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest>xml"), it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestXml.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequestResponse>ExecuteRequestResult"));
        oper.setReturnClass(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteRequestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("test");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Test_EP_NuovoProvvedimento_Discarico_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "XML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_EP_NuovoProvvedimento_Discarico_ExtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EP_NuovoProvvedimento_Discarico_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_Ext>xml"), it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_ExtResponse>EP_NuovoProvvedimento_Discarico_ExtResult"));
        oper.setReturnClass(it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "EP_NuovoProvvedimento_Discarico_ExtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Test_ExecuteOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "XML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>Test_ExecuteOperationResponse>Test_ExecuteOperationResult"));
        oper.setReturnClass(it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ExecuteOperationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public WS_Provvedimenti_EXTSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WS_Provvedimenti_EXTSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WS_Provvedimenti_EXTSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_Ext>xml");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Discarico_ExtResponse>EP_NuovoProvvedimento_Discarico_ExtResult");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteOperation>xml");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationXml.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteOperationResponse>ExecuteOperationResult");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest>xml");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestXml.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest_NEW>xml");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWXml.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest_NEWResponse>ExecuteRequest_NEWResult");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequestResponse>ExecuteRequestResult");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>Test_ExecuteOperationResponse>Test_ExecuteOperationResult");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">EP_NuovoProvvedimento_Discarico_Ext");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_Ext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">EP_NuovoProvvedimento_Discarico_ExtResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteOperation");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteOperationResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteRequest");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteRequest_NEWResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteRequestResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">test");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_EP_NuovoProvvedimento_Discarico_Ext");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_EP_NuovoProvvedimento_Discarico_Ext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_EP_NuovoProvvedimento_Discarico_ExtResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_EP_NuovoProvvedimento_Discarico_ExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ExecuteOperation");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ExecuteOperationResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">testResponse");
            cachedSerQNames.add(qName);
            cls = it.seda.risconet.WS_PROVVEDIMENTI_EXT.TestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult executeRequest_NEW(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWXml xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/ExecuteRequest_NEW");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteRequest_NEW"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult) org.apache.axis.utils.JavaUtils.convert(_resp, it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequest_NEWResponseExecuteRequest_NEWResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult executeOperation(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationXml xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/ExecuteOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteOperationResponseExecuteOperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult executeRequest(it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestXml xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/ExecuteRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, it.seda.risconet.WS_PROVVEDIMENTI_EXT.ExecuteRequestResponseExecuteRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void test() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/test");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "test"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String test_EP_NuovoProvvedimento_Discarico_Ext(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/Test_EP_NuovoProvvedimento_Discarico_Ext");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_EP_NuovoProvvedimento_Discarico_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {XML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult EP_NuovoProvvedimento_Discarico_Ext(it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtXml xml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/EP_NuovoProvvedimento_Discarico_Ext");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "EP_NuovoProvvedimento_Discarico_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {xml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult) org.apache.axis.utils.JavaUtils.convert(_resp, it.seda.risconet.WS_PROVVEDIMENTI_EXT.EP_NuovoProvvedimento_Discarico_ExtResponseEP_NuovoProvvedimento_Discarico_ExtResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult test_ExecuteOperation(java.lang.String XML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/Test_ExecuteOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ExecuteOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {XML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, it.seda.risconet.WS_PROVVEDIMENTI_EXT.Test_ExecuteOperationResponseTest_ExecuteOperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
