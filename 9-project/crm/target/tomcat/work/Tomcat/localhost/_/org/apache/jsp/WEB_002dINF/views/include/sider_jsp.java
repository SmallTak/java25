/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-07 06:59:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sider_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:startsWith", org.apache.taglibs.standard.functions.Functions.class, "startsWith", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- 左侧菜单栏 -->\r\n");
      out.write("  <aside class=\"main-sidebar\">\r\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("      \r\n");
      out.write("      <!-- 搜索表单，不需要删除即可 -->\r\n");
      out.write("      <!--<form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("              <span class=\"input-group-btn\">\r\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>-->\r\n");
      out.write("      <!-- /.search form -->\r\n");
      out.write("      <!-- 菜单 -->\r\n");
      out.write("      <ul class=\"sidebar-menu\">\r\n");
      out.write("      \t<!-- 首页 -->\r\n");
      out.write("        <li class=\"treeview ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'home' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("          <a href=\"/account/home\">\r\n");
      out.write("            <i class=\"fa fa-home\"></i> <span>首页</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"header\">系统功能</li>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 客户管理 -->\r\n");
      out.write("        <li class=\"treeview ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:startsWith(param.param,'customer_') ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-address-book-o\"></i> <span>客户管理</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'customer_my' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><a href=\"/customer/my/list\"><i class=\"fa fa-circle-o\"></i> 我的客户</a></li>\r\n");
      out.write("            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'customer_public' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><a href=\"/customer/public/list\"><i class=\"fa fa-circle-o\"></i> 公海客户</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- 工作记录 -->\r\n");
      out.write("        <li class=\"treeview ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:startsWith(param.param,'work_record_') ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-bars\"></i> <span>销售机会</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'work_record_my' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><a href=\"/sale/my/list\"><i class=\"fa fa-circle-o\"></i> 我的机会</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- 待办事项 -->\r\n");
      out.write("        <li class=\"treeview ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:startsWith(param.param,'task') ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("          <a href=\"/task/list\">\r\n");
      out.write("            <i class=\"fa fa-calendar\"></i> <span>待办事项</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 统计报表 -->\r\n");
      out.write("        <li class=\"treeview ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:startsWith(param.param,'charts') ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <i class=\"fa fa-pie-chart\"></i> <span>统计报表</span>\r\n");
      out.write("            <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"treeview-menu\">\r\n");
      out.write("            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'charts_demo' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><a href=\"/charts/demo\"><i class=\"fa fa-circle-o\"></i> 静态报表</a></li>\r\n");
      out.write("            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'charts_level' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><a href=\"/charts/level\"><i class=\"fa fa-circle-o\"></i> 客户统计</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <li><a href=\"/disk/home\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'disk_home' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  ><i class=\"fa fa-share-alt\"></i> <span>公司网盘</span></a></li>\r\n");
      out.write("        <li class=\"header ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.param == 'account' ? 'active' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">系统管理</li>\r\n");
      out.write("        <!-- 部门员工管理 -->\r\n");
      out.write("        <li ><a href=\"/account/list\"><i class=\"fa fa-users\"></i> <span>员工管理</span></a></li>\r\n");
      out.write("        <!--<li><a href=\"#\"><i class=\"fa fa-circle-o text-yellow\"></i> <span>Warning</span></a></li>\r\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-circle-o text-aqua\"></i> <span>Information</span></a></li>-->\r\n");
      out.write("      </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <!-- =============================================== -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
