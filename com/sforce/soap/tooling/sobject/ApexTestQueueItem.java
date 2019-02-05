package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexTestQueueItem extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public ApexTestQueueItem() {}

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
     * element : ApexClass of type {urn:sobject.tooling.soap.sforce.com}ApexClass
     * java type: com.sforce.soap.tooling.sobject.ApexClass
     */
    private boolean ApexClass__is_set = false;

    private com.sforce.soap.tooling.sobject.ApexClass ApexClass;

    public com.sforce.soap.tooling.sobject.ApexClass getApexClass() {
      return ApexClass;
    }

    public void setApexClass(com.sforce.soap.tooling.sobject.ApexClass ApexClass) {
      this.ApexClass = ApexClass;
      ApexClass__is_set = true;
    }

    protected void setApexClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexClass", "urn:sobject.tooling.soap.sforce.com","ApexClass","urn:sobject.tooling.soap.sforce.com","ApexClass",0,1,true))) {
        setApexClass((com.sforce.soap.tooling.sobject.ApexClass)__typeMapper.readObject(__in, _lookupTypeInfo("ApexClass", "urn:sobject.tooling.soap.sforce.com","ApexClass","urn:sobject.tooling.soap.sforce.com","ApexClass",0,1,true), com.sforce.soap.tooling.sobject.ApexClass.class));
      }
    }

    private void writeFieldApexClass(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexClass", "urn:sobject.tooling.soap.sforce.com","ApexClass","urn:sobject.tooling.soap.sforce.com","ApexClass",0,1,true), ApexClass, ApexClass__is_set);
    }

    /**
     * element : ApexClassId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ApexClassId__is_set = false;

    private java.lang.String ApexClassId;

    public java.lang.String getApexClassId() {
      return ApexClassId;
    }

    public void setApexClassId(java.lang.String ApexClassId) {
      this.ApexClassId = ApexClassId;
      ApexClassId__is_set = true;
    }

    protected void setApexClassId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexClassId", "urn:sobject.tooling.soap.sforce.com","ApexClassId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setApexClassId(__typeMapper.readString(__in, _lookupTypeInfo("ApexClassId", "urn:sobject.tooling.soap.sforce.com","ApexClassId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexClassId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexClassId", "urn:sobject.tooling.soap.sforce.com","ApexClassId","urn:tooling.soap.sforce.com","ID",0,1,true), ApexClassId, ApexClassId__is_set);
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
     * element : ExtendedStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ExtendedStatus__is_set = false;

    private java.lang.String ExtendedStatus;

    public java.lang.String getExtendedStatus() {
      return ExtendedStatus;
    }

    public void setExtendedStatus(java.lang.String ExtendedStatus) {
      this.ExtendedStatus = ExtendedStatus;
      ExtendedStatus__is_set = true;
    }

    protected void setExtendedStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ExtendedStatus", "urn:sobject.tooling.soap.sforce.com","ExtendedStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExtendedStatus(__typeMapper.readString(__in, _lookupTypeInfo("ExtendedStatus", "urn:sobject.tooling.soap.sforce.com","ExtendedStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExtendedStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ExtendedStatus", "urn:sobject.tooling.soap.sforce.com","ExtendedStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), ExtendedStatus, ExtendedStatus__is_set);
    }

    /**
     * element : ParentJobId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ParentJobId__is_set = false;

    private java.lang.String ParentJobId;

    public java.lang.String getParentJobId() {
      return ParentJobId;
    }

    public void setParentJobId(java.lang.String ParentJobId) {
      this.ParentJobId = ParentJobId;
      ParentJobId__is_set = true;
    }

    protected void setParentJobId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ParentJobId", "urn:sobject.tooling.soap.sforce.com","ParentJobId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setParentJobId(__typeMapper.readString(__in, _lookupTypeInfo("ParentJobId", "urn:sobject.tooling.soap.sforce.com","ParentJobId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentJobId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ParentJobId", "urn:sobject.tooling.soap.sforce.com","ParentJobId","urn:tooling.soap.sforce.com","ID",0,1,true), ParentJobId, ParentJobId__is_set);
    }

    /**
     * element : ShouldSkipCodeCoverage of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean ShouldSkipCodeCoverage__is_set = false;

    private java.lang.Boolean ShouldSkipCodeCoverage;

    public java.lang.Boolean getShouldSkipCodeCoverage() {
      return ShouldSkipCodeCoverage;
    }

    public void setShouldSkipCodeCoverage(java.lang.Boolean ShouldSkipCodeCoverage) {
      this.ShouldSkipCodeCoverage = ShouldSkipCodeCoverage;
      ShouldSkipCodeCoverage__is_set = true;
    }

    protected void setShouldSkipCodeCoverage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ShouldSkipCodeCoverage", "urn:sobject.tooling.soap.sforce.com","ShouldSkipCodeCoverage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShouldSkipCodeCoverage((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("ShouldSkipCodeCoverage", "urn:sobject.tooling.soap.sforce.com","ShouldSkipCodeCoverage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldShouldSkipCodeCoverage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ShouldSkipCodeCoverage", "urn:sobject.tooling.soap.sforce.com","ShouldSkipCodeCoverage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), ShouldSkipCodeCoverage, ShouldSkipCodeCoverage__is_set);
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
     * element : TestRunResultId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean TestRunResultId__is_set = false;

    private java.lang.String TestRunResultId;

    public java.lang.String getTestRunResultId() {
      return TestRunResultId;
    }

    public void setTestRunResultId(java.lang.String TestRunResultId) {
      this.TestRunResultId = TestRunResultId;
      TestRunResultId__is_set = true;
    }

    protected void setTestRunResultId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("TestRunResultId", "urn:sobject.tooling.soap.sforce.com","TestRunResultId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setTestRunResultId(__typeMapper.readString(__in, _lookupTypeInfo("TestRunResultId", "urn:sobject.tooling.soap.sforce.com","TestRunResultId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTestRunResultId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("TestRunResultId", "urn:sobject.tooling.soap.sforce.com","TestRunResultId","urn:tooling.soap.sforce.com","ID",0,1,true), TestRunResultId, TestRunResultId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "ApexTestQueueItem");
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
      sb.append("[ApexTestQueueItem ");
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
      writeFieldApexClass(__out, __typeMapper);
      writeFieldApexClassId(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldExtendedStatus(__out, __typeMapper);
      writeFieldParentJobId(__out, __typeMapper);
      writeFieldShouldSkipCodeCoverage(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldTestRunResultId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApexClass(__in, __typeMapper);
      setApexClassId(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setExtendedStatus(__in, __typeMapper);
      setParentJobId(__in, __typeMapper);
      setShouldSkipCodeCoverage(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setTestRunResultId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ApexClass", ApexClass);
      toStringHelper(sb, "ApexClassId", ApexClassId);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "ExtendedStatus", ExtendedStatus);
      toStringHelper(sb, "ParentJobId", ParentJobId);
      toStringHelper(sb, "ShouldSkipCodeCoverage", ShouldSkipCodeCoverage);
      toStringHelper(sb, "Status", Status);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "TestRunResultId", TestRunResultId);
    }


}
