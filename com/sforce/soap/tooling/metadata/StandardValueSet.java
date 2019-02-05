package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class StandardValueSet extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public StandardValueSet() {}

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
     * element : groupingStringEnum of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean groupingStringEnum__is_set = false;

    private java.lang.String groupingStringEnum;

    public java.lang.String getGroupingStringEnum() {
      return groupingStringEnum;
    }

    public void setGroupingStringEnum(java.lang.String groupingStringEnum) {
      this.groupingStringEnum = groupingStringEnum;
      groupingStringEnum__is_set = true;
    }

    protected void setGroupingStringEnum(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("groupingStringEnum", "urn:metadata.tooling.soap.sforce.com","groupingStringEnum","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setGroupingStringEnum(__typeMapper.readString(__in, _lookupTypeInfo("groupingStringEnum", "urn:metadata.tooling.soap.sforce.com","groupingStringEnum","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldGroupingStringEnum(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("groupingStringEnum", "urn:metadata.tooling.soap.sforce.com","groupingStringEnum","http://www.w3.org/2001/XMLSchema","string",0,1,true), groupingStringEnum, groupingStringEnum__is_set);
    }

    /**
     * element : sorted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean sorted__is_set = false;

    private boolean sorted;

    public boolean getSorted() {
      return sorted;
    }

    public boolean isSorted() {
      return sorted;
    }

    public void setSorted(boolean sorted) {
      this.sorted = sorted;
      sorted__is_set = true;
    }

    protected void setSorted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sorted", "urn:metadata.tooling.soap.sforce.com","sorted","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setSorted(__typeMapper.readBoolean(__in, _lookupTypeInfo("sorted", "urn:metadata.tooling.soap.sforce.com","sorted","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldSorted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sorted", "urn:metadata.tooling.soap.sforce.com","sorted","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), sorted, sorted__is_set);
    }

    /**
     * element : standardValue of type {urn:metadata.tooling.soap.sforce.com}StandardValue
     * java type: com.sforce.soap.tooling.metadata.StandardValue[]
     */
    private boolean standardValue__is_set = false;

    private com.sforce.soap.tooling.metadata.StandardValue[] standardValue = new com.sforce.soap.tooling.metadata.StandardValue[0];

    public com.sforce.soap.tooling.metadata.StandardValue[] getStandardValue() {
      return standardValue;
    }

    public void setStandardValue(com.sforce.soap.tooling.metadata.StandardValue[] standardValue) {
      this.standardValue = standardValue;
      standardValue__is_set = true;
    }

    protected void setStandardValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("standardValue", "urn:metadata.tooling.soap.sforce.com","standardValue","urn:metadata.tooling.soap.sforce.com","StandardValue",0,-1,true))) {
        setStandardValue((com.sforce.soap.tooling.metadata.StandardValue[])__typeMapper.readObject(__in, _lookupTypeInfo("standardValue", "urn:metadata.tooling.soap.sforce.com","standardValue","urn:metadata.tooling.soap.sforce.com","StandardValue",0,-1,true), com.sforce.soap.tooling.metadata.StandardValue[].class));
      }
    }

    private void writeFieldStandardValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("standardValue", "urn:metadata.tooling.soap.sforce.com","standardValue","urn:metadata.tooling.soap.sforce.com","StandardValue",0,-1,true), standardValue, standardValue__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "StandardValueSet");
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
      sb.append("[StandardValueSet ");
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
      writeFieldGroupingStringEnum(__out, __typeMapper);
      writeFieldSorted(__out, __typeMapper);
      writeFieldStandardValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setGroupingStringEnum(__in, __typeMapper);
      setSorted(__in, __typeMapper);
      setStandardValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "groupingStringEnum", groupingStringEnum);
      toStringHelper(sb, "sorted", sorted);
      toStringHelper(sb, "standardValue", standardValue);
    }


}
