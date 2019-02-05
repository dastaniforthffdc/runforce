package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlowInputFieldAssignment extends com.sforce.soap.tooling.metadata.FlowBaseElement {

    /**
     * Constructor
     */
    public FlowInputFieldAssignment() {}

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
     * element : field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean field__is_set = false;

    private java.lang.String field;

    public java.lang.String getField() {
      return field;
    }

    public void setField(java.lang.String field) {
      this.field = field;
      field__is_set = true;
    }

    protected void setField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("field", "urn:metadata.tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setField(__typeMapper.readString(__in, _lookupTypeInfo("field", "urn:metadata.tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("field", "urn:metadata.tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), field, field__is_set);
    }

    /**
     * element : value of type {urn:metadata.tooling.soap.sforce.com}FlowElementReferenceOrValue
     * java type: com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue
     */
    private boolean value__is_set = false;

    private com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue value;

    public com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue getValue() {
      return value;
    }

    public void setValue(com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue value) {
      this.value = value;
      value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","urn:metadata.tooling.soap.sforce.com","FlowElementReferenceOrValue",0,1,true))) {
        setValue((com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue)__typeMapper.readObject(__in, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","urn:metadata.tooling.soap.sforce.com","FlowElementReferenceOrValue",0,1,true), com.sforce.soap.tooling.metadata.FlowElementReferenceOrValue.class));
      }
    }

    private void writeFieldValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","urn:metadata.tooling.soap.sforce.com","FlowElementReferenceOrValue",0,1,true), value, value__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "FlowInputFieldAssignment");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
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
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowInputFieldAssignment ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldField(__out, __typeMapper);
      writeFieldValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setField(__in, __typeMapper);
      setValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "field", field);
      toStringHelper(sb, "value", value);
    }


}
