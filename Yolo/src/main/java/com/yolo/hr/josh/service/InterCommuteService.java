package com.yolo.hr.josh.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yolo.hr.josh.model.CommuteVO;

public interface InterCommuteService {

	// 출근 메소드
	int commuteStart(String fk_empno);

	// 출근했는지 확인하는 메소드
	CommuteVO checkCommute(String fk_empno);

	// 퇴근 메소드
	int commuteEnd(Map<String, String> paraMap);

	// 특정사원의 일주일 출근기록을 가져오는 메소드
	List<CommuteVO> mycommute(Map<String, String> paraMap);

	// 사원들의 근무기록을 가져오는 메소드
	List<HashMap<String, String>> totalCommuteList(Map<String, Object> paraMap);

	// 급여정산 후에 리스트 불러오기
	List<HashMap<String, String>> getPaymentList(Map<String, Object> paraMap);

	// 급여정보 보내서 insert 하기
	int checkedPayment(List<Map<String, Object>> paraList);

	// 급여명세서 불러오는 메소드
	List<Map<String, String>> getPayStubList(Map<String, Object> paraMap);

}
