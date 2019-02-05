package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexTriggerMember extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public ApexTriggerMember() {}

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
     * element : Body of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Body__is_set = false;

    private java.lang.String Body;

    public java.lang.String getBody() {
      return Body;
    }

    public void setBody(java.lang.String Body) {
      this.Body = Body;
      Body__is_set = true;
    }

    protected void setBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Body", "urn:sobject.tooling.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setBody(__typeMapper.readString(__in, _lookupTypeInfo("Body", "urn:sobject.tooling.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldBody(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Body", "urn:sobject.tooling.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","string",0,1,true), Body, Body__is_set);
    }

    /**
     * element : Content of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Content__is_set = false;

    private java.lang.String Content;

    public java.lang.String getContent() {
      return Content;
    }

    public void setContent(java.lang.String Content) {
      this.Content = Content;
      Content__is_set = true;
    }

    protected void setContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Content", "urn:sobject.tooling.soap.sforce.com","Content","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setContent(__typeMapper.readString(__in, _lookupTypeInfo("Content", "urn:sobject.tooling.soap.sforce.com","Content","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Content", "urn:sobject.tooling.soap.sforce.com","Content","http://www.w3.org/2001/XMLSchema","string",0,1,true), Content, Content__is_set);
    }

    /**
     * element : ContentEntity of type {urn:sobject.tooling.soap.sforce.com}ApexTrigger
     * java type: com.sforce.soap.tooling.sobject.ApexTrigger
     */
    private boolean ContentEntity__is_set = false;

    private com.sforce.soap.tooling.sobject.ApexTrigger ContentEntity;

    public com.sforce.soap.tooling.sobject.ApexTrigger getContentEntity() {
      return ContentEntity;
    }

    public void setContentEntity(com.sforce.soap.tooling.sobject.ApexTrigger ContentEntity) {
      this.ContentEntity = ContentEntity;
      ContentEntity__is_set = true;
    }

    protected void setContentEntity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentEntity", "urn:sobject.tooling.soap.sforce.com","ContentEntity","urn:sobject.tooling.soap.sforce.com","ApexTrigger",0,1,true))) {
        setContentEntity((com.sforce.soap.tooling.sobject.ApexTrigger)__typeMapper.readObject(__in, _lookupTypeInfo("ContentEntity", "urn:sobject.tooling.soap.sforce.com","ContentEntity","urn:sobject.tooling.soap.sforce.com","ApexTrigger",0,1,true), com.sforce.soap.tooling.sobject.ApexTrigger.class));
      }
    }

    private void writeFieldContentEntity(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentEntity", "urn:sobject.tooling.soap.sforce.com","ContentEntity","urn:sobject.tooling.soap.sforce.com","ApexTrigger",0,1,true), ContentEntity, ContentEntity__is_set);
    }

    /**
     * element : ContentEntityId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ContentEntityId__is_set = false;

    private java.lang.String ContentEntityId;

    public java.lang.String getContentEntityId() {
      return ContentEntityId;
    }

    public void setContentEntityId(java.lang.String ContentEntityId) {
      this.ContentEntityId = ContentEntityId;
      ContentEntityId__is_set = true;
    }

    protected void setContentEntityId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentEntityId", "urn:sobject.tooling.soap.sforce.com","ContentEntityId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setContentEntityId(__typeMapper.readString(__in, _lookupTypeInfo("ContentEntityId", "urn:sobject.tooling.soap.sforce.com","ContentEntityId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContentEntityId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentEntityId", "urn:sobject.tooling.soap.sforce.com","ContentEntityId","urn:tooling.soap.sforce.com","ID",0,1,true), ContentEntityId, ContentEntityId__is_set);
    }

    /**
     * element : CreatedBy of type {urn:sobject.tooling.soap.sforce.com}User
     * java type: com.sforce.soap.tooling.sobject.User
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.tooling.sobject.User CreatedBy;

    public com.sforce.soap.tooling.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.tooling.sobject.User CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true))) {
        setCreatedBy((com.sforce.soap.tooling.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), com.sforce.soap.tooling.sobject.User.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), CreatedBy, CreatedBy__is_set);
    }

    /**
     * element : CreatedById of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    protected void setCreatedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setCreatedById(__typeMapper.readString(__in, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCreatedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true), CreatedById, CreatedById__is_set);
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    protected void setCreatedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCreatedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CreatedDate, CreatedDate__is_set);
    }

    /**
     * element : FullName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FullName__is_set = false;

    private java.lang.String FullName;

    public java.lang.String getFullName() {
      return FullName;
    }

    public void setFullName(java.lang.String FullName) {
      this.FullName = FullName;
      FullName__is_set = true;
    }

    protected void setFullName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFullName(__typeMapper.readString(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFullName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), FullName, FullName__is_set);
    }

    /**
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    protected void setIsDeleted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsDeleted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsDeleted, IsDeleted__is_set);
    }

    /**
     * element : LastModifiedBy of type {urn:sobject.tooling.soap.sforce.com}User
     * java type: com.sforce.soap.tooling.sobject.User
     */
    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.tooling.sobject.User LastModifiedBy;

    public com.sforce.soap.tooling.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.tooling.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    protected void setLastModifiedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true))) {
        setLastModifiedBy((com.sforce.soap.tooling.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), com.sforce.soap.tooling.sobject.User.class));
      }
    }

    private void writeFieldLastModifiedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), LastModifiedBy, LastModifiedBy__is_set);
    }

    /**
     * element : LastModifiedById of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    protected void setLastModifiedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setLastModifiedById(__typeMapper.readString(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastModifiedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true), LastModifiedById, LastModifiedById__is_set);
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    protected void setLastModifiedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastModifiedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastModifiedDate, LastModifiedDate__is_set);
    }

    /**
     * element : LastSyncDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastSyncDate__is_set = false;

    private java.util.Calendar LastSyncDate;

    public java.util.Calendar getLastSyncDate() {
      return LastSyncDate;
    }

    public void setLastSyncDate(java.util.Calendar LastSyncDate) {
      this.LastSyncDate = LastSyncDate;
      LastSyncDate__is_set = true;
    }

    protected void setLastSyncDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastSyncDate", "urn:sobject.tooling.soap.sforce.com","LastSyncDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastSyncDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastSyncDate", "urn:sobject.tooling.soap.sforce.com","LastSyncDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastSyncDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastSyncDate", "urn:sobject.tooling.soap.sforce.com","LastSyncDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastSyncDate, LastSyncDate__is_set);
    }

    /**
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}ApexTrigger
     * java type: com.sforce.soap.tooling.metadata.ApexTrigger
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.ApexTrigger Metadata;

    public com.sforce.soap.tooling.metadata.ApexTrigger getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.ApexTrigger Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexTrigger",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.ApexTrigger)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexTrigger",0,1,true), com.sforce.soap.tooling.metadata.ApexTrigger.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexTrigger",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : MetadataContainer of type {urn:sobject.tooling.soap.sforce.com}sObject
     * java type: com.sforce.soap.tooling.sobject.SObject
     */
    private boolean MetadataContainer__is_set = false;

    private com.sforce.soap.tooling.sobject.SObject MetadataContainer;

    public com.sforce.soap.tooling.sobject.SObject getMetadataContainer() {
      return MetadataContainer;
    }

    public void setMetadataContainer(com.sforce.soap.tooling.sobject.SObject MetadataContainer) {
      this.MetadataContainer = MetadataContainer;
      MetadataContainer__is_set = true;
    }

    protected void setMetadataContainer(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MetadataContainer", "urn:sobject.tooling.soap.sforce.com","MetadataContainer","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true))) {
        setMetadataContainer((com.sforce.soap.tooling.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("MetadataContainer", "urn:sobject.tooling.soap.sforce.com","MetadataContainer","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true), com.sforce.soap.tooling.sobject.SObject.class));
      }
    }

    private void writeFieldMetadataContainer(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MetadataContainer", "urn:sobject.tooling.soap.sforce.com","MetadataContainer","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true), MetadataContainer, MetadataContainer__is_set);
    }

    /**
     * element : MetadataContainerId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean MetadataContainerId__is_set = false;

    private java.lang.String MetadataContainerId;

    public java.lang.String getMetadataContainerId() {
      return MetadataContainerId;
    }

    public void setMetadataContainerId(java.lang.String MetadataContainerId) {
      this.MetadataContainerId = MetadataContainerId;
      MetadataContainerId__is_set = true;
    }

    protected void setMetadataContainerId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MetadataContainerId", "urn:sobject.tooling.soap.sforce.com","MetadataContainerId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setMetadataContainerId(__typeMapper.readString(__in, _lookupTypeInfo("MetadataContainerId", "urn:sobject.tooling.soap.sforce.com","MetadataContainerId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMetadataContainerId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MetadataContainerId", "urn:sobject.tooling.soap.sforce.com","MetadataContainerId","urn:tooling.soap.sforce.com","ID",0,1,true), MetadataContainerId, MetadataContainerId__is_set);
    }

    /**
     * element : SymbolTable of type {urn:tooling.soap.sforce.com}SymbolTable
     * java type: com.sforce.soap.tooling.SymbolTable
     */
    private boolean SymbolTable__is_set = false;

    private com.sforce.soap.tooling.SymbolTable SymbolTable;

    public com.sforce.soap.tooling.SymbolTable getSymbolTable() {
      return SymbolTable;
    }

    public void setSymbolTable(com.sforce.soap.tooling.SymbolTable SymbolTable) {
      this.SymbolTable = SymbolTable;
      SymbolTable__is_set = true;
    }

    protected void setSymbolTable(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SymbolTable", "urn:sobject.tooling.soap.sforce.com","SymbolTable","urn:tooling.soap.sforce.com","SymbolTable",0,1,true))) {
        setSymbolTable((com.sforce.soap.tooling.SymbolTable)__typeMapper.readObject(__in, _lookupTypeInfo("SymbolTable", "urn:sobject.tooling.soap.sforce.com","SymbolTable","urn:tooling.soap.sforce.com","SymbolTable",0,1,true), com.sforce.soap.tooling.SymbolTable.class));
      }
    }

    private void writeFieldSymbolTable(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SymbolTable", "urn:sobject.tooling.soap.sforce.com","SymbolTable","urn:tooling.soap.sforce.com","SymbolTable",0,1,true), SymbolTable, SymbolTable__is_set);
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    protected void setSystemModstamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldSystemModstamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), SystemModstamp, SystemModstamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "ApexTriggerMember");
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
      sb.append("[ApexTriggerMember ");
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
      writeFieldBody(__out, __typeMapper);
      writeFieldContent(__out, __typeMapper);
      writeFieldContentEntity(__out, __typeMapper);
      writeFieldContentEntityId(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldLastSyncDate(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldMetadataContainer(__out, __typeMapper);
      writeFieldMetadataContainerId(__out, __typeMapper);
      writeFieldSymbolTable(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setBody(__in, __typeMapper);
      setContent(__in, __typeMapper);
      setContentEntity(__in, __typeMapper);
      setContentEntityId(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setLastSyncDate(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setMetadataContainer(__in, __typeMapper);
      setMetadataContainerId(__in, __typeMapper);
      setSymbolTable(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Body", Body);
      toStringHelper(sb, "Content", Content);
      toStringHelper(sb, "ContentEntity", ContentEntity);
      toStringHelper(sb, "ContentEntityId", ContentEntityId);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "LastSyncDate", LastSyncDate);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "MetadataContainer", MetadataContainer);
      toStringHelper(sb, "MetadataContainerId", MetadataContainerId);
      toStringHelper(sb, "SymbolTable", SymbolTable);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
