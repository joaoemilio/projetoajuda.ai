/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2019-10-02 06:15:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ds;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.dataservices.ui.beans.Config;
import java.util.ArrayList;
import java.util.Iterator;

public final class dataSources_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1563972902000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1563972902000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      boolean _jspx_th_fmt_005fbundle_005f0_reused = false;
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /ds/dataSources.jsp(25,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.dataservices.ui.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fbundle_005f0);
          }
          do {
            out.write('\n');
            //  carbon:breadcrumb
            org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_005fbreadcrumb_005f0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
            boolean _jspx_th_carbon_005fbreadcrumb_005f0_reused = false;
            try {
              _jspx_th_carbon_005fbreadcrumb_005f0.setPageContext(_jspx_page_context);
              _jspx_th_carbon_005fbreadcrumb_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
              // /ds/dataSources.jsp(26,0) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setLabel("Datasources");
              // /ds/dataSources.jsp(26,0) name = resourceBundle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setResourceBundle("org.wso2.carbon.dataservices.ui.i18n.Resources");
              // /ds/dataSources.jsp(26,0) name = topPage type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setTopPage(false);
              // /ds/dataSources.jsp(26,0) name = request type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_carbon_005fbreadcrumb_005f0.setRequest(request);
              int _jspx_eval_carbon_005fbreadcrumb_005f0 = _jspx_th_carbon_005fbreadcrumb_005f0.doStartTag();
              if (_jspx_th_carbon_005fbreadcrumb_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fcarbon_005fbreadcrumb_0026_005ftopPage_005fresourceBundle_005frequest_005flabel_005fnobody.reuse(_jspx_th_carbon_005fbreadcrumb_005f0);
              _jspx_th_carbon_005fbreadcrumb_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_carbon_005fbreadcrumb_005f0, _jsp_getInstanceManager(), _jspx_th_carbon_005fbreadcrumb_005f0_reused);
            }
            out.write('\n');
            org.wso2.carbon.dataservices.ui.beans.Data dataService = null;
            synchronized (session) {
              dataService = (org.wso2.carbon.dataservices.ui.beans.Data) _jspx_page_context.getAttribute("dataService", javax.servlet.jsp.PageContext.SESSION_SCOPE);
              if (dataService == null){
                dataService = new org.wso2.carbon.dataservices.ui.beans.Data();
                _jspx_page_context.setAttribute("dataService", dataService, javax.servlet.jsp.PageContext.SESSION_SCOPE);
              }
            }
            out.write("\n");
            out.write("<script type=\"text/javascript\" src=\"js/ui-validations.js\"></script>\n");

    boolean finishEnable = false;


            out.write("\n");
            out.write("\n");
            out.write("\n");
            out.write("<div id=\"middle\">\n");
            out.write("<h2>");
            if (_jspx_meth_fmt_005fmessage_005f0(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</h2>\n");
            out.write("\t<div id=\"workArea\">\n");
            out.write("\t<form method=\"post\" action=\"queries.jsp\" name=\"dataForm\"\n");
            out.write("\t\tonsubmit=\"return validateDataSourcesForm();\">\n");
            out.write("        <table class=\"styledLeft\" id=\"datasource-table\">\n");
            out.write("            ");

                ArrayList<Config> configs = dataService.getConfigs();
                if (configs != null && configs.size() > 0) {
                    String configId = null;
            
            out.write("\n");
            out.write("            <thead>\n");
            out.write("            <tr>\n");
            out.write("                <th width=\"20%\">");
            if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("                ");
            out.write("\n");
            out.write("                <th width=\"60%\">");
            if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</th>\n");
            out.write("            </tr>\n");
            out.write("            </thead>\n");
            out.write("            <tbody>\n");
            out.write("\n");
            out.write("            ");

                Iterator iterator = configs.iterator();
                while (iterator.hasNext()) {
                    Config dsConfig = (Config) iterator.next();
                    if (dsConfig != null) {
                        finishEnable = true;
                        configId = dsConfig.getId();
            
            out.write("\n");
            out.write("\n");
            out.write("            <tr>\n");
            out.write("                <td>");
            out.print(configId);
            out.write("\n");
            out.write("                </td>\n");
            out.write("                <input type=\"hidden\" id=\"");
            out.print(configId);
            out.write("\" name=\"configId\" value=\"");
            out.print(configId);
            out.write("\" />\n");
            out.write("                ");
            out.write("\n");
            out.write("                ");
            out.write("\n");
            out.write("                <td>\n");
            out.write("                    <a class=\"icon-link\" style=\"background-image:url(../admin/images/edit.gif);\" href=\"addDataSource.jsp?flag=edit&configId=");
            out.print(configId);
            out.write('"');
            out.write('>');
            if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("                    <a class=\"icon-link\" style=\"background-image:url(../admin/images/delete.gif);\" onclick=\"deleteDatasource(document.getElementById('");
            out.print(configId);
            out.write("').value);\" href=\"#\">");
            if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("                </td>\n");
            out.write("            </tr>\n");
            out.write("\n");
            out.write("            ");

                        }
                    }
                }
            
            out.write("\n");
            out.write("            <tr>\n");
            out.write("                <td colspan=\"2\">\n");
            out.write("                    <a class=\"icon-link\" style=\"background-image:url(../admin/images/add.gif);\"\n");
            out.write("                       href=\"addDataSource.jsp\">");
            if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("</a>\n");
            out.write("                </td>\n");
            out.write("            </tr>\n");
            out.write("            <tr>\n");
            out.write("                <td class=\"buttonRow\" colspan=\"2\"><input class=\"button\" type=\"button\" value=\"< ");
            if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\" onclick=\"location.href = 'serviceDetails.jsp?flag=back' \"/>\n");
            out.write("                                                         ");
            out.write("\n");
            out.write("                    <input class=\"button\" type=\"submit\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f7(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write(" >\"/>\n");
            out.write("                    ");
 if(finishEnable){ 
            out.write("\n");
            out.write("                        <input class=\"button\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\" onclick=\"location.href = 'wizardDoneProcessor.jsp'\"/>\n");
            out.write("                        <input class=\"button\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f9(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\" onclick=\"location.href = 'wizardDoneProcessor.jsp?flag=wip'\"/>\n");
            out.write("                    ");
 }else{ 
            out.write("\n");
            out.write("                        <input class=\"button\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f10(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\" disabled=\"disabled\"  onclick=\"location.href = 'wizardDoneProcessor.jsp'\"/>\n");
            out.write("                    ");
 } 
            out.write("\n");
            out.write("                    <input\n");
            out.write("                            class=\"button\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_005fmessage_005f11(_jspx_th_fmt_005fbundle_005f0, _jspx_page_context))
              return;
            out.write("\"\n");
            out.write("                            onclick=\"location.href = '../service-mgt/index.jsp'\"/></td>\n");
            out.write("            </tr>\n");
            out.write("            </tbody>\n");
            out.write("        </table>\n");
            out.write("    </form>\n");
            out.write("\t</div>\n");
            out.write("\t</div>\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        _jspx_th_fmt_005fbundle_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fbundle_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fbundle_005f0_reused);
      }
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(40,4) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("datasources.heading");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      _jspx_th_fmt_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(52,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("datasource.name");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      _jspx_th_fmt_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(54,32) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("actions");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      _jspx_th_fmt_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(75,155) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("edit.datasource");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      _jspx_th_fmt_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f3, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(77,184) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("delete.datasource");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      _jspx_th_fmt_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f4, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(90,48) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("add.new.datasource");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      _jspx_th_fmt_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f5, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(95,95) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("back");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      _jspx_th_fmt_005fmessage_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f6, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(97,63) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("next");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
      _jspx_th_fmt_005fmessage_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f7, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(99,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("finish");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
      _jspx_th_fmt_005fmessage_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f8, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f9_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(100,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f9.setKey("save.as.draft");
      int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
      _jspx_th_fmt_005fmessage_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f9, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f10_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(102,67) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f10.setKey("finish");
      int _jspx_eval_fmt_005fmessage_005f10 = _jspx_th_fmt_005fmessage_005f10.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f10);
      _jspx_th_fmt_005fmessage_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f10, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fbundle_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f11_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
      // /ds/dataSources.jsp(105,64) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f11.setKey("cancel");
      int _jspx_eval_fmt_005fmessage_005f11 = _jspx_th_fmt_005fmessage_005f11.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f11);
      _jspx_th_fmt_005fmessage_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f11, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f11_reused);
    }
    return false;
  }
}
