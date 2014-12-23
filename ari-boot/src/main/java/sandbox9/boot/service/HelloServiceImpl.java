package sandbox9.boot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String greeting() {
		return "Hello Other Base Package Service";
	}

}
