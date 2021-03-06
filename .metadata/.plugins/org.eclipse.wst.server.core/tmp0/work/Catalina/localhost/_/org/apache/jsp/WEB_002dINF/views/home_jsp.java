/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2018-06-04 09:57:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>SMu</title>\n");
      out.write("\n");
      out.write("<!-- common Import -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/jquery.mobile-1.4.5.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/audioplayer.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/font-awesome-4.2.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"/resources/js/jquery.js\"></script> \n");
      out.write("<script src=\"/resources/js/jquery.mobile-1.4.5.js\"></script>\n");
      out.write("<script src=\"/resources/js/audioplayer.js\"></script>\n");
      out.write("<style>\n");
      out.write("header, footer {background-color: #C07575!important; color: white!important}\n");
      out.write("footer {position: fixed!important; width: 100%; top: calc(100% - 80px); height: 80px}\n");
      out.write("i{color: #c07575}\n");
      out.write(".search {text-align: right; padding: 0.7em}\n");
      out.write(".sub_title {background-color: #C07575; padding: 0.7em; color: white}\n");
      out.write(".btn_line {text-align: right}\n");
      out.write(".music_list {padding: 2px} \n");
      out.write(".content > div:nth-child(even) {background-color: #c0777733}\n");
      out.write(".content > div:nth-child(2) {height: 100px}\n");
      out.write(".music_list > table {width: 100%; height: 100%; font-size: 0.8em; border-spacing: 0px}\n");
      out.write(".list_f > th:nth-child(1){width: 22px}\n");
      out.write(".list_f > th:nth-child(2){width: 44px}\n");
      out.write(".list_f > th:nth-child(3){text-align: left; padding-left:0.6em}\n");
      out.write(".list_f > th:nth-child(4){width: 20px}\n");
      out.write(".list_f > th:nth-child(5){width: 30px}\n");
      out.write(".list_f > th:nth-child(6){width: 30px}\n");
      out.write(".list_f > th:nth-child(6) > font{font-size: 0.9em}\n");
      out.write(".list_f > th:nth-child(7){width: 30px}\n");
      out.write(".list_s > th:nth-child(1){text-align: left; padding-left:0.6em; font-size: 0.9em; color: #00000099}\n");
      out.write(".list_s > th:nth-child(2){width: 30px}\n");
      out.write(".now_play_list .list_f > th:nth-child(4){width: 30px}\n");
      out.write(".play_count {background-color: #C07575}\n");
      out.write(".now_play_list {color: white!important;}\n");
      out.write(".now_play_list i {color: white}\n");
      out.write(".album_preview {height: 40px; width: 40px}\n");
      out.write(".lyrics,.play_count {margin: 0; padding: 4px; font-size: 10px}\n");
      out.write(".play-btn {cursor: pointer}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(document).on(\"click\", \".play-btn\", function() {\n");
      out.write("\t\tvar htmlcode = \"<audio id='play_music' preload='none' controls='' style='width: 0px; height: 0px; visibility: hidden;'>\"\n");
      out.write("\t\t\t\t\t + \"<source src='\"+$(this).attr(\"id\")+\"' type='audio/mpeg'> </audio>\";\n");
      out.write("\t \t$(\"#play_th\").empty();\n");
      out.write("\t\t$(\"#play_th\").append(htmlcode);\n");
      out.write("\t\t$('audio').audioPlayer();\n");
      out.write("\t\t$(\".audioplayer-playpause\").trigger( \"click\" );\n");
      out.write("\t})\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<section id=\"page1\" data-role=\"page\">\n");
      out.write("\t<header data-role=\"header\"><h1>SMu</h1></header>\n");
      out.write("\t<div class='search'><i class='fa fa-search fa-lg'></i></div>\n");
      out.write("\t<div class='content'>\n");
      out.write("\t\t<div class='sub_title'> </div>\n");
      out.write("\t\t<div class='music_list'>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
 
			String song_title[] = {"위아래", "Touch my body", "Trouble Maker", "노래가 뭐있지?", "빨간맛", "노래 제목입니다.", "와인",
									"어짜피 한번은 아파야해", "Cheer up", "사랑이 아프다"};
			String song_artist[] = {"이엑스아이디", "씨스타", "현아", "로꼬", "레드벨벳", "리미스터", "카그모", "유승은", "트와이스", "손진영"};
			for (int i=1; i<=10; i++) {
		
      out.write("\n");
      out.write("\t\t<div class='music_list'>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tbody><tr class='list_f'><th rowspan='2'> <i class='fa fa-star-o fa-lg'></i>\n");
      out.write("\t\t\t\t</th><th rowspan='2'> <img class='album_preview' src=\"/resources/img/");
      out.print(i );
      out.write(".jpg\">\n");
      out.write("\t\t\t\t</th><th> <font>");
      out.print(song_title[i-1] );
      out.write("</font>\n");
      out.write("\t\t\t\t</th><th rowspan='2' style='font-size: 0.6em'> 12.6 MB\n");
      out.write("\t\t\t\t</th><th rowspan='2'>\n");
      out.write("\t\t\t\t\t<i class='fa fa-play-circle fa-2x play-btn' id=\"/resources/music/");
      out.print(i );
      out.write(".ogg\">\n");
      out.write("\t\t\t\t\t</i> \n");
      out.write("\t\t\t\t</th><th> <font>가사 O</font>\n");
      out.write("\t\t\t\t</th><th rowspan='2'> <i class='fa fa-th-large fa-2x'></i>\n");
      out.write("\t\t\t\t</th></tr>\n");
      out.write("\t\t\t\t<tr class='list_s'><th> ");
      out.print(song_artist[i-1] );
      out.write("\n");
      out.write("\t\t\t\t</th><th> <button class='play_count'>25play</button>\n");
      out.write("\t\t\t\t</th></tr></tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
 
			} 
		
      out.write("\n");
      out.write("\t\t<div style='height: 80px'></div>\n");
      out.write("\t</div>\n");
      out.write("\t<footer data-role=\"footer\">\n");
      out.write("\t\t<div class='music_list'>\n");
      out.write("\t\t\t<table class='now_play_list'>\n");
      out.write("\t\t\t\t<tbody><tr class='list_f'><th rowspan='2'> <i class='fa fa-star-o fa-lg'></i> \n");
      out.write("\t\t\t\t</th><th rowspan='2'> <img class='album_preview' src=\"/resources/img/2.jpg\">\n");
      out.write("\t\t\t\t</th><th rowspan='2' id='play_th'>\n");
      out.write("\t\t\t\t\t<audio id='play_music' preload=\"none\" controls=\"\" style=\"width: 0px; height: 0px; visibility: hidden;\">\n");
      out.write("\t\t\t\t\t\t<source src=\"/resources/music/4.ogg\" type=\"audio/ogg\">\n");
      out.write("\t\t\t\t\t</audio>\n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t\t\t\t$('audio').audioPlayer();\n");
      out.write("\t\t\t\t\t\t})\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t</th><th rowspan='2'> <i class='fa fa-backward fa-lg'></i>\n");
      out.write("\t\t\t\t</th><th rowspan='2'> <i class='fa fa-pause fa-lg'></i>\n");
      out.write("\t\t\t\t</th><th rowspan='2'> <i class='fa fa-forward fa-lg'></i>\n");
      out.write("\t\t\t\t</th></tr></tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
