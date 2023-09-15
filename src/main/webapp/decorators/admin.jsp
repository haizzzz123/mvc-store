<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        
        <link href="<c:url value='/template/admin/css/styles.css' />"  rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
        
        
    </head>
    <body class="sb-nav-fixed">
    
        <%@ include file="/common/admin/header.jsp" %>
        
        
        <div id="layoutSidenav">
        	
        	<%@ include file="/common/admin/menu.jsp" %>
        	
            <div id="layoutSidenav_content">
            
           		<dec:body/>
                
                <%@ include file="/common/admin/footer.jsp" %>
            </div>
        </div>
        <script src="<c:url value='/template/admin/paging/jquery.twbsPagination.js' />"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value='/template/admin/js/scripts.js' />" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value='/template/admin/assets/demo/chart-area-demo.js'/>" ></script>
        <script src="<c:url value='/template/admin/assets/demo/chart-bar-demo.js'/>" ></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
        <script src="<c:url value='/template/admin/js/datatables-simple-demo.js'/>" ></script>
    </body>
</html>
