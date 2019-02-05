package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class OrganizationSettingsDetail extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public OrganizationSettingsDetail() {}

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
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : SettingName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SettingName__is_set = false;

    private java.lang.String SettingName;

    public java.lang.String getSettingName() {
      return SettingName;
    }

    public void setSettingName(java.lang.String SettingName) {
      this.SettingName = SettingName;
      SettingName__is_set = true;
    }

    protected void setSettingName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SettingName", "urn:sobject.tooling.soap.sforce.com","SettingName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSettingName(__typeMapper.readString(__in, _lookupTypeInfo("SettingName", "urn:sobject.tooling.soap.sforce.com","SettingName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSettingName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SettingName", "urn:sobject.tooling.soap.sforce.com","SettingName","http://www.w3.org/2001/XMLSchema","string",0,1,true), SettingName, SettingName__is_set);
    }

    /**
     * element : SettingValue of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SettingValue__is_set = false;

    private java.lang.Boolean SettingValue;

    public java.lang.Boolean getSettingValue() {
      return SettingValue;
    }

    public void setSettingValue(java.lang.Boolean SettingValue) {
      this.SettingValue = SettingValue;
      SettingValue__is_set = true;
    }

    protected void setSettingValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SettingValue", "urn:sobject.tooling.soap.sforce.com","SettingValue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSettingValue((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SettingValue", "urn:sobject.tooling.soap.sforce.com","SettingValue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSettingValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SettingValue", "urn:sobject.tooling.soap.sforce.com","SettingValue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SettingValue, SettingValue__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "OrganizationSettingsDetail");
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
      sb.append("[OrganizationSettingsDetail ");
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
      writeFieldDurableId(__out, __typeMapper);
      writeFieldSettingName(__out, __typeMapper);
      writeFieldSettingValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDurableId(__in, __typeMapper);
      setSettingName(__in, __typeMapper);
      setSettingValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "SettingName", SettingName);
      toStringHelper(sb, "SettingValue", SettingValue);
    }


}
