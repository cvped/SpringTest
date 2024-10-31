package com.cvped.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test01Controller {

	@ResponseBody
	@RequestMapping("/lifecycle/test01/1")
	public String stringresponse() {
		return "<h2>테스트 프로젝트 완성";
	}
}
