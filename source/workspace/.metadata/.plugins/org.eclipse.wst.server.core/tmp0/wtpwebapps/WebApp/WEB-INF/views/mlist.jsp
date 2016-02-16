<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/list.css">
<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/list_item.css"> --%>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	
<title>Musical Tube</title>

</head>
<body>

<div data-role="page" id="pageone">
  <div data-role="panel" id="myPanel" width="100px"> 
    <ul>노래방책</a></ul>
    <ul><blockquote><a href="song_t">= 태진</a></blockquote></ul>
    <ul><blockquote><a href="song_k">= 금영</a></blockquote></ul>
    <ul>공연 실황</ul>
    <ul><blockquote><a href="song_t">= 한글자막</a></blockquote></ul>
    <ul><blockquote><a href="song_k">= 한국어</a></blockquote></ul>
    <ul><blockquote><a href="song_k">= 외국어</a></blockquote></ul>
  </div> 

  <div data-role="header">
  <a href="#myPanel" class="ui-btn ui-shadow ui-corner-all ui-icon-bars ui-btn-icon-notext">Open Panel</a>
    <h1>공연실황(한글자막)</h1>
  </div>

  <div data-role="main" class="ui-content">
   <!--  <font size="60%">뮤지컬 풀공연</font>
	<hr size="1px" color="#eeeeee"> -->
	<a href="detail" class="no-uline">
		<table>
			<tr>
				<td>
					<div class="thumnail"
						style="background-image: url(http://img.youtube.com/vi/fD39Mi2bMdE/mqdefault.jpg)"></div>
				</td>

				<td valign="top" style="padding: 10px;">
					<font class="font_title">노트르담 드 파리(노트르담의 꼽추)</font><br /> 
					<font class="font_title_original">Notre-Dame de Paris</font><br /> <br /> 
					<font class="font_title_desc">1998 | 프랑스 | 불어 | 송쓰루 | 한글자막</font><br />
				</td>
			</tr>
		</table>
		<hr size="1px" color="#eeeeee">
	</a>
	
	<a href="detail2" class="no-uline">
		<table>
			<tr>
				<td>
					<div class="thumnail"
						style="background-image: url(http://img.youtube.com/vi/VX3KqOH2YFI/mqdefault.jpg)"></div>
				</td>

				<td valign="top" style="padding: 10px;">
					<font class="font_title">로미오와 줄리엣</font><br /> 
					<font class="font_title_original">Romeo et juliette</font><br /> <br /> 
					<font class="font_title_desc">2010 | 프랑스 | 불어 | 한글자막</font><br />
				</td>
			</tr>
		</table>
		<hr size="1px" color="#eeeeee">
	</a>
    
  </div>

  <div data-role="footer">
    <p align="center"><font size="2">Since 2015. © Mureka</font></p>
  </div> 
</div> 


	
</body>
</html>

