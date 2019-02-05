package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class LwcResource implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public LwcResource() {}

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
     * element : filePath of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean filePath__is_set = false;

    private java.lang.String filePath;

    public java.lang.String getFilePath() {
      return filePath;
    }

    public void setFilePath(java.lang.String filePath) {
      this.filePath = filePath;
      filePath__is_set = true;
    }

    protected void setFilePath(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("filePath", "urn:metadata.tooling.soap.sforce.com","filePath","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setFilePath(__typeMapper.readString(__in, _lookupTypeInfo("filePath", "urn:metadata.tooling.soap.sforce.com","filePath","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFilePath(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("filePath", "urn:metadata.tooling.soap.sforce.com","filePath","http://www.w3.org/2001/XMLSchema","string",1,1,true), filePath, filePath__is_set);
    }

    /**
     * element : source of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean source__is_set = false;

    private byte[] source;

    public byte[] getSource() {
      return source;
    }

    public void setSource(byte[] source) {
      this.source = source;
      source__is_set = true;
    }

    protected void setSource(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("source", "urn:metadata.tooling.soap.sforce.com","source","http://www.w3.org/2001/XMLSchema","base64Binary",1,1,true))) {
        setSource((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("source", "urn:metadata.tooling.soap.sforce.com","source","http://www.w3.org/2001/XMLSchema","base64Binary",1,1,true), byte[].class));
      }
    }

    private void writeFieldSource(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("source", "urn:metadata.tooling.soap.sforce.com","source","http://www.w3.org/2001/XMLSchema","base64Binary",1,1,true), source, source__is_set);
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
      sb.append("[LwcResource ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldFilePath(__out, __typeMapper);
      writeFieldSource(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setFilePath(__in, __typeMapper);
      setSource(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "filePath", filePath);
      toStringHelper(sb, "source", source);
    }


}
