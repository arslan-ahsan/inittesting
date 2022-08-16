package conversion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement(name = "model")
@XmlAccessorType(XmlAccessType.FIELD)
public class Model {
    private Context context;
    private long status;
    private String statusInfo;
    private Headers metadata;
    private Type mediaType;
    private Cookies cookies;
    private Object[] links;
    private StringHeaders stringHeaders;
    private Object[] allowedMethods;
    private long length;
    private Headers headers;

    @Override
    public String toString() {
        return "Model{" +
                "context=" + context +
                ", status=" + status +
                ", statusInfo='" + statusInfo + '\'' +
                ", metadata=" + metadata +
                ", mediaType=" + mediaType +
                ", cookies=" + cookies +
                ", links=" + Arrays.toString(links) +
                ", stringHeaders=" + stringHeaders +
                ", allowedMethods=" + Arrays.toString(allowedMethods) +
                ", length=" + length +
                ", headers=" + headers +
                '}';
    }

    public Context getContext() { return context; }
    public void setContext(Context value) { this.context = value; }

    public long getStatus() { return status; }
    public void setStatus(long value) { this.status = value; }

    public String getStatusInfo() { return statusInfo; }
    public void setStatusInfo(String value) { this.statusInfo = value; }

    public Headers getMetadata() { return metadata; }
    public void setMetadata(Headers value) { this.metadata = value; }

    public Type getMediaType() { return mediaType; }
    public void setMediaType(Type value) { this.mediaType = value; }

    public Cookies getCookies() { return cookies; }
    public void setCookies(Cookies value) { this.cookies = value; }

    public Object[] getLinks() { return links; }
    public void setLinks(Object[] value) { this.links = value; }

    public StringHeaders getStringHeaders() { return stringHeaders; }
    public void setStringHeaders(StringHeaders value) { this.stringHeaders = value; }

    public Object[] getAllowedMethods() { return allowedMethods; }
    public void setAllowedMethods(Object[] value) { this.allowedMethods = value; }

    public long getLength() { return length; }
    public void setLength(long value) { this.length = value; }

    public Headers getHeaders() { return headers; }
    public void setHeaders(Headers value) { this.headers = value; }
}

// Context.java
@XmlAccessorType(XmlAccessType.FIELD)
class Context {
    private Headers headers;
    private Object[] entityAnnotations;
    private EntityStream entityStream;
    private boolean committed;
    private Type mediaType;
    private Object[] links;
    private Cookies responseCookies;
    private String[] acceptableLanguages;
    private Cookies requestCookies;
    private Type[] acceptableMediaTypes;
    private StringHeaders stringHeaders;
    private Object[] allowedMethods;
    private long length;

    @Override
    public String toString() {
        return "Context{" +
                "headers=" + headers +
                ", entityAnnotations=" + Arrays.toString(entityAnnotations) +
                ", entityStream=" + entityStream +
                ", committed=" + committed +
                ", mediaType=" + mediaType +
                ", links=" + Arrays.toString(links) +
                ", responseCookies=" + responseCookies +
                ", acceptableLanguages=" + Arrays.toString(acceptableLanguages) +
                ", requestCookies=" + requestCookies +
                ", acceptableMediaTypes=" + Arrays.toString(acceptableMediaTypes) +
                ", stringHeaders=" + stringHeaders +
                ", allowedMethods=" + Arrays.toString(allowedMethods) +
                ", length=" + length +
                '}';
    }

    public Headers getHeaders() { return headers; }
    public void setHeaders(Headers value) { this.headers = value; }

    public Object[] getEntityAnnotations() { return entityAnnotations; }
    public void setEntityAnnotations(Object[] value) { this.entityAnnotations = value; }

    public EntityStream getEntityStream() { return entityStream; }
    public void setEntityStream(EntityStream value) { this.entityStream = value; }

    public boolean getCommitted() { return committed; }
    public void setCommitted(boolean value) { this.committed = value; }

    public Type getMediaType() { return mediaType; }
    public void setMediaType(Type value) { this.mediaType = value; }

    public Object[] getLinks() { return links; }
    public void setLinks(Object[] value) { this.links = value; }

    public Cookies getResponseCookies() { return responseCookies; }
    public void setResponseCookies(Cookies value) { this.responseCookies = value; }

    public String[] getAcceptableLanguages() { return acceptableLanguages; }
    public void setAcceptableLanguages(String[] value) { this.acceptableLanguages = value; }

    public Cookies getRequestCookies() { return requestCookies; }
    public void setRequestCookies(Cookies value) { this.requestCookies = value; }

    public Type[] getAcceptableMediaTypes() { return acceptableMediaTypes; }
    public void setAcceptableMediaTypes(Type[] value) { this.acceptableMediaTypes = value; }

    public StringHeaders getStringHeaders() { return stringHeaders; }
    public void setStringHeaders(StringHeaders value) { this.stringHeaders = value; }

    public Object[] getAllowedMethods() { return allowedMethods; }
    public void setAllowedMethods(Object[] value) { this.allowedMethods = value; }

    public long getLength() { return length; }
    public void setLength(long value) { this.length = value; }
}

// Type.java

@XmlAccessorType(XmlAccessType.FIELD)
class Type {
    private String type;
    private String subtype;
    private Cookies parameters;
    private Long quality;
    private boolean wildcardType;
    private boolean wildcardSubtype;

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", parameters=" + parameters +
                ", quality=" + quality +
                ", wildcardType=" + wildcardType +
                ", wildcardSubtype=" + wildcardSubtype +
                '}';
    }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getSubtype() { return subtype; }
    public void setSubtype(String value) { this.subtype = value; }

    public Cookies getParameters() { return parameters; }
    public void setParameters(Cookies value) { this.parameters = value; }

    public Long getQuality() { return quality; }
    public void setQuality(Long value) { this.quality = value; }

    public boolean getWildcardType() { return wildcardType; }
    public void setWildcardType(boolean value) { this.wildcardType = value; }

    public boolean getWildcardSubtype() { return wildcardSubtype; }
    public void setWildcardSubtype(boolean value) { this.wildcardSubtype = value; }
}

// Cookies.java

@XmlAccessorType(XmlAccessType.FIELD)
class Cookies {

}

// EntityStream.java

@XmlAccessorType(XmlAccessType.FIELD)
class EntityStream {
    private boolean committed;
    private boolean closed;

    @Override
    public String toString() {
        return "EntityStream{" +
                "committed=" + committed +
                ", closed=" + closed +
                '}';
    }

    public boolean getCommitted() { return committed; }
    public void setCommitted(boolean value) { this.committed = value; }

    public boolean getClosed() { return closed; }
    public void setClosed(boolean value) { this.closed = value; }
}

// Headers.java

@XmlAccessorType(XmlAccessType.FIELD)
class Headers {
    private Type[] contentType;

    @Override
    public String toString() {
        return "Headers{" +
                "contentType=" + Arrays.toString(contentType) +
                '}';
    }

    public Type[] getContentType() { return contentType; }
    public void setContentType(Type[] value) { this.contentType = value; }
}

// StringHeaders.java

@XmlAccessorType(XmlAccessType.FIELD)
 class StringHeaders {
    private String[] contentType;

    public String[] getContentType() { return contentType; }
    public void setContentType(String[] value) { this.contentType = value;
    }

     @Override
     public String toString() {
         return "StringHeaders{" +
                 "contentType=" + Arrays.toString(contentType) +
                 '}';
     }
 }
