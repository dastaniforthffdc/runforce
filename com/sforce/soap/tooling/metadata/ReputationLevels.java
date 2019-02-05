package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ReputationLevels implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ReputationLevels() {}

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
     * element : chatterAnswersReputationLevels of type {urn:metadata.tooling.soap.sforce.com}ChatterAnswersReputationLevel
     * java type: com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[]
     */
    private boolean chatterAnswersReputationLevels__is_set = false;

    private com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[] chatterAnswersReputationLevels = new com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[0];

    public com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[] getChatterAnswersReputationLevels() {
      return chatterAnswersReputationLevels;
    }

    public void setChatterAnswersReputationLevels(com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[] chatterAnswersReputationLevels) {
      this.chatterAnswersReputationLevels = chatterAnswersReputationLevels;
      chatterAnswersReputationLevels__is_set = true;
    }

    protected void setChatterAnswersReputationLevels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("chatterAnswersReputationLevels", "urn:metadata.tooling.soap.sforce.com","chatterAnswersReputationLevels","urn:metadata.tooling.soap.sforce.com","ChatterAnswersReputationLevel",0,-1,true))) {
        setChatterAnswersReputationLevels((com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[])__typeMapper.readObject(__in, _lookupTypeInfo("chatterAnswersReputationLevels", "urn:metadata.tooling.soap.sforce.com","chatterAnswersReputationLevels","urn:metadata.tooling.soap.sforce.com","ChatterAnswersReputationLevel",0,-1,true), com.sforce.soap.tooling.metadata.ChatterAnswersReputationLevel[].class));
      }
    }

    private void writeFieldChatterAnswersReputationLevels(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("chatterAnswersReputationLevels", "urn:metadata.tooling.soap.sforce.com","chatterAnswersReputationLevels","urn:metadata.tooling.soap.sforce.com","ChatterAnswersReputationLevel",0,-1,true), chatterAnswersReputationLevels, chatterAnswersReputationLevels__is_set);
    }

    /**
     * element : ideaReputationLevels of type {urn:metadata.tooling.soap.sforce.com}IdeaReputationLevel
     * java type: com.sforce.soap.tooling.metadata.IdeaReputationLevel[]
     */
    private boolean ideaReputationLevels__is_set = false;

    private com.sforce.soap.tooling.metadata.IdeaReputationLevel[] ideaReputationLevels = new com.sforce.soap.tooling.metadata.IdeaReputationLevel[0];

    public com.sforce.soap.tooling.metadata.IdeaReputationLevel[] getIdeaReputationLevels() {
      return ideaReputationLevels;
    }

    public void setIdeaReputationLevels(com.sforce.soap.tooling.metadata.IdeaReputationLevel[] ideaReputationLevels) {
      this.ideaReputationLevels = ideaReputationLevels;
      ideaReputationLevels__is_set = true;
    }

    protected void setIdeaReputationLevels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ideaReputationLevels", "urn:metadata.tooling.soap.sforce.com","ideaReputationLevels","urn:metadata.tooling.soap.sforce.com","IdeaReputationLevel",0,-1,true))) {
        setIdeaReputationLevels((com.sforce.soap.tooling.metadata.IdeaReputationLevel[])__typeMapper.readObject(__in, _lookupTypeInfo("ideaReputationLevels", "urn:metadata.tooling.soap.sforce.com","ideaReputationLevels","urn:metadata.tooling.soap.sforce.com","IdeaReputationLevel",0,-1,true), com.sforce.soap.tooling.metadata.IdeaReputationLevel[].class));
      }
    }

    private void writeFieldIdeaReputationLevels(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ideaReputationLevels", "urn:metadata.tooling.soap.sforce.com","ideaReputationLevels","urn:metadata.tooling.soap.sforce.com","IdeaReputationLevel",0,-1,true), ideaReputationLevels, ideaReputationLevels__is_set);
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
      sb.append("[ReputationLevels ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldChatterAnswersReputationLevels(__out, __typeMapper);
      writeFieldIdeaReputationLevels(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setChatterAnswersReputationLevels(__in, __typeMapper);
      setIdeaReputationLevels(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "chatterAnswersReputationLevels", chatterAnswersReputationLevels);
      toStringHelper(sb, "ideaReputationLevels", ideaReputationLevels);
    }


}
