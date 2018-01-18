<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
    <!--documents-->
        <div class="row row-offcanvas row-offcanvas-left">
          <div class="col-xs-6 col-sm-3 sidebar-offcanvas"  role="navigation">
            <ul class="list-group panel">
                <li class="list-group-item"><i class="glyphicon glyphicon-align-justify"></i> <b>SIDE PANEL</b></li>
                <li class="list-group-item"><input type="text" class="form-control search-query" placeholder="Search Something"></li>
                <li class="list-group-item"><a href="index.html"><i class="glyphicon glyphicon-home"></i>Dashboard </a></li>
                <!-- <li class="list-group-item"><a href="/rawItems"><i class="glyphicon glyphicon-certificate"></i>raw items </a></li> -->
                
           
                
                 <li>
                  <a href="#demo4" class="list-group-item " data-toggle="collapse"> <i class="glyphicon glyphicon-cutlery"></i>Organic dosa hub<span class="glyphicon glyphicon-chevron-right"></span></a>
                    <li class="collapse" id="demo4">
                      <a href="/rawItems" class="list-group-item"><i class="glyphicon glyphicon-hand-right"></i>raw items</a>
                      <a href="/workers" class="list-group-item"><i class="glyphicon glyphicon-hand-right"></i>workers</a>
                      <a href="/plates" class="list-group-item"><i class="glyphicon glyphicon-hand-right"></i>dosa&idly</a>
                    </li>
                </li>
                <li class="list-group-item"><a href="list.html"><i class="glyphicon glyphicon-th-list"></i>Tables and List </a></li>
                <li class="list-group-item"><a href="forms.html"><i class="glyphicon glyphicon-list-alt"></i>Forms</a></li>
                <li class="list-group-item"><a href="alerts.html"><i class="glyphicon glyphicon-bell"></i>Alerts</li>
                <li class="list-group-item"><a href="timeline.html" ><i class="glyphicon glyphicon-indent-left"></i>Timeline</a></li>
                <li class="list-group-item"><a href="calendars.html" ><i class="glyphicon glyphicon-calendar"></i>Calendars</a></li>
                <li class="list-group-item"><a href="typography.html" ><i class="glyphicon glyphicon-font"></i>Typography</a></li>
                <li class="list-group-item"><a href="footers.html" ><i class="glyphicon glyphicon-minus"></i>Footers</a></li>
                <li class="list-group-item"><a href="panels.html" ><i class="glyphicon glyphicon-list-alt"></i>Panels</a></li>
                <li class="list-group-item"><a href="navs.html" ><i class="glyphicon glyphicon-th-list"></i>Navs</a></li>
                <li class="list-group-item"><a href="colors.html" ><i class="glyphicon glyphicon-tint"></i>Colors</a></li>
                <li class="list-group-item"><a href="flex.html" ><i class="glyphicon glyphicon-th"></i>Flex</a></li>
                <li class="list-group-item"><a href="login.html" ><i class="glyphicon glyphicon-lock"></i>Login</a></li>
                <li>
                  <a href="#demo3" class="list-group-item " data-toggle="collapse">Item 3  <span class="glyphicon glyphicon-chevron-right"></span></a>
                  <div class="collapse" id="demo3">
                    <a href="#SubMenu1" class="list-group-item" data-toggle="collapse">Subitem 1  <span class="glyphicon glyphicon-chevron-right"></span></a>
                    <div class="collapse list-group-submenu" id="SubMenu1">
                      <a href="#" class="list-group-item">Subitem 1 a</a>
                      <a href="#" class="list-group-item">Subitem 2 b</a>
                      <a href="#SubSubMenu1" class="list-group-item" data-toggle="collapse">Subitem 3 c <span class="glyphicon glyphicon-chevron-right"></span></a>
                      <div class="collapse list-group-submenu list-group-submenu-1" id="SubSubMenu1">
                        <a href="#" class="list-group-item">Sub sub item 1</a>
                        <a href="#" class="list-group-item">Sub sub item 2</a>
                      </div>
                      <a href="#" class="list-group-item">Subitem 4 d</a>
                    </div>
                    <a href="javascript:;" class="list-group-item">Subitem 2</a>
                    <a href="javascript:;" class="list-group-item">Subitem 3</a>
                  </div>
                </li>
                <li>
                  <a href="#demo4" class="list-group-item " data-toggle="collapse">Item 4  <span class="glyphicon glyphicon-chevron-right"></span></a>
                    <li class="collapse" id="demo4">
                      <a href="" class="list-group-item">Subitem 1</a>
                      <a href="" class="list-group-item">Subitem 2</a>
                      <a href="" class="list-group-item">Subitem 3</a>
                    </li>
                </li>
              </ul>
          </div>
          </div>
          