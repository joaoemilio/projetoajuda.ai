/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2019-10-02 06:17:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.llom.util.AXIOMUtil;
import org.apache.axiom.om.util.Base64;
import org.apache.axiom.soap.SOAP11Constants;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.OperationContext;
import org.apache.axis2.description.WSDL2Constants;
import org.apache.axis2.util.JavaUtils;
import org.apache.axis2.util.XMLUtils;
import org.apache.neethi.PolicyEngine;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.utils.ServerConstants;
import org.apache.axis2.transport.http.HTTPConstants;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.httpclient.Header;
import org.wso2.carbon.ui.util.CharacterEncoder;
import org.apache.xerces.util.SecurityManager;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class WSRequestXSSproxy_005fajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



    public static String decode(String s) throws Exception {
        if ("~".equals(s)) return null;
        return new String(Base64.decode(s), "UTF-8");
    }
    /**
     * This method provides a secured document builder which will secure XXE attacks.
     *
     * @param setIgnoreComments whether to set setIgnoringComments in DocumentBuilderFactory.
     * @return DocumentBuilder
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static DocumentBuilder getSecuredDocumentBuilder(boolean setIgnoreComments) throws
            ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setIgnoringComments(setIgnoreComments);
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setExpandEntityReferences(false);
        documentBuilderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        documentBuilderFactory.setXIncludeAware(false);
        SecurityManager securityManager = new SecurityManager();
        securityManager.setEntityExpansionLimit(0);
        documentBuilderFactory.setAttribute(org.apache.xerces.impl.Constants.XERCES_PROPERTY_PREFIX +
                org.apache.xerces.impl.Constants.SECURITY_MANAGER_PROPERTY, securityManager);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        documentBuilder.setEntityResolver(new EntityResolver() {
            @Override
            public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
                throw new SAXException("Possible XML External Entity (XXE) attack. Skipping entity resolving");
            }
        });
        return documentBuilder;
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    boolean useWSS = false;
    String policy = "<wsp:Policy wsu:Id=\"UTOverTransport\"\n" +
"            xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"\n" +
"            xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\">\n" +
"    <wsp:ExactlyOne>\n" +
"        <wsp:All>\n" +
"            <sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\">\n" +
"                <wsp:Policy>\n" +
"                    <sp:TransportToken>\n" +
"                        <wsp:Policy>\n" +
"                            <sp:HttpsToken RequireClientCertificate=\"false\"/>\n" +
"                        </wsp:Policy>\n" +
"                    </sp:TransportToken>\n" +
"                    <sp:AlgorithmSuite>\n" +
"                        <wsp:Policy>\n" +
"                            <sp:Basic256/>\n" +
"                        </wsp:Policy>\n" +
"                    </sp:AlgorithmSuite>\n" +
"                    <sp:Layout>\n" +
"                        <wsp:Policy>\n" +
"                            <sp:Lax/>\n" +
"                        </wsp:Policy>\n" +
"                    </sp:Layout>\n" +
"                    <sp:IncludeTimestamp/>\n" +
"                </wsp:Policy>\n" +
"            </sp:TransportBinding>\n" +
"            <sp:SignedSupportingTokens\n" +
"                    xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\">\n" +
"                <wsp:Policy>\n" +
"                    <sp:UsernameToken\n" +
"                            sp:IncludeToken=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy/IncludeToken/AlwaysToRecipient\"/>\n" +
"                </wsp:Policy>\n" +
"            </sp:SignedSupportingTokens>\n" +
"        </wsp:All>\n" +
"    </wsp:ExactlyOne>\n" +
"</wsp:Policy>";

    // Extract and decode all the parameters used to call WSRequest
    String uri, pattern, username, password, payload;
    try {
        uri = decode(request.getParameter("uri"));
		pattern = decode(request.getParameter("pattern"));
        username = decode(request.getParameter("username"));
        password = decode(request.getParameter("password"));
        payload = decode(request.getParameter("payload"));
    } catch (Exception e) {
    
      out.write("\n");
      out.write("    location.href = '../error.jsp?errorMsg=");
      out.print(e.getMessage());
      out.write("';\n");
      out.write("    ");

        return;
    }

    Options opts = new Options();
    //stops automatic retrying of the SC
    /*HttpMethodParams methodParams = new HttpMethodParams();
       methodParams.setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
       opts.setProperty(HTTPConstants.HTTP_METHOD_PARAMS, methodParams);*/
    opts.setProperty(HTTPConstants.SO_TIMEOUT, 60 * 1000);
    opts.setProperty(HTTPConstants.CONNECTION_TIMEOUT, 60 * 1000);

    opts.setTo(new EndpointReference(uri));
    String optionsString = CharacterEncoder.getSafeText(request.getParameter("options"));
    if(optionsString != null) {
        String[] options = optionsString.split(",");
        for(String option : options){
            String decoded;
            try {
                decoded = decode(option);
            } catch (Exception e) {
            
      out.write("\n");
      out.write("            location.href = '../error.jsp?errorMsg=");
      out.print(e.getMessage());
      out.write("'\n");
      out.write("            ");

            return;
            }
            String optionName = decoded.split(":")[0];
            String optionValue = decoded.substring(optionName.length() + 1);

            if ("action".equals(optionName)) {
                opts.setAction(optionValue);
            } else if ("useBinding".equals(optionName)) {
                if (optionValue.equalsIgnoreCase("SOAP 1.1")) {
                    opts.setSoapVersionURI(SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI);
                } else if (optionValue.equalsIgnoreCase("SOAP 1.2")) {
                    opts.setSoapVersionURI(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
                } else if (optionValue.equalsIgnoreCase("HTTP")) {
                    opts.setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
                }
            } else if ("useSOAP".equals(optionName)) {
                if (optionValue.equalsIgnoreCase("1.1")) {
                    opts.setSoapVersionURI(SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI);
                } else if ((optionValue.equalsIgnoreCase("1.2")) || (optionValue.equalsIgnoreCase("true"))) {
                    opts.setSoapVersionURI(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
                } else if (optionValue.equalsIgnoreCase("false")) {
                    opts.setProperty(Constants.Configuration.ENABLE_REST, Constants.VALUE_TRUE);
                }
            } else if ("HTTPInputSerialization".equals(optionName)) {
                opts.setProperty(WSDL2Constants.ATTR_WHTTP_INPUT_SERIALIZATION, optionValue);
                opts.setProperty(Constants.Configuration.MESSAGE_TYPE, optionValue);
            } else if ("HTTPQueryParameterSeparator".equals(optionName)) {
                opts.setProperty(WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, optionValue);
            } else if ("HTTPLocation".equals(optionName)) {
                opts.setProperty(WSDL2Constants.ATTR_WHTTP_LOCATION, optionValue);
            } else if ("HTTPMethod".equals(optionName)) {
                if (optionValue.equalsIgnoreCase("GET")) {
                    opts.setProperty(Constants.Configuration.HTTP_METHOD,
                                     Constants.Configuration.HTTP_METHOD_GET);
                } else if (optionValue.equalsIgnoreCase("POST")) {
                    opts.setProperty(Constants.Configuration.HTTP_METHOD,
                                     Constants.Configuration.HTTP_METHOD_POST);
                } else if (optionValue.equalsIgnoreCase("PUT")) {
                    opts.setProperty(Constants.Configuration.HTTP_METHOD,
                                     Constants.Configuration.HTTP_METHOD_PUT);
                } else if (optionValue.equalsIgnoreCase("DELETE")) {
                    opts.setProperty(Constants.Configuration.HTTP_METHOD,
                                     Constants.Configuration.HTTP_METHOD_DELETE);
                }
            } else if ("HTTPLocationIgnoreUncited".equals(optionName)) {
                opts.setProperty(WSDL2Constants.ATTR_WHTTP_IGNORE_UNCITED,
                                JavaUtils.isTrueExplicitly(optionValue));

            } else if ("useWSS".equals(optionName) && JavaUtils.isTrueExplicitly(optionValue)) {
                opts.setUserName(username);
                opts.setPassword(password);
                useWSS = true;
            }
        }
    }

    // Parse
    OMElement payloadElement = null;
    if (payload != null) {
        try {
            payloadElement = XMLUtils.toOM(getSecuredDocumentBuilder(true).
                    parse(new ByteArrayInputStream(payload.getBytes())).getDocumentElement());
        } catch (Exception e) {
            throw new Error("INVALID_INPUT_EXCEPTION. Invalid input was : " + payload);
        }
    }

    //creating service client
    ConfigurationContext configContext = (ConfigurationContext) config.getServletContext()
            .getAttribute(CarbonConstants.CLIENT_CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    opts.setManageSession(true);
    opts.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, request.getHeader("Cookie"));
    ServiceClient sc = new ServiceClient(configContext, null);
    sc.setOptions(opts);

    String body;
    try {
        if (useWSS) {
            sc.engageModule("rampart");
            sc.getServiceContext()
                    .setProperty("rampartPolicy", PolicyEngine.getPolicy(AXIOMUtil.stringToOM(policy)));
        }
        //invoke service
		if(WSDL2Constants.MEP_URI_IN_ONLY.equals(pattern)) {
			sc.fireAndForget(payloadElement);
			body = "<success details=\"in-only operation\"/>";
		} else if(WSDL2Constants.MEP_URI_ROBUST_IN_ONLY.equals(pattern)) {
			sc.sendRobust(payloadElement);
			body = "<success details=\"robust in-only operation\"/>";
		} else {
			OMElement responseMsg = sc.sendReceive(payloadElement);
        	body = responseMsg != null ? responseMsg.toString() : "<success details=\"empty response\"/>";
		}

    } catch (Exception exception) {
        OperationContext operationContext = sc.getLastOperationContext();
        if (operationContext != null) {
            MessageContext messageContext =
                    operationContext.getMessageContext(WSDL2Constants.MESSAGE_LABEL_IN);
            if (messageContext != null) {
                SOAPEnvelope envelope = messageContext.getEnvelope();
                if (envelope != null) {
                    OMElement bodyElement = envelope.getBody().getFirstElement();
                    if(bodyElement != null) {
                        if ("Exception".equals(bodyElement.getLocalName())) {
                            OMNamespace ns = bodyElement.declareNamespace("http://wso2.org/ns/TryitProxy", "http");
                            bodyElement.addAttribute("h:status", "unknown error", ns);
                        }
                        body = bodyElement.toString();
                    } else {
                        body = "<TryitProxyError h:status='unknown error' xmlns:h='http://wso2.org/ns/TryitProxy'/>";
                    }
                } else body = "<TryitProxyError h:status='SOAP envelope error' xmlns:h='http://wso2.org/ns/TryitProxy'>" + exception.toString() + "</TryitProxyError>";
            }  else body = "<TryitProxyError h:status='messageContext error' xmlns:h='http://wso2.org/ns/TryitProxy'>" + exception.toString() + "</TryitProxyError>";
        } else body = "<TryitProxyError h:status='exception' xmlns:h='http://wso2.org/ns/TryitProxy'>" + exception.toString() + "</TryitProxyError>";
    } finally {
        sc.cleanupTransport();
    }

    /*
    // If there is a SOAP fault, we need to serialize that as the body.
    // If there is an HTTP error code, we need to report it using a similar structure.
    if (httpstatus != 20x && soapVer == "0") { // http error
        String httpStatus = "400";
        String httpStatusText = "Test HTTP error";
        body = "<error http:status='" + httpStatus + "' http:statusText='" + httpStatusText + "' xmlns:http='http://wso2.org/ns/WSRequest'>" + body + "</error>";
    }
    */


      out.write('\n');
      out.print( body );
      out.write('\n');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
