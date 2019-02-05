package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class PermissionSet extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public PermissionSet() {}

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
     * element : applicationVisibilities of type {urn:metadata.tooling.soap.sforce.com}PermissionSetApplicationVisibility
     * java type: com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[]
     */
    private boolean applicationVisibilities__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[] applicationVisibilities = new com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[0];

    public com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[] getApplicationVisibilities() {
      return applicationVisibilities;
    }

    public void setApplicationVisibilities(com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[] applicationVisibilities) {
      this.applicationVisibilities = applicationVisibilities;
      applicationVisibilities__is_set = true;
    }

    protected void setApplicationVisibilities(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("applicationVisibilities", "urn:metadata.tooling.soap.sforce.com","applicationVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetApplicationVisibility",0,-1,true))) {
        setApplicationVisibilities((com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[])__typeMapper.readObject(__in, _lookupTypeInfo("applicationVisibilities", "urn:metadata.tooling.soap.sforce.com","applicationVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetApplicationVisibility",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetApplicationVisibility[].class));
      }
    }

    private void writeFieldApplicationVisibilities(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("applicationVisibilities", "urn:metadata.tooling.soap.sforce.com","applicationVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetApplicationVisibility",0,-1,true), applicationVisibilities, applicationVisibilities__is_set);
    }

    /**
     * element : classAccesses of type {urn:metadata.tooling.soap.sforce.com}PermissionSetApexClassAccess
     * java type: com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[]
     */
    private boolean classAccesses__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[] classAccesses = new com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[0];

    public com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[] getClassAccesses() {
      return classAccesses;
    }

    public void setClassAccesses(com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[] classAccesses) {
      this.classAccesses = classAccesses;
      classAccesses__is_set = true;
    }

    protected void setClassAccesses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("classAccesses", "urn:metadata.tooling.soap.sforce.com","classAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexClassAccess",0,-1,true))) {
        setClassAccesses((com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[])__typeMapper.readObject(__in, _lookupTypeInfo("classAccesses", "urn:metadata.tooling.soap.sforce.com","classAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexClassAccess",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetApexClassAccess[].class));
      }
    }

    private void writeFieldClassAccesses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("classAccesses", "urn:metadata.tooling.soap.sforce.com","classAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexClassAccess",0,-1,true), classAccesses, classAccesses__is_set);
    }

    /**
     * element : customPermissions of type {urn:metadata.tooling.soap.sforce.com}PermissionSetCustomPermissions
     * java type: com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[]
     */
    private boolean customPermissions__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[] customPermissions = new com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[0];

    public com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[] getCustomPermissions() {
      return customPermissions;
    }

    public void setCustomPermissions(com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[] customPermissions) {
      this.customPermissions = customPermissions;
      customPermissions__is_set = true;
    }

    protected void setCustomPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("customPermissions", "urn:metadata.tooling.soap.sforce.com","customPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetCustomPermissions",0,-1,true))) {
        setCustomPermissions((com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[])__typeMapper.readObject(__in, _lookupTypeInfo("customPermissions", "urn:metadata.tooling.soap.sforce.com","customPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetCustomPermissions",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetCustomPermissions[].class));
      }
    }

    private void writeFieldCustomPermissions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("customPermissions", "urn:metadata.tooling.soap.sforce.com","customPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetCustomPermissions",0,-1,true), customPermissions, customPermissions__is_set);
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDescription(__typeMapper.readString(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), description, description__is_set);
    }

    /**
     * element : externalDataSourceAccesses of type {urn:metadata.tooling.soap.sforce.com}PermissionSetExternalDataSourceAccess
     * java type: com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[]
     */
    private boolean externalDataSourceAccesses__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses = new com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[0];

    public com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[] getExternalDataSourceAccesses() {
      return externalDataSourceAccesses;
    }

    public void setExternalDataSourceAccesses(com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[] externalDataSourceAccesses) {
      this.externalDataSourceAccesses = externalDataSourceAccesses;
      externalDataSourceAccesses__is_set = true;
    }

    protected void setExternalDataSourceAccesses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("externalDataSourceAccesses", "urn:metadata.tooling.soap.sforce.com","externalDataSourceAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetExternalDataSourceAccess",0,-1,true))) {
        setExternalDataSourceAccesses((com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[])__typeMapper.readObject(__in, _lookupTypeInfo("externalDataSourceAccesses", "urn:metadata.tooling.soap.sforce.com","externalDataSourceAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetExternalDataSourceAccess",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetExternalDataSourceAccess[].class));
      }
    }

    private void writeFieldExternalDataSourceAccesses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("externalDataSourceAccesses", "urn:metadata.tooling.soap.sforce.com","externalDataSourceAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetExternalDataSourceAccess",0,-1,true), externalDataSourceAccesses, externalDataSourceAccesses__is_set);
    }

    /**
     * element : fieldPermissions of type {urn:metadata.tooling.soap.sforce.com}PermissionSetFieldPermissions
     * java type: com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[]
     */
    private boolean fieldPermissions__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[] fieldPermissions = new com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[0];

    public com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[] getFieldPermissions() {
      return fieldPermissions;
    }

    public void setFieldPermissions(com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[] fieldPermissions) {
      this.fieldPermissions = fieldPermissions;
      fieldPermissions__is_set = true;
    }

    protected void setFieldPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldPermissions", "urn:metadata.tooling.soap.sforce.com","fieldPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetFieldPermissions",0,-1,true))) {
        setFieldPermissions((com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[])__typeMapper.readObject(__in, _lookupTypeInfo("fieldPermissions", "urn:metadata.tooling.soap.sforce.com","fieldPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetFieldPermissions",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetFieldPermissions[].class));
      }
    }

    private void writeFieldFieldPermissions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldPermissions", "urn:metadata.tooling.soap.sforce.com","fieldPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetFieldPermissions",0,-1,true), fieldPermissions, fieldPermissions__is_set);
    }

    /**
     * element : hasActivationRequired of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean hasActivationRequired__is_set = false;

    private boolean hasActivationRequired;

    public boolean getHasActivationRequired() {
      return hasActivationRequired;
    }

    public boolean isHasActivationRequired() {
      return hasActivationRequired;
    }

    public void setHasActivationRequired(boolean hasActivationRequired) {
      this.hasActivationRequired = hasActivationRequired;
      hasActivationRequired__is_set = true;
    }

    protected void setHasActivationRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("hasActivationRequired", "urn:metadata.tooling.soap.sforce.com","hasActivationRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setHasActivationRequired(__typeMapper.readBoolean(__in, _lookupTypeInfo("hasActivationRequired", "urn:metadata.tooling.soap.sforce.com","hasActivationRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldHasActivationRequired(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("hasActivationRequired", "urn:metadata.tooling.soap.sforce.com","hasActivationRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), hasActivationRequired, hasActivationRequired__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : license of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean license__is_set = false;

    private java.lang.String license;

    public java.lang.String getLicense() {
      return license;
    }

    public void setLicense(java.lang.String license) {
      this.license = license;
      license__is_set = true;
    }

    protected void setLicense(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("license", "urn:metadata.tooling.soap.sforce.com","license","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLicense(__typeMapper.readString(__in, _lookupTypeInfo("license", "urn:metadata.tooling.soap.sforce.com","license","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLicense(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("license", "urn:metadata.tooling.soap.sforce.com","license","http://www.w3.org/2001/XMLSchema","string",0,1,true), license, license__is_set);
    }

    /**
     * element : objectPermissions of type {urn:metadata.tooling.soap.sforce.com}PermissionSetObjectPermissions
     * java type: com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[]
     */
    private boolean objectPermissions__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[] objectPermissions = new com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[0];

    public com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[] getObjectPermissions() {
      return objectPermissions;
    }

    public void setObjectPermissions(com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[] objectPermissions) {
      this.objectPermissions = objectPermissions;
      objectPermissions__is_set = true;
    }

    protected void setObjectPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("objectPermissions", "urn:metadata.tooling.soap.sforce.com","objectPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetObjectPermissions",0,-1,true))) {
        setObjectPermissions((com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[])__typeMapper.readObject(__in, _lookupTypeInfo("objectPermissions", "urn:metadata.tooling.soap.sforce.com","objectPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetObjectPermissions",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetObjectPermissions[].class));
      }
    }

    private void writeFieldObjectPermissions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("objectPermissions", "urn:metadata.tooling.soap.sforce.com","objectPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetObjectPermissions",0,-1,true), objectPermissions, objectPermissions__is_set);
    }

    /**
     * element : pageAccesses of type {urn:metadata.tooling.soap.sforce.com}PermissionSetApexPageAccess
     * java type: com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[]
     */
    private boolean pageAccesses__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[] pageAccesses = new com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[0];

    public com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[] getPageAccesses() {
      return pageAccesses;
    }

    public void setPageAccesses(com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[] pageAccesses) {
      this.pageAccesses = pageAccesses;
      pageAccesses__is_set = true;
    }

    protected void setPageAccesses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("pageAccesses", "urn:metadata.tooling.soap.sforce.com","pageAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexPageAccess",0,-1,true))) {
        setPageAccesses((com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[])__typeMapper.readObject(__in, _lookupTypeInfo("pageAccesses", "urn:metadata.tooling.soap.sforce.com","pageAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexPageAccess",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetApexPageAccess[].class));
      }
    }

    private void writeFieldPageAccesses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("pageAccesses", "urn:metadata.tooling.soap.sforce.com","pageAccesses","urn:metadata.tooling.soap.sforce.com","PermissionSetApexPageAccess",0,-1,true), pageAccesses, pageAccesses__is_set);
    }

    /**
     * element : recordTypeVisibilities of type {urn:metadata.tooling.soap.sforce.com}PermissionSetRecordTypeVisibility
     * java type: com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[]
     */
    private boolean recordTypeVisibilities__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[] recordTypeVisibilities = new com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[0];

    public com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[] getRecordTypeVisibilities() {
      return recordTypeVisibilities;
    }

    public void setRecordTypeVisibilities(com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[] recordTypeVisibilities) {
      this.recordTypeVisibilities = recordTypeVisibilities;
      recordTypeVisibilities__is_set = true;
    }

    protected void setRecordTypeVisibilities(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("recordTypeVisibilities", "urn:metadata.tooling.soap.sforce.com","recordTypeVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetRecordTypeVisibility",0,-1,true))) {
        setRecordTypeVisibilities((com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[])__typeMapper.readObject(__in, _lookupTypeInfo("recordTypeVisibilities", "urn:metadata.tooling.soap.sforce.com","recordTypeVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetRecordTypeVisibility",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetRecordTypeVisibility[].class));
      }
    }

    private void writeFieldRecordTypeVisibilities(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("recordTypeVisibilities", "urn:metadata.tooling.soap.sforce.com","recordTypeVisibilities","urn:metadata.tooling.soap.sforce.com","PermissionSetRecordTypeVisibility",0,-1,true), recordTypeVisibilities, recordTypeVisibilities__is_set);
    }

    /**
     * element : tabSettings of type {urn:metadata.tooling.soap.sforce.com}PermissionSetTabSetting
     * java type: com.sforce.soap.tooling.metadata.PermissionSetTabSetting[]
     */
    private boolean tabSettings__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetTabSetting[] tabSettings = new com.sforce.soap.tooling.metadata.PermissionSetTabSetting[0];

    public com.sforce.soap.tooling.metadata.PermissionSetTabSetting[] getTabSettings() {
      return tabSettings;
    }

    public void setTabSettings(com.sforce.soap.tooling.metadata.PermissionSetTabSetting[] tabSettings) {
      this.tabSettings = tabSettings;
      tabSettings__is_set = true;
    }

    protected void setTabSettings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("tabSettings", "urn:metadata.tooling.soap.sforce.com","tabSettings","urn:metadata.tooling.soap.sforce.com","PermissionSetTabSetting",0,-1,true))) {
        setTabSettings((com.sforce.soap.tooling.metadata.PermissionSetTabSetting[])__typeMapper.readObject(__in, _lookupTypeInfo("tabSettings", "urn:metadata.tooling.soap.sforce.com","tabSettings","urn:metadata.tooling.soap.sforce.com","PermissionSetTabSetting",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetTabSetting[].class));
      }
    }

    private void writeFieldTabSettings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("tabSettings", "urn:metadata.tooling.soap.sforce.com","tabSettings","urn:metadata.tooling.soap.sforce.com","PermissionSetTabSetting",0,-1,true), tabSettings, tabSettings__is_set);
    }

    /**
     * element : userPermissions of type {urn:metadata.tooling.soap.sforce.com}PermissionSetUserPermission
     * java type: com.sforce.soap.tooling.metadata.PermissionSetUserPermission[]
     */
    private boolean userPermissions__is_set = false;

    private com.sforce.soap.tooling.metadata.PermissionSetUserPermission[] userPermissions = new com.sforce.soap.tooling.metadata.PermissionSetUserPermission[0];

    public com.sforce.soap.tooling.metadata.PermissionSetUserPermission[] getUserPermissions() {
      return userPermissions;
    }

    public void setUserPermissions(com.sforce.soap.tooling.metadata.PermissionSetUserPermission[] userPermissions) {
      this.userPermissions = userPermissions;
      userPermissions__is_set = true;
    }

    protected void setUserPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("userPermissions", "urn:metadata.tooling.soap.sforce.com","userPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetUserPermission",0,-1,true))) {
        setUserPermissions((com.sforce.soap.tooling.metadata.PermissionSetUserPermission[])__typeMapper.readObject(__in, _lookupTypeInfo("userPermissions", "urn:metadata.tooling.soap.sforce.com","userPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetUserPermission",0,-1,true), com.sforce.soap.tooling.metadata.PermissionSetUserPermission[].class));
      }
    }

    private void writeFieldUserPermissions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("userPermissions", "urn:metadata.tooling.soap.sforce.com","userPermissions","urn:metadata.tooling.soap.sforce.com","PermissionSetUserPermission",0,-1,true), userPermissions, userPermissions__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "PermissionSet");
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
      sb.append("[PermissionSet ");
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
      writeFieldApplicationVisibilities(__out, __typeMapper);
      writeFieldClassAccesses(__out, __typeMapper);
      writeFieldCustomPermissions(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldExternalDataSourceAccesses(__out, __typeMapper);
      writeFieldFieldPermissions(__out, __typeMapper);
      writeFieldHasActivationRequired(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLicense(__out, __typeMapper);
      writeFieldObjectPermissions(__out, __typeMapper);
      writeFieldPageAccesses(__out, __typeMapper);
      writeFieldRecordTypeVisibilities(__out, __typeMapper);
      writeFieldTabSettings(__out, __typeMapper);
      writeFieldUserPermissions(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApplicationVisibilities(__in, __typeMapper);
      setClassAccesses(__in, __typeMapper);
      setCustomPermissions(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setExternalDataSourceAccesses(__in, __typeMapper);
      setFieldPermissions(__in, __typeMapper);
      setHasActivationRequired(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLicense(__in, __typeMapper);
      setObjectPermissions(__in, __typeMapper);
      setPageAccesses(__in, __typeMapper);
      setRecordTypeVisibilities(__in, __typeMapper);
      setTabSettings(__in, __typeMapper);
      setUserPermissions(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "applicationVisibilities", applicationVisibilities);
      toStringHelper(sb, "classAccesses", classAccesses);
      toStringHelper(sb, "customPermissions", customPermissions);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "externalDataSourceAccesses", externalDataSourceAccesses);
      toStringHelper(sb, "fieldPermissions", fieldPermissions);
      toStringHelper(sb, "hasActivationRequired", hasActivationRequired);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "license", license);
      toStringHelper(sb, "objectPermissions", objectPermissions);
      toStringHelper(sb, "pageAccesses", pageAccesses);
      toStringHelper(sb, "recordTypeVisibilities", recordTypeVisibilities);
      toStringHelper(sb, "tabSettings", tabSettings);
      toStringHelper(sb, "userPermissions", userPermissions);
    }


}
