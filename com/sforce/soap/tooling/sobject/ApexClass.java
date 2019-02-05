package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexClass extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public ApexClass() {}

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
     * element : ApiVersion of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ApiVersion__is_set = false;

    private java.lang.Double ApiVersion;

    public java.lang.Double getApiVersion() {
      return ApiVersion;
    }

    public void setApiVersion(java.lang.Double ApiVersion) {
      this.ApiVersion = ApiVersion;
      ApiVersion__is_set = true;
    }

    protected void setApiVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApiVersion", "urn:sobject.tooling.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setApiVersion((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ApiVersion", "urn:sobject.tooling.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldApiVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApiVersion", "urn:sobject.tooling.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), ApiVersion, ApiVersion__is_set);
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
     * element : BodyCrc of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean BodyCrc__is_set = false;

    private java.lang.Double BodyCrc;

    public java.lang.Double getBodyCrc() {
      return BodyCrc;
    }

    public void setBodyCrc(java.lang.Double BodyCrc) {
      this.BodyCrc = BodyCrc;
      BodyCrc__is_set = true;
    }

    protected void setBodyCrc(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("BodyCrc", "urn:sobject.tooling.soap.sforce.com","BodyCrc","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setBodyCrc((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("BodyCrc", "urn:sobject.tooling.soap.sforce.com","BodyCrc","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldBodyCrc(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("BodyCrc", "urn:sobject.tooling.soap.sforce.com","BodyCrc","http://www.w3.org/2001/XMLSchema","double",0,1,true), BodyCrc, BodyCrc__is_set);
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
     * element : IsValid of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsValid__is_set = false;

    private java.lang.Boolean IsValid;

    public java.lang.Boolean getIsValid() {
      return IsValid;
    }

    public void setIsValid(java.lang.Boolean IsValid) {
      this.IsValid = IsValid;
      IsValid__is_set = true;
    }

    protected void setIsValid(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsValid", "urn:sobject.tooling.soap.sforce.com","IsValid","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsValid((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsValid", "urn:sobject.tooling.soap.sforce.com","IsValid","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsValid(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsValid", "urn:sobject.tooling.soap.sforce.com","IsValid","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsValid, IsValid__is_set);
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
     * element : LengthWithoutComments of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean LengthWithoutComments__is_set = false;

    private java.lang.Integer LengthWithoutComments;

    public java.lang.Integer getLengthWithoutComments() {
      return LengthWithoutComments;
    }

    public void setLengthWithoutComments(java.lang.Integer LengthWithoutComments) {
      this.LengthWithoutComments = LengthWithoutComments;
      LengthWithoutComments__is_set = true;
    }

    protected void setLengthWithoutComments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LengthWithoutComments", "urn:sobject.tooling.soap.sforce.com","LengthWithoutComments","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setLengthWithoutComments((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("LengthWithoutComments", "urn:sobject.tooling.soap.sforce.com","LengthWithoutComments","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldLengthWithoutComments(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LengthWithoutComments", "urn:sobject.tooling.soap.sforce.com","LengthWithoutComments","http://www.w3.org/2001/XMLSchema","int",0,1,true), LengthWithoutComments, LengthWithoutComments__is_set);
    }

    /**
     * element : ManageableState of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ManageableState__is_set = false;

    private java.lang.String ManageableState;

    public java.lang.String getManageableState() {
      return ManageableState;
    }

    public void setManageableState(java.lang.String ManageableState) {
      this.ManageableState = ManageableState;
      ManageableState__is_set = true;
    }

    protected void setManageableState(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ManageableState", "urn:sobject.tooling.soap.sforce.com","ManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setManageableState(__typeMapper.readString(__in, _lookupTypeInfo("ManageableState", "urn:sobject.tooling.soap.sforce.com","ManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldManageableState(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ManageableState", "urn:sobject.tooling.soap.sforce.com","ManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true), ManageableState, ManageableState__is_set);
    }

    /**
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}ApexClass
     * java type: com.sforce.soap.tooling.metadata.ApexClass
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.ApexClass Metadata;

    public com.sforce.soap.tooling.metadata.ApexClass getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.ApexClass Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexClass",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.ApexClass)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexClass",0,1,true), com.sforce.soap.tooling.metadata.ApexClass.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","ApexClass",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : Name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Name__is_set = false;

    private java.lang.String Name;

    public java.lang.String getName() {
      return Name;
    }

    public void setName(java.lang.String Name) {
      this.Name = Name;
      Name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), Name, Name__is_set);
    }

    /**
     * element : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean NamespacePrefix__is_set = false;

    private java.lang.String NamespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return NamespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String NamespacePrefix) {
      this.NamespacePrefix = NamespacePrefix;
      NamespacePrefix__is_set = true;
    }

    protected void setNamespacePrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setNamespacePrefix(__typeMapper.readString(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNamespacePrefix(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), NamespacePrefix, NamespacePrefix__is_set);
    }

    /**
     * element : Status of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Status__is_set = false;

    private java.lang.String Status;

    public java.lang.String getStatus() {
      return Status;
    }

    public void setStatus(java.lang.String Status) {
      this.Status = Status;
      Status__is_set = true;
    }

    protected void setStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Status", "urn:sobject.tooling.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStatus(__typeMapper.readString(__in, _lookupTypeInfo("Status", "urn:sobject.tooling.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Status", "urn:sobject.tooling.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), Status, Status__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "ApexClass");
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
      sb.append("[ApexClass ");
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
      writeFieldApiVersion(__out, __typeMapper);
      writeFieldBody(__out, __typeMapper);
      writeFieldBodyCrc(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldIsValid(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldLengthWithoutComments(__out, __typeMapper);
      writeFieldManageableState(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldNamespacePrefix(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldSymbolTable(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApiVersion(__in, __typeMapper);
      setBody(__in, __typeMapper);
      setBodyCrc(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setIsValid(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setLengthWithoutComments(__in, __typeMapper);
      setManageableState(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setName(__in, __typeMapper);
      setNamespacePrefix(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setSymbolTable(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ApiVersion", ApiVersion);
      toStringHelper(sb, "Body", Body);
      toStringHelper(sb, "BodyCrc", BodyCrc);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "IsValid", IsValid);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "LengthWithoutComments", LengthWithoutComments);
      toStringHelper(sb, "ManageableState", ManageableState);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "NamespacePrefix", NamespacePrefix);
      toStringHelper(sb, "Status", Status);
      toStringHelper(sb, "SymbolTable", SymbolTable);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
