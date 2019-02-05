package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ApexResult() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : apexError of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean apexError__is_set = false;

    private java.lang.String apexError;

    public java.lang.String getApexError() {
      return apexError;
    }

    public void setApexError(java.lang.String apexError) {
      this.apexError = apexError;
      apexError__is_set = true;
    }

    protected void setApexError(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("apexError", "urn:tooling.soap.sforce.com","apexError","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setApexError(__typeMapper.readString(__in, _lookupTypeInfo("apexError", "urn:tooling.soap.sforce.com","apexError","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexError(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apexError", "urn:tooling.soap.sforce.com","apexError","http://www.w3.org/2001/XMLSchema","string",1,1,true), apexError, apexError__is_set);
    }

    /**
     * element : apexExecutionResult of type {urn:tooling.soap.sforce.com}ExecuteAnonymousResult
     * java type: com.sforce.soap.tooling.ExecuteAnonymousResult
     */
    private boolean apexExecutionResult__is_set = false;

    private com.sforce.soap.tooling.ExecuteAnonymousResult apexExecutionResult;

    public com.sforce.soap.tooling.ExecuteAnonymousResult getApexExecutionResult() {
      return apexExecutionResult;
    }

    public void setApexExecutionResult(com.sforce.soap.tooling.ExecuteAnonymousResult apexExecutionResult) {
      this.apexExecutionResult = apexExecutionResult;
      apexExecutionResult__is_set = true;
    }

    protected void setApexExecutionResult(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("apexExecutionResult", "urn:tooling.soap.sforce.com","apexExecutionResult","urn:tooling.soap.sforce.com","ExecuteAnonymousResult",1,1,true))) {
        setApexExecutionResult((com.sforce.soap.tooling.ExecuteAnonymousResult)__typeMapper.readObject(__in, _lookupTypeInfo("apexExecutionResult", "urn:tooling.soap.sforce.com","apexExecutionResult","urn:tooling.soap.sforce.com","ExecuteAnonymousResult",1,1,true), com.sforce.soap.tooling.ExecuteAnonymousResult.class));
      }
    }

    private void writeFieldApexExecutionResult(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apexExecutionResult", "urn:tooling.soap.sforce.com","apexExecutionResult","urn:tooling.soap.sforce.com","ExecuteAnonymousResult",1,1,true), apexExecutionResult, apexExecutionResult__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ApexResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldApexError(__out, __typeMapper);
      writeFieldApexExecutionResult(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApexError(__in, __typeMapper);
      setApexExecutionResult(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "apexError", apexError);
      toStringHelper(sb, "apexExecutionResult", apexExecutionResult);
    }


}
