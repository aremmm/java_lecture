<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
	int sum = 0;
	for(int i=1; i<11; i++){
		sum +=i;
	}
	out.println("1부터 10까지 더한 값: "+sum);
%>

<c:set var="sum" value="0" />
<c:forEach var="i" begin="1" end="10" step="1" ><!-- 1부터 10까지에서 1씩 증가. -->
	<c:set var="sum" value="${sum+i }" /> 
</c:forEach>
1부터 10까지 더한 값: ${sum }

<hr/>

집합체 반복문

<%
	int[] k = {1,2,3,4,5,6,7};
	int summ=0;
	for(int i : k ){
		summ = sum+i;
	}
	out.println("{1,2,3,4,5,6,7} 더한 값: "+summ);
%>
<hr/>

<c:set var="k" value="1,2,3,4,5,6,7" />
<c:set var="summ" value="0" />
<c:forEach var="i" items="${k }" >
	<c:set var="sum" value="${summ+i }" />
</c:forEach>
{1,2,3,4,5,6,7} 더한 값: ${summ }

<!-- 231228(thu) -->