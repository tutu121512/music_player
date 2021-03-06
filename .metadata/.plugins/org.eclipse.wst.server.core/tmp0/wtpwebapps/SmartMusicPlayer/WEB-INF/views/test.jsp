<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
1 사용자 메인
	1.1 공지사항　：　데이터베이스의　중요한　공지사항을　볼　수　있는　곳
		1.1.1 공지한 사람의 사진, 부서, 직책, 이름 표시
		1.1.2 공지 메인 제목, 간략한 내용, 공지 일지 표시
	1.2 최근 작업 내역
		1.2.1 최근 10건의 작업 내역 표시
		1.2.2 디비 종류, 실행한 쿼리(DDL, DML 등), 작동 여부 (차단, 실행 등) 강조 효과
		1.2.3 내용 별, 부서 별, DB별로 정렬 가능 
	1.3 접근 가능한 디비 및 권한
		1.3.1 현재 접근 가능한 디비의 목록 표시（디비종류，날짜，디비이름）
		1.3.2 해당 디비에 관하여 （승인 대기 중인 문서, 승인된 문서, 반려된 문서의 갯수）를 표시
		1.3.3 갯수를 클릭하면 해당　문서에　대한(권한, 종류, 사용 기간, 신청자, 신청 사유, 신청일)　확인　가능
