<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 상세</title>


</head>
<body>
<div id="wrap">
    <div id="container">
        <div class="inner">    
            <h2>게시글 상세</h2>
            <form id="boardForm" name="boardForm">        
                <table width="100%" class="table01">
                    <colgroup>
                        <col width="15%">
                        <col width="35%">
                        <col width="15%">
                        <col width="*">
                    </colgroup>
                    <tbody id="tbody">
                    
                       <tr>
                       	<td>${boardlist.board_subject }
                       	</td>
                       	<td>${boardlist.board_content }
                       	</td>
                       	<td>${boardlist.board_writer }
                       	</td>
                       </tr>
                    </tbody>
                </table>        
                <input type="hidden" id="board_seq"        name="board_seq"    value="${boardSeq}"/> <!-- 게시글 번호 -->
                <input type="hidden" id="search_type"    name="search_type"     value="S"/> <!-- 조회 타입 - 상세(S)/수정(U) -->
            </form>
           
        </div>
    </div>
</div>
</body>
</html>
 
