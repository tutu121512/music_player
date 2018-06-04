<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>SMu</title>

<!-- common Import -->
<link rel="stylesheet" href="/resources/css/jquery.mobile-1.4.5.css">
<link rel="stylesheet" href="/resources/css/audioplayer.css">
<link rel="stylesheet" href="/resources/css/font-awesome-4.2.0/css/font-awesome.min.css">
<!-- <script src="/resources/js/jquery.js"></script>  -->
<script src="/resources/js/jquery-2.2.1.min.js"></script>  
<script src="/resources/js/jquery.mobile-1.4.5.js"></script>
<script src="/resources/js/audioplayer.js"></script>
<style>
header, footer {background-color: #ffc3c3!important; color: white!important}
footer {position: fixed!important; width: 100%; top: calc(100% - 80px); height: 80px}
i{color: #c07575}
.search {text-align: right; padding: 0.7em}
.sub_title {background-color: #ffc3c3; padding: 0.7em; color: white}
.btn_line {text-align: right}
.music_list {padding: 2px} 
.content > div:nth-child(even) {background-color: #c0777733}
.content > div:nth-child(2) {height: 100px}
.music_list > table {width: 100%; height: 100%; font-size: 0.8em; border-spacing: 0px}
.list_f > th:nth-child(1){width: 22px}
.list_f > th:nth-child(2){width: 44px}
.list_f > th:nth-child(3){text-align: left; padding-left:0.6em}
.list_f > th:nth-child(4){width: 20px}
.list_f > th:nth-child(5){width: 30px}
.list_f > th:nth-child(6){width: 30px}
.list_f > th:nth-child(6) > font{font-size: 0.9em}
.list_f > th:nth-child(7){width: 30px}
.list_s > th:nth-child(1){text-align: left; padding-left:0.6em; font-size: 0.9em; color: #00000099}
.list_s > th:nth-child(2){width: 30px}
.now_play_list .list_f > th:nth-child(4){width: 30px}
.play_count {background-color: #C07575}
.now_play_list {color: white!important;}
.now_play_list i {color: white}
.album_preview {height: 40px; width: 40px}
.lyrics,.play_count {margin: 0; padding: 4px; font-size: 10px}
.play-btn {cursor: pointer}
</style>
<script>
$(document).ready(function(){
	$(document).on("click", ".play-btn", function() {
		var htmlcode = "<audio id='play_music' preload='none' controls='' style='width: 0px; height: 0px; visibility: hidden;'>"
					 + "<source src='"+$(this).attr("id")+"' type='audio/mpeg'> </audio>";
	 	$("#play_th").empty();
		$("#play_th").append(htmlcode);
		$('audio').audioPlayer();
		$(".audioplayer-playpause").trigger( "click" );
	})
})
</script>
</head>
<body>
<section id="page1" data-role="page">
	<header data-role="header" style='text-align:center'><img src='/resources/img/logo_long.png' style='height:60px;'></header>
	<div class='search'><i class='fa fa-search fa-lg'></i></div>
	<div class='content'>
		<div class='sub_title'> </div>
		<div class='music_list'>
		</div>
		<% 
			String song_title[] = {"위아래", "Touch my body", "Trouble Maker", "노래가 뭐있지?", "빨간맛", "노래 제목입니다.", "와인",
									"어짜피 한번은 아파야해", "Cheer up", "사랑이 아프다"};
			String song_artist[] = {"이엑스아이디", "씨스타", "현아", "로꼬", "레드벨벳", "리미스터", "카그모", "유승은", "트와이스", "손진영"};
			for (int i=1; i<=10; i++) {
		%>
		<div class='music_list'>
			<table>
				<tbody><tr class='list_f'><th rowspan='2'> <i class='fa fa-star-o fa-lg'></i>
				</th><th rowspan='2'> <img class='album_preview' src="/resources/img/<%=i %>.jpg">
				</th><th> <font><%=song_title[i-1] %></font>
				</th><th rowspan='2' style='font-size: 0.6em'> 12.6 MB
				</th><th rowspan='2'>
					<i class='fa fa-play-circle fa-2x play-btn' id="/resources/music/<%=i %>.ogg">
					</i> 
				</th><th> <font>가사 O</font>
				</th><th rowspan='2'> <i class='fa fa-th-large fa-2x'></i>
				</th></tr>
				<tr class='list_s'><th> <%=song_artist[i-1] %>
				</th><th> <button class='play_count'>25play</button>
				</th></tr></tbody>
			</table>
		</div>
		<% 
			} 
		%>
		<div style='height: 80px'></div>
	</div>
	<footer data-role="footer">
		<div class='music_list'>
			<table class='now_play_list'>
				<tbody><tr class='list_f'><th rowspan='2'> <i class='fa fa-star-o fa-lg'></i> 
				</th><th rowspan='2'> <img class='album_preview' src="/resources/img/2.jpg">
				</th><th rowspan='2' id='play_th'>
					<audio id='play_music' preload="none" controls="" style="width: 0px; height: 0px; visibility: hidden;">
						<source src="/resources/music/4.ogg" type="audio/ogg">
					</audio>
					<script>
						$(document).ready(function(){
							$('audio').audioPlayer();
						})
					</script>
				</th><th rowspan='2'> <i class='fa fa-backward fa-lg'></i>
				</th><th rowspan='2'> <i class='fa fa-pause fa-lg'></i>
				</th><th rowspan='2'> <i class='fa fa-forward fa-lg'></i>
				</th></tr></tbody>
			</table>
		</div>
	</footer>
</section>

</body>
</html>